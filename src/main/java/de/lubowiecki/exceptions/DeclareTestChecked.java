package de.lubowiecki.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeclareTestChecked {

    public static void main(String[] args) {
        // main-Methode ist die letzte Möglichkeit eine Exception zu behandeln
        try {
            machWasAnderes();
        }
        catch (SQLException e) {
            System.out.println("Problem beim Verbinden mit der Datenbank.");
            System.out.println(e.getMessage());
        }
    }

    // throws gibt eine Exception an den Aufrufer der Methode weiter
    private static void machWasAnderes() throws SQLException {
        // entweder behandeln (try-catch) oder deklarieren (throws)
        machWas();
    }

    // Weitergabe der Exception an den Aufrufer der Methode erfolgt über throws
    private static void machWas() throws SQLException { // throws = deklarieren
        // CheckedException
        // try-catch = Behandeln
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "benutzer", "pass");
    }
}
