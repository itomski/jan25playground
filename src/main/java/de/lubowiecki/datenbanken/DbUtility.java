package de.lubowiecki.datenbanken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {

    // Standardport unter Windows ist 3306
    private static final String URL = "jdbc:mysql://localhost:8889/usermanagement";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private DbUtility() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
