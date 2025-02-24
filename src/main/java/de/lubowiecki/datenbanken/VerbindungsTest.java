package de.lubowiecki.datenbanken;

import java.sql.*;

public class VerbindungsTest {

    public static void main(String[] args) {

         datenAbfragen();

        // datenSchreiben();

        // datenLoeschen();

        // datenAendern();
    }

    private static void datenSchreiben() {

        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            final String SQL = "INSERT INTO kunden (vorname, nachname) VALUES('Tony', 'Stark')";

            if(stmt.executeUpdate(SQL) > 0) {
                System.out.println("Gespeichert");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datenAendern() {

        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            final String SQL = "UPDATE kunden SET vorname = 'Scott', nachname = 'Lang', aktiv = 1 WHERE id = 2";

            if(stmt.executeUpdate(SQL) == 1) {
                System.out.println("Geändert");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datenLoeschen() {

        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            final String SQL = "DELETE FROM kunden WHERE id = 3";

            if(stmt.executeUpdate(SQL) == 1) {
                System.out.println("Gelöscht");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datenAbfragen() {
        // try-with-resources: Alle Resourcen müssen AutoCloseable sein
        // Aufbau der Verbindung und Anfrage wird vorbereitet
        try(Connection verbindung = DbUtility.getConnection();
            Statement stmt = verbindung.createStatement()) {

            // Anfrage ausführen
            // ResultSet ist eine Sammlung in der Sich die Daten Zeilenweise befinden
            // Der Zeiger befindet sich am Anfang VOR der ersten Zeile
            // und wird mit next auf dei nächste Zeile versetzt
            ResultSet daten = stmt.executeQuery("SELECT * FROM kunden");

            // Daten anzeigen/verarbeiten
            while(daten.next()) {
                // Daten werden mit passender Methode pro Splate abgefragt
                // passender Methode muss zu dem jweiligen Datentyp der Spalte passen
                System.out.println(daten.getInt("id") + " " +
                        daten.getString("vorname") + " " +
                        daten.getString("nachname") + ", " +
                        (daten.getBoolean("aktiv") ? "aktiv" : "passiv"));
            }

            // verbindung und stmt werden automatisch geschlossen
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
