package de.lubowiecki.api;

public class VererbungTest {

    public static void main(String[] args) {

        // Fahrzeug f1 = new Fahrzeug();

        PKW p1 = new PKW();
    }
}

// Erbt von Object
class Fahrzeug {

    public Fahrzeug() {
        // super();
        System.out.println("K: Fahrzeug");
    }
}

// Erbt von Fahrzeugt
class PKW extends Fahrzeug {

    public PKW() {
        super();
        System.out.println("K: PKW");
    }
}