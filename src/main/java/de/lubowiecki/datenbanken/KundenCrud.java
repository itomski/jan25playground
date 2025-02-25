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

    public List<Kunde> findByVorname(String vorname) throws SQLException {
        final String SQL = "SELECT * FROM " + TABLE + " WHERE vorname = ?";
        return findBy(SQL, vorname);
    }

    public List<Kunde> findByNachname(String nachname) throws SQLException {
        final String SQL = "SELECT * FROM " + TABLE + " WHERE nachname = ?";
        return findBy(SQL, nachname);
    }

    public List<Kunde> findByAktiv(boolean aktiv) throws SQLException {
        final String SQL = "SELECT * FROM " + TABLE + " WHERE aktiv = ?";
        return findBy(SQL, aktiv); // Autoboxing von boolean zu Boolean
    }

    private List<Kunde> findBy(String sql, Object value) throws SQLException {

        try(Connection verbindung = DbUtility.getConnection();
            PreparedStatement stmt = verbindung.prepareStatement(sql)) {

            stmt.setObject(1, value);
            ResultSet daten = stmt.executeQuery();

            List<Kunde> kunden = new ArrayList<>();
            while(daten.next()) {
                kunden.add(create(daten));
            }
            return kunden;
        }
    }

    private boolean insert(Kunde kunde) throws SQLException {

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

    public boolean save(Kunde kunde) throws SQLException {
        if(kunde.getId() > 0) { // Hat der Kunde eine ID, dann ist er bereits in der DB enthalten
            return update(kunde); // dann update
        }
        else {
            return insert(kunde);
        }
    }

    private boolean update(Kunde kunde) throws SQLException {

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

    private boolean delete(Kunde kunde) throws SQLException {
        return delete(kunde.getId());
    }

    private boolean delete(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        // Das PreparedStatement arbeitet etwas langsamer als das "normale" Statement
        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    // Wandelt relationale Daten in Java-Objekte um
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
