package de.lubowiecki;

import java.util.Scanner;

public class LagerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lager hamburg = new Lager(20);
        Lager berlin = new Lager(200);
        Lager muenchen = new Lager(10);

        while(true) {
            String eingabe;
            Lager auswahl;

            System.out.print("Lager: ");
            eingabe = scanner.nextLine();

            if(eingabe.equalsIgnoreCase("hamburg")) {
                auswahl = hamburg;
            }
            else if(eingabe.equalsIgnoreCase("berlin")) {
                auswahl = berlin;
            }
            else {
                auswahl = muenchen;
            }

            System.out.print("Produktname: ");
            eingabe = scanner.nextLine();

            if (auswahl.hinzufuegen(eingabe)) {
                System.out.println(eingabe + " wurde hinzugefügt");
            } else {
                System.out.println(eingabe + " konnte nicht hinzugefügt werden");
            }

            System.out.println("Deine Produkte:");
            for(String produkt : auswahl.getProdukte()) {
                System.out.println(produkt);
            }
        }
    }
}
