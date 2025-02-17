package de.lubowiecki.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionTest1 {

    // Klassen- und Instanzvariablen bekommen Standardwerte (bei String null)
    static String andererName;

    public static void main(String[] args) {

        // Checkedexceptions werden vom Kompiler geprüft
        // Kompiler checkt, ob eine Behandlung stattgefunden hat
        // Die Behandlung der Exception wird erzwungen

        Path path = Paths.get("content.txt");
        try {
            // Versuche das hier auszuführen
            List<String> zeilen = Files.readAllLines(path); // IOException
        }
        catch(IOException e) {
            // Und sollte ein Problem auftauschen, dann fange ihn hier ein
            System.out.println("Nachricht: " + e.getMessage());
        }


        // Uncheckedexceptions werden vom Kompiler nicht geprüft
        // Sie tauchen zur Laufzeit auf
        // Behandlung der Exception kann freiwillig erfolgen

        try {
            int[] arr = new int[50];
            arr[52] = 15; // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Nachricht: " + e.getMessage());
        }

        try {
            // String name; // Lokale Variablen bekommen keine Standardwerte
            String name = null;
            System.out.println(name.toUpperCase()); // NullPointerException
            System.out.println(andererName.toUpperCase()); // NullPointerException
        }
        catch(NullPointerException e) {
            System.out.println("Nachricht: " + e.getMessage());
        }
    }
}
