package de.lubowiecki.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringToArrayTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();

        System.out.println(eingabe);

        System.out.println();

        String[] teile = eingabe.split(" "); // Zerlegen nach Leerzeiche
        for(String teil : teile) {
            System.out.println("#" + teil);
        }

        System.out.print("\nEingabe: ");
        eingabe = scanner.nextLine();

        teile = eingabe.split(""); // Zerlegen nach einzelnen Zeichen
        System.out.println(Arrays.toString(teile));
        for(String teil : teile) {
            switch(teil.toUpperCase()) {
                case "L" -> System.out.println("Links");
                case "R" -> System.out.println("Rechts");
                case "U" -> System.out.println("Unter");
                case "H" -> System.out.println("Hoch");
                default -> System.out.println("Ungültig");
            }
        }
    }
}
