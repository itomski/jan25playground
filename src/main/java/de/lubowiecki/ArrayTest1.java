package de.lubowiecki;

import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        // Sammlungen mit fester Größe, die Daten aufnehmen kann

        // [] zeigen, dass es ein Array ist d.h. eine Sammlung von Werten gleichen Typs
        String[] namen;
        int[] zahlen;
        double[] preise;

        zahlen = new int[10]; // Array mit 10 Positionen
        zahlen[3] = 100;
        zahlen[7] = 800;

        // Arrays beginnen IMMER mit der Position/Index 0
        for (int i = 0; i < 10; i++) {
            System.out.println(zahlen[i]);
        }

        // Wirft eine Exception, wenn auf einen Index außerhalb zugegriffen wird


        System.out.println();
        printZahl(10);
        printZahl(20);
        printZahl(30);
        printZahl(40);

        System.out.println();

        int[] a1 = {10, 20, 30, 40, 50}; // Erzeugt ein gefülltes Array mit passender Größe
        printZahl(a1);
        printZahl(a1.length);

        System.out.println();

        // Array Objekte können ihre Größe nicht verändern
        String[] heros = {"Hulk", "Spriderman", "Ironman"}; // Erzeugt ein gefülltes Array mit Größe 3

        System.out.println();

        int[] z1 = {1,2,3};
        int[] z2 = z1; // Zwei Variablen zeigen auf das Gleiche Array auf dem Heap
        // Die equals Methode vergleicht, ob es das gleiche Array ist und nicht, ob der Inhalt gleich ist
        System.out.println(z1.equals(z2));

        // Für Arrays gibt es eine Utility-Klasse (Hilfsklasse) Arrays
        // Diese equals Methode vergleicht den Inhalt
        System.out.println(Arrays.equals(z1, z2));

    }

    // Nimmt nur einen Wert entgegen
    private static void printZahl(int i) {
        System.out.println(i);
    }

    // Nimmt mehrere Werte als ein Array entgegen
    private static void printZahl(int[] arr) {
        // int[] = Datentyp
        // arr ist der Name der Variable
        // Arrays sind Objekte
        // length ist eine Eigenschaft des Arrays - Sagt, wei groß das Array ist
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
