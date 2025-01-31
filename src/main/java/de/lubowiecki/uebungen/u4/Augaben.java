package de.lubowiecki.uebungen.u4;

import java.util.Scanner;

public class Augaben {

    // Klassenvariable
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        app: while(true) { // Dieser Block wird mehrmals ausgeführt, bis Zahl 5 ausgewählt wird
            System.out.print("Welche Aufgabe (1 bis 5): ");
            switch (scanner.nextInt()) {

                case 1 -> aufgabe1();
                case 2 -> aufgabe2();
                case 3 -> aufgabe3();
                case 4 -> aufgabe4();
                case 5 -> { break app; } // Hier wird die while-Schleife abgebrochen
                default -> System.out.println("Ungültig"); // Bei Falscheingabe
            }
        }

        scanner.close();
        System.out.println("Programm Ende");
    }

    private static void aufgabe1() {
        /* 1
        Deine Aufgabe ist es, ein einfaches Programm zu schreiben,
        das Minuten in Sekunden umwandelt. Das bedeutet, wenn dir jemand eine Zahl
        in Minuten nennt, wird dein Programm ihnen sagen, wie viele Sekunden das sind.
         */
    }

    private static void aufgabe2() {
        /* 2
        Schreibe ein Programm, das prüft, ob eine Zahl gerade oder ungerade ist.
        Der Benutzer gibt eine Zahl ein, und das Programm teilt ihm mit, ob die Zahl gerade
        oder ungerade ist.
         */
        System.out.print("Zahl? ");
        int zahl = scanner.nextInt();

        if(zahl % 2 == 0) {
            System.out.println("Gerade");
        }
        else {
            System.out.println("Ungerade");
        }

    }

    private static void aufgabe3() {
        /* 3
        Schreibe ein Programm, das basierend auf dem Alter des Benutzers eine
        Alterskategorie zurückgibt. Der Benutzer gibt sein Alter ein, und das
        Programm kategorisiert ihn als Kind, Teenager, Erwachsener oder Senior.

        Das Programm fragt nach einer Ganzzahl. (int).
        Verwende eine if-else-Struktur, um die richtige Alterskategorie zu bestimmen:
            a. 0–12: Kind
            b. 13–19: Teenager
            c. 20–64: Erwachsener
            d. 65 und älter: Senior
        Teile dem Benutzer seine Alterskategorie mit.
        Prüfe alle möglichen Fälle und Grenzen, ob dein Programm richtig funktioniert.
        (Mit Grenzen sind exakt 0, 12, 13, 19 usw. gemeint)
         */

        System.out.print("Alter? ");
        int alter = scanner.nextInt();

        if(alter >= 0 && alter <= 12) {
            System.out.println("Kind");
        }
        else if(alter <= 19) {
            System.out.println("Teenager");
        }
        else if(alter <= 64) {
            System.out.println("Erwachsener");
        }
        else if(alter > 64) {
            System.out.println("Senior");
        }
    }

    private static void aufgabe4() {
        /* 4
        Schreibe ein Programm, das basierend auf dem Alter des Benutzers einen Rabatt
        berechnet und diesen auf einen eingegebenen Preis anwendet.
        Personen unter 18 Jahren erhalten 20% Rabatt, während alle
        anderen 10% Rabatt bekommen.

        Das Programm fragt das Alter des Benutzers ab.
        Das Programm fragt nach dem Preis eines Produkts. Welcher Datentyp ist hierfür passend?
        Berechne den finalen Preis nach Anwendung des Rabatts.
        Teile dem Benutzer den Rabatt und den Endpreis mit.
         */
    }

}
