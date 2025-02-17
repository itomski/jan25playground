package de.lubowiecki.exceptions;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjekteSchreibenUndLesen {

    private static final String FILE = "products.ser";

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Mütze", 10, 19.99));
        produkte.add(new Produkt("Handschuhe", 20, 17.29));
        produkte.add(new Produkt("Socken", 50, 8.99));

        saveToFile(produkte);

        // produkte = readFromFile();

    }

    private static void saveToFile(List<Produkt> produkte) {

        // Serialisierung = Objekte werden automatisch in Text/Bytecode übersetzt
        // new FileOutputStream(FILE): Schreibende Verbindung zu der Datei
        // ObjectOutputStream: Möglichkeit Objekte zu schreiben
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(produkte); // Schreibt die Liste inkl. der Produkte in die Datei
        }
        catch(IOException e) {
            System.out.println("Daten konnten nicht gespeichert werden.");
            System.out.println(e.getMessage()); // Zeigt die Nachricht der Exception
            e.printStackTrace(); // Komplette Meldung - Nur fürs Debugging gedacht
        }
    }
}
