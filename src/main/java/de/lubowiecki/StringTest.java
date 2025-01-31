package de.lubowiecki;

import javax.swing.*;

public class StringTest {

    public static void main(String[] args) {

        // String-Objekte sind in Java nicht änedrbar

        String text = "Hallo";
        text = "Hallo Welt";
        System.out.println(text);

        text = "";
        for (int i = 0; i < 100; i++) {
            // Veränderung eines Strings bedeutet, dass ein neues String-Objekt
            // erzeugt wird und die Referenz versetzt wird
            text += i; // text = text + i
        }

        System.out.println(text);

        System.out.println();

        text = "Das ist das Haus von Nikigraus";
        text = text.toUpperCase(); // Änderung in Großbuchstaben
        System.out.println(text);
        text = text.substring(2, 15); // Liefert einen Ausschnitt
        System.out.println(text);
        System.out.println(text.charAt(0)); // Liefert das Zeichen an Position 0
        System.out.println(text.startsWith("S")); // Prüft ob der Text mit s startet
        System.out.println(text.endsWith("DAS")); // Prüft ob der Text mit DAS endet

        // liefert indexOf einen positiven wert, dann bedeutet das, dass das gesuchte
        // Wort im String vorkommt
        System.out.println(text.indexOf("DAS")); // Prüft, an welcher Stelle DAS beginnt. Nimmt das erste vorkommen
        System.out.println(text.lastIndexOf("DAS")); // Prüft, an welcher Stelle DAS beginnt. Nimmt das letzte vorkommen

        System.out.println(text.length()); // liefert die Länge des Textes

        System.out.println(text.contains("HAUS")); // Kommt das Wort HAUS im Text vor?

        text = "GO123";
        System.out.println(text);
        // matches = Prüft, ob der Text einem Muster (RegExp) entspricht
        // Text in Kein und Großbuchstabenmit mit der Länge von 2 - 10 Zeichen?
        System.out.println(text.matches("[a-zA-Z0-9]{2,10}"));

        text = "Das ist ein Haus von Peter Parker";
        text = text.replace("Peter Parker", "Spiderman"); // Ersetzt eine Zeichenfolge
        System.out.println(text);

        System.out.println();

        text = "Golf, Schwimmen, Technik, Handball, Steine Werfen, Reiten, Boxen";
        String[] teile = text.split(", "); // Liefert eine Sammlung von Strings. Zerlegt einen Text in mehrere Teile
        // String[] = String-Array = eine Variable, die mehrere Strings gleichzeitig speichern kann

//        for (int i = 0; i < 5; i++) {
//            System.out.println(teile[i]);
//        }

        // length sagt aus, wieviele Elemente drin enthalten sein können
        for (int i = 0; i < teile.length; i++) {
            System.out.println(teile[i]);
        }

        System.out.println();

        for (String t : teile) { // in Teil werden nacheinander alle Teile abgelegt
            System.out.println(t);
        }

        String name = JOptionPane.showInputDialog("Name");
        JOptionPane.showMessageDialog(null, "Dein Name ist " + name);

//        System.out.println(JOptionPane.showConfirmDialog(null, "Nochmal?"));
//        System.out.println(JOptionPane.showConfirmDialog(null, "Nochmal?"));
//        System.out.println(JOptionPane.showConfirmDialog(null, "Nochmal?"));

        while(JOptionPane.showConfirmDialog(null, "Nochmal?") == 0) {
            System.out.println("Hi");
        }
    }
}
