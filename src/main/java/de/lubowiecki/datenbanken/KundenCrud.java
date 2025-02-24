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
