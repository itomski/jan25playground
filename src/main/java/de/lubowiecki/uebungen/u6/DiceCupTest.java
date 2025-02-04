package de.lubowiecki.uebungen.u6;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        System.out.println(DiceCup.roll());
        System.out.println(DiceCup.roll());

        int[] arr = DiceCup.roll(100);

        // Die Utility-Klasse Arrays bietet eine toString-Methode zum Anzeigen des Inhalts eines Array an
        System.out.println(Arrays.toString(arr));

        // Das Array Zahl für Zahl ausgeben
        for(int zahl : arr) {
            System.out.println(zahl);
        }
    }
}
