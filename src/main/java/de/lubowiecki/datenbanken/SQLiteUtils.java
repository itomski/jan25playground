package de.lubowiecki.datenbanken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteUtils {

    // Wenn die Datei nicht vorhanden ist, wird sie automatisch erzeugt
    // private static final String URL = "jdbc:sqlite:daten.db"; // relativer Pfad
    //private static final String URL = "jdbc:sqlite:~daten.db"; // absoluter Pfad (Benutzerordner)
    private static final String URL = "jdbc:sqlite:" + System.getProperty("user.home") + "/daten.db"; // absoluter Pfad (Benutzerordner)

    private SQLiteUtils() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
