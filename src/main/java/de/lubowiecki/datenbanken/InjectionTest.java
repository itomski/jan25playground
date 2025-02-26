package de.lubowiecki.datenbanken;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InjectionTest {

    public static void main(String[] args) {

        final String SQL = "INSERT INTO kunden (vorname, nachname) VALUES(?, ?)";

        try(Connection verbindung = DbUtility.getConnection();
            PreparedStatement stmt = verbindung.prepareStatement(SQL)) {

            stmt.setString(1, "Peter");
            stmt.setString(2, "Parker");
            stmt.execute();

            stmt.setString(1, "Bruce");
            stmt.setString(2, "Banner");
            stmt.execute();

            stmt.setString(1, "Carol");
            stmt.setString(2, "Danvers");
            stmt.execute();

            stmt.setString(1, "Natasha");
            stmt.setString(2, "Romanov");
            stmt.execute();
        }
        catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }

    }
}
