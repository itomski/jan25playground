package de.lubowiecki;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class KontrollstrukturenTest1 {

    public static void main(String[] args) {

        // printStytem();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: ");
        String input = scanner.next();

        // ifCheck(input);

        // switchCheck(input);

        wieLangeNochBisWE(input);

    }

    private static void printStytem() {

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.specification.version"));
        System.out.println(System.getProperty("user.home"));

        // System.in = Eingabestrom
        // System.out = Ausgabestrom
        // System.err = Ausgabestrom für Fehlermeldungen
        // System.err.println("Ausgabe in rot!");
    }

    private static void ifCheck(String input) {

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

    private static void switchCheck(String input) {

        // trim entfernt Leerzeichen oder Steuerzeichen an beiden Enden der Zeichenkette
        switch(input.trim().toLowerCase()) {

            case "hallo":
                System.out.println("Bot: Moin Moin!");
                break; // Fehlt ein berak, wird der Folge-Case auch ausgeführt

            case "time":
                System.out.println(LocalTime.now());
                break;

            // Jeder case muss einzigartig sein
            case "date":
                System.out.println(LocalDate.now());
                break;

            default:
                System.out.println("Bot: He? Verstehe ich nicht!");

        }
    }

    // Seit Java 14 möglich
    private static void switchCheckNew(String input) {

        // Mögliche Werte
        // Ganzzahlen (byte, short, int), Strings, char, ENUMs

        // trim entfernt Leerzeichen oder Steuerzeichen an beiden Enden der Zeichenkette
        switch(input.trim().toLowerCase()) {
            // -> baut automatisch ein break ein
            // nach dem -> nur eine Anweisung oder ein Block möglich
            case "hallo" -> System.out.println("Bot: Moin Moin!");
            case "time" -> System.out.println(LocalTime.now());
            case "date" -> { // Block
                System.out.print("Datum: ");
                System.out.println(LocalDate.now());
            }
            default -> System.out.println("Bot: He? Verstehe ich nicht!");
        }
    }


    private static void wieLangeNochBisWE(String tag) {

        switch(tag.toUpperCase()) {
            case "MO":
                System.out.println("Montag");
            case "DI":
                System.out.println("Dienstag");
            case "MI":
                System.out.println("Mittwoch");
            case "DO":
                System.out.println("Donnerstag");
            case "FR":
                System.out.println("Freitag");
            case "SA":
            case "SO":
                System.out.println("Wochenende!");
                break;

            default:
                System.out.println("Unbekannt");
        }
    }
}
