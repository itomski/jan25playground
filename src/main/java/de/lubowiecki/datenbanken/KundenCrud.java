package de.lubowiecki.datenbanken;

// ORM Objekt-Relationales-Mapping: Übersetzt Relationale Daten aus der Datenbank in Java Objekte
// und umgekehrt

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public boolean insert(Kunde kunde) throws SQLException {

        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            // INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(NULL, 'Bruce', 'Banner')
            final String SQL = "INSERT INTO " + TABLE + " (vorname, nachname) " +
                                    "VALUES('%s', '%s')"; // %s ist ein Platzhalter für einen String

            // executeUpdate liefert die Anzahl der Zeilen die geändert/hinzugefügt wurden
            return stmt.executeUpdate(String.format(SQL, kunde.getVorname(), kunde.getNachname())) > 0; // Das Einfügen ist ein Update des Inhalts einer Tabelle
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
