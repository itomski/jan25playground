package de.lubowiecki;

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
        System.out.println(text.indexOf("DAS")); // Prüft, an welcher Stelle DAS beginnt


    }

}
