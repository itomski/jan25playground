package de.lubowiecki;

public class KontrollstrukturenTest2 {

    public static void main(String[] args) {

        // forSchleife(5);

        arrayIteration();
    }

    private static void forSchleife(int anzahl) {
        // (Festlegung des Zählers; Bedingung; Veränderung)
        for(int i = 0; i < anzahl; i++) {
            System.out.println(i);
        }
    }

    private static void arrayIteration() {
        // Array ist eine Sammlung von Werten

                             // 0       1       2           3        4
        String[] sammlung = {"Peter", "Carol", "Natasha", "Bruce", "Scott"};

        // (Festlegung des Zählers; Bedingung; Veränderung)
        for(int i = 0; i < sammlung.length; i++) {
            System.out.println(sammlung[i]);
        }
    }
}
