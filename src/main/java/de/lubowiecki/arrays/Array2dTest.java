package de.lubowiecki.arrays;

public class Array2dTest {

    public static void main(String[] args) {

        char[] arr1d = new char[10];
        arr1d[3] = 'X';
        arr1d[0] = 'A';

        // Array-Index wird erst zur Laufzeit geprüft
        // arr1d[12] = 'Z'; // ArrayIndexOutOfBoundsException
        // arr1d[-12] = 'Z'; // ArrayIndexOutOfBoundsException

        char[][] arr2d = new char[10][20];
        arr2d[2][3] = 'X';

        /*
        { 2d
            0: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 1d
            1: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 1d
            2: { 0,0,0,X,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, etc.
            3: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            4: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            5: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            6: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            7: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            8: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            9: { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        }
        */

        // Erste Schleife läuft das Array Reihe für Reihe durch
        // Eine Reihe ist eine Sammlung von Sitzen = 1d Array
        for(char[] reihe : arr2d) {

            // Zweite Schleife läuft die Reihe Sitz für Sitz durch
            // Eins Sitz ist ein konkreter Wert
            for(char sitz : reihe) {
                System.out.print(sitz + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr2d.length ; i++) { // Reihe für Reihe
            for (int j = 0; j < arr2d[i].length ; j++) { // Sitz für Sitz
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr3d;
        int[][][][] arr4d;


    }
}
