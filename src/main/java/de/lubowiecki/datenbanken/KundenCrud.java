package de.lubowiecki.datenbanken;

// ORM Objekt-Relationales-Mapping: Übersetzt Relationale Daten aus der Datenbank in Java Objekte
// und umgekehrt

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// CRUD = Create Read Update Delete
public class KundenCrud {

    private final String TABLE = "kunden";

    public List<Kunde> findAll() throws SQLException {

        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            ResultSet daten = stmt.executeQuery("SELECT * FROM " + TABLE);

            List<Kunde> kunden = new ArrayList<>();
            while(daten.next()) {
                kunden.add(create(daten));
            }
            return kunden;
        }
    }

    // Bei Methoden, wo es vorkommen kann, dass nichts passendes zurückgegeben werden kann
    // verwendet man lieber ein Optional statt null
    public Optional<Kunde> findById(int id) throws SQLException {

        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            ResultSet daten = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE id = " + id);

            if(daten.next()) {
                return Optional.of(create(daten)); // Optional von Kunde
            }
            return Optional.empty(); // Leeres Optional, wenn kein Kunde gefunden
        }
    }

    public boolean insert(Kunde kunde) throws SQLException {

        // Hier ist eine SQL-Injection möglich
//        try(Connection verbindung = DbUtility.getConnection();
//            Statement stmt = verbindung.createStatement()) {
//
//            // INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(NULL, 'Bruce', 'Banner')
//            final String SQL = "INSERT INTO " + TABLE + " (vorname, nachname) " +
//                                    "VALUES('%s', '%s')"; // %s ist ein Platzhalter für einen String
//
//            // executeUpdate liefert die Anzahl der Zeilen die geändert/hinzugefügt wurden
//            return stmt.executeUpdate(String.format(SQL, kunde.getVorname(), kunde.getNachname())) > 0; // Das Einfügen ist ein Update des Inhalts einer Tabelle
//        }

        // Sicher gegen SQL-Injection

        final String SQL = "INSERT INTO " + TABLE + " (vorname, nachname) VALUES(?, ?)";

        // prepareStatement(SQL) : Übergibt ein Template für den Befehl an die Datenbank
        // Daten für ? werden später nur als Daten und nicht als Befehle interpretiert
        try(Connection verbindung = DbUtility.getConnection();
            PreparedStatement stmt = verbindung.prepareStatement(SQL)) {

            // Die Fragezeichen im Template werden durch konkrete Werte ersetzt
            stmt.setString(1, kunde.getVorname()); // 1 ist die Nr. des ?
            stmt.setString(2, kunde.getNachname());

            // Stringinhalte die, die ? ersetzen werden NIE als Befehle ausgewertet

            return stmt.executeUpdate() > 0;
        }
    }

    public boolean update(Kunde kunde) throws SQLException {

        final String SQL = "UPDATE " + TABLE + " SET vorname = ?, nachname = ?, aktiv = ? WHERE id = ?";

        try(Connection verbindung = DbUtility.getConnection();
            PreparedStatement stmt = verbindung.prepareStatement(SQL)) {

            // Die Fragezeichen im Template werden durch konkrete Werte ersetzt
            stmt.setString(1, kunde.getVorname()); // 1 ist die Nr. des ?
            stmt.setString(2, kunde.getNachname());
            stmt.setBoolean(3, kunde.isAktiv());
            stmt.setInt(4, kunde.getId());

            // Stringinhalte die, die ? ersetzen werden NIE als Befehle ausgewertet
            return stmt.executeUpdate() > 0;
        }
    }


    private Kunde create(ResultSet zeile) throws SQLException {
        Kunde k = new Kunde();
        // Informationen aus Spalten werden auf Objekteigenschaften zugewiesen
        k.setId(zeile.getInt("id"));
        k.setVorname(zeile.getString("vorname"));
        k.setNachname(zeile.getString("nachname"));
        k.setAktiv(zeile.getBoolean("aktiv"));
        return k;
    }
}
