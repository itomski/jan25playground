package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArraysUtilsTest {

    public static void main(String[] args) {

        int[] zahlen = {10, 22, 17, 1, -5, 19, 8, 2, 7, 1};
        int[] zahlen2 = zahlen.clone(); // Unabhängige Kopie
        zahlen2[2] = 100;
        System.out.println(zahlen2.length);
        System.out.println(zahlen2); // toString von Array ist nicht richtig implementiert/eingebaut

        // Stattdessen wird toString von Arrays-Utility-Klasse verwendet
        // Utility-Klassen enthalten nur statische Methoden
        // Wird NICHT instanziert (Es können keine Objekte davon erzeugt werden)
        // Methoden verarbeiten die Methodenparameter
        System.out.println(Arrays.toString(zahlen)); // toString - Konvertiert ein Objekt in String
        System.out.println(Arrays.toString(zahlen2));

        //Arrays utils = new Arrays(); // Error: Konstruktor ist privat
        // Methoden dieser Klasse werden IMMER dierekt auf der Klasse ausgeführt

        System.out.println();

        Arrays.sort(zahlen); // Inhalt sortieren
        System.out.println(Arrays.toString(zahlen));

        System.out.println();

        // Array muss sortiert sein
        int idx = Arrays.binarySearch(zahlen, 6); // Zahl im Array suchen
        System.out.println(idx);
        System.out.println(Arrays.toString(zahlen));

        System.out.println();

        boolean gleich = Arrays.equals(zahlen, zahlen2); // Vergleicht zwei Arrays nach ihrem Inhalt
        System.out.println(gleich);

        zahlen = new int[20];
        System.out.println(Arrays.toString(zahlen));
        Arrays.fill(zahlen, 100); // befüllt das Array mit gewünschten werten
        System.out.println(Arrays.toString(zahlen));

        System.out.println();

        String[] namen = new String[20];
        Arrays.fill(namen, "Leer");
        System.out.println(Arrays.toString(namen));

    }
}
