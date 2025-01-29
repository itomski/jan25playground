package de.lubowiecki.taschrechner;

import java.util.Arrays;

public class Rechner {

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

    }
}
