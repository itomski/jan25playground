package de.lubowiecki.collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>(); // Nicht sortiert
        // Jeder Schlüssel darf nur 1x vorliegen
        einwohner.put("Hamburg", 2_000_000);
        einwohner.put("Berlin", 4_000_000);
        einwohner.put("Bremen", 600_000);
        einwohner.put("München", 1_200_000);
        einwohner.put("Kiel", 400_000);

        System.out.println(einwohner.get("München")); // get liefert den Wert hinter dem Schlüssel
        System.out.println(einwohner.get("Düsseldorf")); // null, wenn nicht vorhanden

        // getOrDefault liefert den Wert hinter dem Schlüssel, wenn nicht vorhanden dann 0
        System.out.println(einwohner.getOrDefault("Düsseldorf", 0));
        System.out.println(einwohner.getOrDefault("Bremen", 0));

        einwohner.put("Bremen", 800_000); // Wert an einem vorhandenen Schlüssel wird überschrieben
        System.out.println(einwohner);

        System.out.println();

        // TreeMap: Sortiert nach den Schlüsseln: LocalDateTime
        Map<LocalDateTime, String> cal = new TreeMap<>();
        cal.put(LocalDateTime.of(2025, 5, 1, 20, 0), "Essen mit Carol");
        cal.put(LocalDateTime.of(2025, 2, 27, 15, 22), "Einkaufen");
        cal.put(LocalDateTime.of(2025, 3, 2, 10, 30), "Prüfung");

        //System.out.println(cal);

        final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        for(Map.Entry<LocalDateTime, String> eintrag : cal.entrySet()) {
            // key = Schlüssel
            // value = Wert hinter dem Schlüssel
            System.out.println(eintrag.getKey().format(FMT) + " - " + eintrag.getValue());
        }

        // Properties sind Schlüssel/Wertpaare
        // Abfrage erfolgt mit dem Schlüssel
        System.out.println(System.getProperty("user.home")); // user.home = Schlüssel
        System.out.println(System.getProperty("java.specification.version"));

        System.out.println(System.getProperties());

    }
}
