package de.lubowiecki.uebungen.u5;

public class Aufgabe {

    /*
    Gib alle Großbuchstaben aus.
     */
    public static void main(String[] args) {

//        int zeichen = 65;
//        System.out.println((char)zeichen);

        for(int zeichen = 65; zeichen <= 90; zeichen++) {
            System.out.println((char)zeichen);
        }

        System.out.println();

        int zeichen = 'A';
        do {
            System.out.println((char)zeichen);
            zeichen++;
        } while(zeichen <= 'Z'); // char wird in automatisch int umgewandelt

    }
}
