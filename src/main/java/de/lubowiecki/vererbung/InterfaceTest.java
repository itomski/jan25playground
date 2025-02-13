package de.lubowiecki.vererbung;

// Top-Level-Klassen sind IMMER public oder package-private
// protected und private sind nicht erlaubt!!!!

public class InterfaceTest {

    public static void main(String[] args) {

        Fahrrad f = new Fahrrad();
        f.bewege(20, 25);
        f.bewege(17, 0);

        System.out.println();

        Bewegbar b = new Fahrrad();
        b.bewege(17, 0);

        GibtLicht l = new Fahrrad();
        l.leuchten(); // Die Referenz eines Interface bietet nur Methoden an, die darin deklariert sind

        l = new Lampe();
        l.leuchten();

    }

    // Innere-Klasse (nicht Top-Level) können auch static, protected und private sein
    private class Inner {

    }
}

// Ein Interface beschreibt, was eine Klasse können muss
// d.h. welche Methoden sie realisieren/implementieren/einbauen muss
// Das Interface beschreibe die öffentliche Schnittstelle d.h. alle Methoden und Eigenschaften sind public

// Interfaces sind IMMER abstrakt
interface Bewegbar {

    // automatisch IMMER public
    // wenn kein Body verfügbar - automatisch abstract
    void bewege(int x, int y);

}

interface GibtLicht {

    void leuchten();
}

// Bei Interfaces benutzt man immer implements
// Das Fahrrad realisiert das Interface
class Fahrrad implements Bewegbar, GibtLicht  { // Implementiert 2 Interfaces

    private int x;
    private int y;

    @Override
    public void bewege(int x, int y) {
        // Die Klasse muss die Methode einbauen
        this.x = x;
        this.y = y;
        System.out.printf("Das Fahrrad wurde nach %d / %d bewegt \n", x, y);
    }

    @Override
    public void leuchten() {
        System.out.println("Die Fahrradleuchte leuchtet hell.");
    }
}

class Lampe implements GibtLicht {

    @Override
    public void leuchten() {
        System.out.println("Lampe leuchtet hell");
    }
}