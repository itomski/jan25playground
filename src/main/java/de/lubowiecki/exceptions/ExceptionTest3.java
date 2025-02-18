package de.lubowiecki.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class ExceptionTest3 {

    public static void main(String[] args) {

        try {
            int erg = 7 / 0; // Bei Exception wird sofort der try-Block abgebrochen und in den catch-Block gesprungen
            System.out.println(erg);
        }
        catch(ArithmeticException e) {
            System.out.println("Problem");
        }

        System.out.println();

        System.out.println("UNCHECKED");

        try {
            // Exception kann behandelt werden
            //int[] arr = null;
            //int[] arr = new int[10];
            int[] arr = new int[-10];
            arr[10] = 100; // Abbruch mit Exception
            System.out.println(Arrays.toString(arr));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Falscher Index");
        }
        catch(NullPointerException e) {
            System.out.println("Array nicht vorhanden");
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Das Array darf keine negative Größe haben.");
        }
        catch(RuntimeException e) { // Fängt alle anderen RuntimeExceptions ein
            System.out.println("Sonstiges Problem.");
        }


        System.out.println("CHECKED");

        // Checked-Exception werden zur Kompile-Zeit geprüft und müssen behandelt werden
        // Regel für Checked-Exceptions = Behandeln oder deklarieren
        try {
            // Exception muss behandelt werden, sonst Kompiler-Error
            FileOutputStream out = new FileOutputStream("data.txt");
            //...
        }
        catch (Exception e) { // Behandlung: Fängt alle Exceptions ein
            System.out.println("Problem!");
        }
    }
}
