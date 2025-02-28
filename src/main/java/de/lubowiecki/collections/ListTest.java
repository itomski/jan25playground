package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListTest {

    public static void main(String[] args) {

        //List<String> namen = new ArrayList<>(); // Basiert auf einem Array
        // Wahlffreier Zugriff sehr schnell
        // Hinzufügen und Entfernen mittendin sind langsamer und führen zu Verschiebungen im Array
        // Das Array muss ggfl vergrößert oder verkleinert werden

        List<String> namen = new LinkedList<>(); // Basiert auf Objektbeziehungen
        // Wahlffreier Zugriff langsam
        // Hinzufügen und Entfernen mittendin ist sehr schnell

        namen.add("Peter");
        namen.add("Bruce");
        namen.add(1, "Carol");
        System.out.println(namen.get(2));

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        // Listen sind Speicher für das Aufbewahlen von Elementen
        // Queues sind Durchgangsspeicher (wertden befüllt und entleert)

        // Referenztyp: Queue<String>
        // Objekttyp: LinkedList<String> (Typ auf dem Heap)
        Queue<String> namenQ = new LinkedList<>();
        // LinkedList<String> namenQ = new LinkedList<>();
        // Wir können über die Variable die Methoden des Referenztyps benutzen
        namenQ.offer("Peter");
        namenQ.offer("Bruce");
        namenQ.offer("Carol");

        System.out.println(namenQ);

        System.out.println(namenQ.element()); // Zeigt das Element am Anfang der Warteschlange
        System.out.println(namenQ.poll()); // Entnimmt das Element am Anfang der Warteschlange
        System.out.println(namenQ.poll());
        System.out.println(namenQ.poll());
        System.out.println(namenQ);
    }
}
