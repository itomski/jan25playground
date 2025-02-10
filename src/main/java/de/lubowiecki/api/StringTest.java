package de.lubowiecki.api;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hamburg"; // Landet im String-Literal-Pool
        String s2 = "Hamburg"; // Hamburg wird aus dem Pool referenziert
        s2  += "...";

        System.out.println(s1 == s2); // == Vergleicht bei Objekten ob es das gleiche Objekt auf dem Heap ist
        System.out.println(s1.equals(s2)); // Inhaltsvergleich

        System.out.println();
        String s3 = new String("Hamburg"); // Landet NICHT im String-Literal-Pool
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        int i = 10; // kein Pool für Primitive
        Integer j = i; // Autoboxing: primitiver Wert wird in ein Objekt verpackt
        i = j; // Auto-Unboxing: Wrappertyp wird ausgepackt

        System.out.println();

        // Byte-Pool: Werte zwischen -128 und 127 sind als
        // Ganzzahlen-Wrapper (Byte, Short, Integer, Long) schon alle im Pool
        Integer i1 = 130;
        Integer i2 = 130;

        System.out.println(i1 == i2); // Referenzvergleich: ist es das gleiche Objekt?
        System.out.println(i1.equals(i2)); // Inhaltsvergleich: hat es den gleichen Zustand?

        Long l1 = 10l;

        System.out.println("Das ist das Haus von Nikigraus.");

        String name = "Peter";
        System.out.println("Das ist das Haus von " + name + "!");

        // Standard = rechtsbündig
        // - = linksbündig
        final String TPL = "Das ist das %20s von %-20s! %d %.2f %n";
        System.out.printf(TPL, "Fahrrad", name, 15, 10.7);
        System.out.printf(TPL, "Terrasse", "Carol", 0, 22.8);
        System.out.printf(TPL, "Gartenhaus", "Bruce", 7, 18.0);
        System.out.printf(TPL, "Pool","Tony", 9, 1.5);

        System.out.println();

        final String ROW_TPL = "| %-16s | %-4s | %-16s | %-16s | \n";

        // Gibt den zusammengestzten String auf der Konsole aus
        System.out.printf(ROW_TPL, "Peter", 25, "Spriderman", "New York");
        System.out.printf(ROW_TPL, "Bruce", 42, "Hulk", "New York");

        // Liefert den zusammengestzten String zurück
        String s = String.format(ROW_TPL, "Peter", 25, "Spriderman", "New York");
    }
}
