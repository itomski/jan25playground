package de.lubowiecki;

import java.util.Scanner;

public class WhileTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        kopfgesteuert();
        //fussgesteuert();

        scanner.close();
        System.out.println("Ende des Programms.");
    }

    public static int generateRendom() {
        return (int)(Math.random() * 10) + 1; // 7
    }

    public static void kopfgesteuert() {
        System.out.print("Ausführen (ja, nein)? ");

        // next liest ein Text (bis zum ersten Leerzeichen) von der Konsole ein

        // Kopfgesteuerte = Block wird erst ausgeführt, wenn die Anweisung true ist
        while(scanner.next().equalsIgnoreCase("ja")) {
            // Body wird nur ausgeführt, wenn While-Anweisung true ergibt
            System.out.println(generateRendom());
            System.out.print("noch mehr? ");
        }
    }

    public static void fussgesteuert() {

        // Fussgesteuert: Anweisung wird zuerst abgearbeitung
        // danach wird die while-Bedigung geprüft
        do {
            System.out.println(generateRendom());
            System.out.print("noch mehr? ");
        }
        while(scanner.next().equalsIgnoreCase("ja"));
    }
}
