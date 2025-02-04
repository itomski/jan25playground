package de.lubowiecki;

public class Produktverwaltung {

    public static void main(String[] args) {

        // new erzeugt aus der Klasse ein Objekt
//        Produkt p1 = new Produkt();
        Produkt p1 = new Produkt(123, "Mütze", "Bla bla bla", 200, 15.99);
        System.out.println(p1.getName()); // Zustand wird abgefragt
        p1.setName("Woll-Mütze"); // Zustand wird geändert
        p1.setPreis(20.99);

        System.out.println(p1.getName());
        p1.setName("");
        System.out.println(p1.getName());
        p1.setName(" ");
        System.out.println(p1.getName());
        p1.setName(null);
        System.out.println(p1.getName());

        System.out.println(p1); // Ruft automatisch toString-Methode auf

        Produkt[] arr = new Produkt[5]; // Array von Produkten
        int nr = 0;
        arr[0] = new Produkt(++nr, "Socken", "...", 150, 7.99);
        arr[1] = new Produkt(++nr, "Tasse, blau", "...", 50, 2.99);
        arr[2] = new Produkt(++nr, "Handtuch", "...", 25, 15.99);
        arr[3] = new Produkt(++nr, "Seife", "...", 250, 1.99);
        arr[4] = new Produkt(++nr, "Badelatschen", "...", 10, 12.99);

        for(var p : arr) { // var ist Java 10 möglich
            System.out.println(p);
        }

        // Jede Klasse ist ein komplexer Datentyp

    }
}
