package de.lubowiecki;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class KontrollstrukturenTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.specification.version"));
        System.out.println(System.getProperty("user.home"));

        // System.in = Eingabestrom
        // System.out = Ausgabestrom
        // System.err = Ausgabestrom für Fehlermeldungen
        // System.err.println("Ausgabe in rot!");

        System.out.print("Eingabe: ");
        String input = scanner.next();

        // == prüft Gleichheit von primitiven Datentypen
        // == prüft bei Objekten, ob es das gleiche Objekt auf dem Heap ist
        // Inhaltliche Gleichheit von Objekten (Strings) wird mit equals geprüft

        // equalsIgnoreCase beachtet die Groß/Kleinschreibung nicht
        if(input.equalsIgnoreCase("hallo")) { // ist der Inhalt gleich
            System.out.println("Bot: Moin Moin!");
        }
        else if(input.equalsIgnoreCase("time")) {
            System.out.println(LocalTime.now());
        }
        else if(input.equalsIgnoreCase("date")) {
            System.out.println(LocalDate.now());
        }
        else // Bei einer eint´zigen Anweisung können die {...} weggelassen werden
            System.out.println("Bot: He? Verstehe ich nicht!");



//        if(!input.isEmpty()) { // Prüft, ob irgendetwas eigegeben wurde
//            System.out.println("Bot: Trotzdem Hallo!");
//        }
    }
}
