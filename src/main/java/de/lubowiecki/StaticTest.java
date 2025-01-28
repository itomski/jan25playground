package de.lubowiecki;

import java.time.LocalDate;
import java.time.Period;

public class StaticTest {

    // 1. Eigenschaften
    // 2. Konstruktoren
    // 3. restliche Methoden

    static int zahl = 100;

    static void changeText() {
        // Statische Methoden dürfen nur statische Eigenschaften und statische Methoden verwenden
        System.out.println(zahl++); // ++ verändert die zahl um 1
    }

    // Statische Methoden sind gut dazu geeignet Werte zu verändern,
    // die als Parameter übergeben wurden
    // String = Datentyp
    // text = Variablenname
    static void changeText(String text) {
        System.out.println(text.toUpperCase());
    }

    static void wieLangeNoch(LocalDate datum) {
        LocalDate bis = LocalDate.of(2025, 12, 31);
        Period p = Period.between(datum, bis);
        System.out.println(p);
    }

    public static void main(String[] args) {

        // Für Klassenmethoden (statische Methoden) wird kein Objekt benötigt
        changeText();

        // Aufruf einer Klassenmethode aus einer anderen Klasse
        StaticTest.changeText(); //  Es wird der Klassenname davor geschrieben

        changeText("Das ist das Haus von Nikigraus!");
        changeText("Bla bla bla");
        changeText("Mein Zahl ist " + (10 + 15));

        System.out.println();

        System.out.println(Math.random()); // Produziert eine Zufallszahl
        System.out.println((int)(Math.random() * 6) + 1);
        System.out.println(Math.round(19.238)); // Runden

        System.out.println();

        wieLangeNoch(LocalDate.now());
        wieLangeNoch(LocalDate.of(2025, 10, 5));
        wieLangeNoch(LocalDate.of(2028, 7, 22));

        System.out.println();

        double erg = powQuadrat(10.0);
        System.out.println(erg);

        System.out.println(powQuadrat(20.0));
    }

    // Statische Methoden verarbeiten die Parameter
    public static double powQuadrat(double zahl) {
        return zahl * zahl; // return = wird aus der Methode an den Aufrufer zurückgegeben
    }

}
