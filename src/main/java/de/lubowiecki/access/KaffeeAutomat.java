package de.lubowiecki.access;

// Klassen aus anderen Packages MÜSSEN IMMER vor der Verwendung importiert werden
import de.lubowiecki.access.sub.KaffeeProdukt;

// Importiert alle Klassen aus sub
// Importiert KEINE Unter-Packages von sub
import de.lubowiecki.access.sub.*;

// Importiert alle Klassen aus java.util
import java.util.*;
// Unter-Packages müssen extra importiert werden
import java.util.function.*;

// Alle Klassen aus dem Package java.lang brauche nicht importiert zu werden

public class KaffeeAutomat {

    public static void main(String[] args) {

        // Konstruktor erzeugt IMMER ein neues Objekt
        // Nachträgliche Änderung der Daten ist über den Konstruktor nicht möglich!
        KaffeeProdukt americano = new KaffeeProdukt("Espresso");

        // String kommt aus java.lang
        String msg = "Was möchtest du trinken?";

        // Muss imprortiert werden, da sie in java.util liegt
        // ArrayList list = new ArrayList();

        americano.zucker = 1; // public d.h. für alle sichtbar
        System.out.println(americano.zucker);
        // durch direkten Zugriff kann eine Eigenschaft einen ungültigen Wert bekommen
        americano.zucker = -1;
        americano.zucker = 100_000;
        System.out.println(americano.zucker);

        // americano.name = "esparesso"; // private d.h. hier nicht sichtbar!
        // System.out.println(americano.name);
        // Der Getter ist hier sichtbar, da public.
        // Er liefert den Zustand der Eigenschaft name
        System.out.println(americano.getName());
        americano.setName("Americano"); // Führt eine nachträgliche Änderung des Objekts durch

        System.out.println(americano.getName());
        System.out.println(americano.getNameInSchoen());

    }
}
