package de.lubowiecki.datenbanken;

import java.sql.*;

public class VerbindungsTest {

    public static void main(String[] args) {



        // try-with-resources: Alle Resourcen müssen AutoCloseable sein
        // Aufbau der Verbindung und Anfrage wird vorbereitet
        try(Connection verbindung = DbUtility.getConnection();
                Statement stmt = verbindung.createStatement()) {

            // Anfrage ausführen
            ResultSet daten = stmt.executeQuery("SELECT * FROM kunden");

            // Daten anzeigen/verarbeiten
            while(daten.next()) {
                System.out.println(daten.getString("vorname") + " " + daten.getString("nachname"));
            }

            // verbindung und stmt werden automatisch geschlossen
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
