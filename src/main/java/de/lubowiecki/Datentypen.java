package de.lubowiecki;

import java.util.Arrays;

public class Datentypen {

    // String[] = String-Array = Sammlung von Strings

    // Diese Methode wird automatisch von dem Interpreter gestartet
    // Der Interpreter nutzt dazu die Methode aus der Klasse (static) und erzeugt KEIN Recher Objekt
    public static void main(String[] args) {

        // java Rechner 200 Hallo xyz
        // Nach dem Klassennamen kommen Parameter die beim Start an die Main-Methode übergeben werden
        // Diese Werte landen als Strings in der args-Variable

        System.out.println(Arrays.toString(args));

        String text = "Hallo"; // ein Text
        text = "Moin"; // Inhalt wird ersetzt

        // Variablen

        // Primitive Datentypen: Von Java vordefiniert

        // byte < short < int < long < float < double
        // Kleinere Werte können ohne Probleme in größere Typen abgelegt werden

        byte b = 100;
        int i = b; // Ok, da byte kleiner ist als int

        short s = 1;
        // b = s; // Error: short ist zu groß für einen byte
        s = b; // Ok, da byte kleiner ist als short

        double d = b; // Ok, da byte kleiner ist als double

        // Komplexe Datentypen: Basieren auf Klassen

        System.out.println(100); // 100 ist ein Literal
        System.out.println(b); // b ist eine Variable

        System.out.println();

        // boolean
        // Deklaration und Initialisierung
        boolean exit = false;
        exit = true; // Änderung
        exit = false; // Änderung: Alter Wert geht verloren

        System.out.println(10 < 20);
        System.out.println(100 < 20);
        System.out.println(100 == 20);

        int zahl = 75;
        System.out.println(zahl > 20 && zahl < 100);

        System.out.println();

        byte b2 = 120;
        check(100); // Ganzzahlenliterale sind automatisch int
        check(b2); // hier wird byte verwendet

        // int ist standard für Ganzzahlen

        long zahl2 = 50_000_000_000L; // l oder L verändern eine Zahl in long
        // int i2 = 100L; // Error: long ist zu groß für eine int Variable

        // double ist standard für Gleitkommazahlen
        // float hat eine einfache Genauigkeit
        // double hat eine doppelte Genauigkeit
        float f1 = 10.17f; // beim float muss IMMER ein f oder F dran
        double d2 = 10.17;

        System.out.println();

        double d10 = 10.17;
        double d11 = 12.22;
        System.out.println(d10 / d11);

        float f10 = 10.17f;
        float f11 = 12.22f;
        System.out.println(f10 / f11);

        int i10 = 5;
        int i11 = 2;
        System.out.println(i10 / i11);

        // Zum Rechnen verwendet man am besten double

        // Ausgabe erfolgt in Dezeimal (Standard in Java)
        System.out.println(0b1001); // 9 : Binär
        System.out.println(011); // 9 : Oktal
        System.out.println(9);
        System.out.println(0x1a); // 26 : Hex

        char c = 'a'; // "" erzeugen einen String, '' erzeugen einen char
        System.out.println(c);
        System.out.println((int)c);
        System.out.println((char)49966); // Produziert ein Passendes Unicode-Zeichen
        System.out.println('a' + 0); // c wird automatisch in int umgewandelt
    }

    public static void check(byte b) {
        System.out.println("byte");
    }

    public static void check(int i) {
        System.out.println("int");
    }
}
