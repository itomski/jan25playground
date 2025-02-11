package de.lubowiecki.api;

import java.time.LocalDate;
import java.util.Scanner;

public class EinkaufslistenTest {


    private static final Scanner scanner = new Scanner(System.in);

    private static final Einkaufsliste einkaufsliste = new Einkaufsliste();

    public static void main(String[] args) {

        // app ist nur ein Label
        app: while(true) {
            System.out.print("Auswahl: ");
            switch (scanner.nextLine().trim().toLowerCase()) {
                case "neu" -> artikelHinzufuegen();
                case "print" -> einkaufsliste.printAlle();
                case "print alle" -> einkaufsliste.printAlle();
                case "print offen" -> einkaufsliste.printOffene();
                case "print gekauft" -> einkaufsliste.printGekaufte();
                case "exit" -> {
                    break app; // beendet die Struktur mit dem Label app: while-Schleife
                }
                default -> System.out.println("Falsche Auswahl!");
            }
        }
    }

    private static void artikelHinzufuegen() {
        System.out.println("Neuer Artikel");
        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.print("Anzahl:");
        int anzahl = scanner.nextInt();
        scanner.nextLine(); // fix
        einkaufsliste.hinzufuegen(new Artikel(name, anzahl));
        System.out.println("Artikel wurde gespeichert.");
    }
}
