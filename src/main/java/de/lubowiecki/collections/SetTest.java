package de.lubowiecki.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> namen = new HashSet<>(); // HashSet ist eine hash basierte Datenstruktur
        namen.add("Peter");
        namen.add("Carol");
        System.out.println(namen.add("Bruce"));
        System.out.println(namen.add("Peter")); // Duplikate werden abgelehnt
        System.out.println(namen.add("Steve"));
        namen.add("Tony");

        System.out.println(namen); // Reihenfolge im HashSet ist nicht vorhersehbar

        if(namen.contains("Tony")) {
            System.out.println("Tony ist enthalten.");
        }

        namen.remove("Steve");

        System.out.println(namen);

        System.out.println();

        Set<Thing> zeug = new HashSet<>();
        zeug.add(new Thing("Mixer", 0.75));
        zeug.add(new Thing("Tasse", 0.25));
        zeug.add(new Thing("Tisch", 25.5));
        zeug.add(new Thing("Tisch", 25.5)); // Gleichheit wird über hashCode und equals ermittelt

        // Bei eigenen Klassen muss hashCode und equals richtig eingebaut sein,
        // damit Duplikate gefunden werden können

        System.out.println(zeug);

        // Keine Duplikate
        // Ist immer sortiert
        Set<Integer> tree = new TreeSet<>();
        tree.add(15);
        tree.add(-5);
        tree.add(22);
        tree.add(1);
        tree.add(8);
        System.out.println(tree);

        // Bei eigenen Klassen ist die Sortierung nicht klar
        // daher muss entweder das Comparable-Interface implementiert werden (natürliche Reihenfolge)
        // Oder ein Coparator vorgegeben werden

        // Elemente des HashSets werden in das TreeSet eingefügt
        Set<Thing> zeugTree = new TreeSet<>(zeug);
        zeugTree.add(new Thing("Feder", 0.01));
        System.out.println(zeugTree);
    }
}
