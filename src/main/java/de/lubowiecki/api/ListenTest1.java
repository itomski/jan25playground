package de.lubowiecki.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListenTest1 {

    public static void main(String[] args) {

        int[] arr = {1,2,5,7,9};

        // Vor Java 1.9
        List<Integer> werte = Arrays.asList(1,2,5,7,9); // Fixed-Size

        // Ab Java 1.9
        werte = List.of(1,2,5,7,9); // Fixed-Size

        // ArrayList<Integer> zahlen = new ArrayList<>(werte); // Gefüllte ArrayList
        // ArrayList<Integer> zahlen = new ArrayList<>(Arrays.asList(1,2,5,7,9)); // Gefüllte ArrayList

        // Es werden alle Elemente von List.of(...) in die ArraysList übernommen
        ArrayList<Integer> zahlen = new ArrayList<>(List.of(1,2,5,7,9)); // Gefüllte ArrayList
        zahlen.add(8);
        zahlen.add(22);

        ArrayList<Integer> zweiteListe = new ArrayList<>(zahlen);
        System.out.println(zweiteListe);

        List<Integer> zahlen2 = new ArrayList<>(zahlen);
        zahlen2 = new LinkedList<>(zahlen2); // Wechsel von ArrayList auf LinkedList
        zahlen2 = new ArrayList<>(zahlen2); // Wechsel von LinkedList auf ArrayList
    }
}
