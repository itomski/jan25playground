package de.lubowiecki.exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjekteSchreibenUndLesen {

    private static final String FILE = "products.ser";

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
//        produkte.add(new Produkt("Mütze", 10, 19.99));
//        produkte.add(new Produkt("Handschuhe", 20, 17.29));
//        produkte.add(new Produkt("Socken", 50, 8.99));

//        saveToFile(produkte);

        produkte = readFromFile();
        for(Produkt p : produkte) {
            System.out.println(p);
        }

        System.out.println();

        // Daten für das Produkt abfragen
        Scanner scanner = new Scanner(System.in);
        Produkt p = new Produkt();
        System.out.print("Name: ");
        p.setName(scanner.next());
        System.out.print("Anzahl: ");
        p.setAnzahl(scanner.nextInt());
        System.out.print("Preis: ");
        p.setPreis(scanner.nextDouble());

        // Produkt der Liste hinzufügen
        produkte.add(p);

        saveToFile(produkte); // Aktuellen Zustand der Liste speichern
    }

    private static List<Produkt> readFromFile() {

        // Input = Einlesen
        // Deserialisierung = Bytecode in Objekte übersetzen
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            return (List<Produkt>) ois.readObject(); // Liest das serialisierte Objekt ein und deserialisiert es
        }
        catch(IOException e) {
            System.out.println("Lesen aus der Datei ist nicht möglich.");
        }
        catch(ClassNotFoundException e) { // Wenn für die serialisierten Objekte keine passende Klasse gefunden wird
            System.out.println("Daten konnten nicht rekonstruiert werden");
        }

        return new ArrayList<>(); // Bei Fehlern eine leere Liste zurückgeben
    }

    private static void saveToFile(List<Produkt> produkte) {

        // Output = Schreiben
        // Serialisierung = Objekte werden automatisch in Text/Bytecode übersetzt
        // new FileOutputStream(FILE): Schreibende Verbindung zu der Datei
        // ObjectOutputStream: Möglichkeit Objekte zu schreiben
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(produkte); // Schreibt die Liste inkl. der Produkte in die Datei
        }
        catch(IOException e) {
            e.printStackTrace(); // Komplette Meldung - Nur fürs Debugging gedacht
        }
    }
}
