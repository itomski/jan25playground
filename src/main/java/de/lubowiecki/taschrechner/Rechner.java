package de.lubowiecki.taschrechner;

import java.util.Scanner;

public class Rechner {

    /*
        Schreibe eine Klasse für einen Taschenrechner
        Es werden zwei Werte abgefragt danach werden sie addiert und ausgegeben
        Verpacke die mathematische Operationen in Methoden
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("\nErste Zahl: ");
            double a = scanner.nextDouble(); // Scanner verwendet die landesübliche Schreibweise

            System.out.print("Zweite Zahl: ");
            double b = scanner.nextDouble();

            double erg = a + b;
            System.out.println("Erg: " + erg);

            System.out.print("Noch ne Rechnung? ");
            if(!scanner.next().toLowerCase().equals("j")) { // ! = NICHT
                break;
            }
        }
    }
}
