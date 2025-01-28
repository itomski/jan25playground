package de.lubowiecki; // nur Kleinbuchstaben und Punkte

// Alle Klassen aus java.lang sind automatisch importiert
// Alle anderen Klassen müssen importiert werden, wenn sie in einem anderen Package liegen

//import java.util.Date;
import java.util.*; // importiert alle Klassen aus java.util

// End-Of-Line Kommentar: Alles wird bis zum Ende der Zeile auskommentiert

// Deklaration = Reservieren eines Namens
// Eine Klasse, die nicht public ist, kann nur im gleichen Package verwendet werden
public class PackageTest { // PascalCase: beginnt mit Großbuchstaben

    public static void main(String[] args) {

        // Deklaration und Initialisierung (Zuweisung eines Startwertes)
        int zahl = 10;

        int zahl2; // Deklaration (der Name der Variable ist reserviert)
        zahl2 = 15; // Initialisierung (Erste Wertzuweisung)
        zahl2 = 20; // Änderung

        // int zahl2; // Error: Name ist bereits reserviert

        System.out.println(new PackageTest());

        Date heute = new Date();
        System.out.println(heute);
    }

    // Inhalt der Umgebenden Klasse
    class InnereKlasse {
    }
}

// ohne Zugriffsmodifikator ist die Klasse package-private (nur im Package sichtbar)
class ZweiteKlasse {
}