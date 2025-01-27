package de.lubowiecki;

public class PersonenTest {

    public static void main(String[] args) {

        // Ein Objekt ist eine Sammlung unterschiedlicher Informationen
        // und Fähigkeiten (Methoden)
        Person p1 = new Person(); // Aus dem Bauplan(Klasse) wird ein Person-Objekt gebaut
        p1.vorname = "Peter"; // Wertzuweisung
        p1.nachname = "Parker"; // Wertzuweisung
        p1.alter = 25; // Wertzuweisung
        p1.fuehrerschein = true;
        p1.sagHallo();

        Person p2 = new Person("Peter", "Parker", 46, false);
        p2.sagHallo();

        Person p3 = new Person("Carol", "Danvers", 32, true);
        p3.sagHallo();

    }
}
