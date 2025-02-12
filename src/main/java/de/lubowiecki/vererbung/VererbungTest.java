package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VererbungTest {

    public static void main(String[] args) {

        Pkw p1 = new Pkw("HH:AB123", "VW", "ID.3");
        p1.bewege(10, 15);
        System.out.println(p1);

        System.out.println();

        p1.einsteigen("Peter");
        p1.einsteigen("Bruce");
        p1.einsteigen("Carol");
        p1.einsteigen("Steve");
        p1.einsteigen("Natasha");
        p1.einsteigen("Scott");
        p1.bewege(10, 15);
        System.out.println(p1);

        System.out.println();

        Lkw l1 = new Lkw("HH:XY345", "Mercedes", "Actros");
        l1.bewege(10, 15);
        System.out.println(l1);

        System.out.println();

        l1.einsteigen("Hans");
        l1.beladen("Mehl");
        l1.bewege(10, 15);
        System.out.println(l1);

        // Pkw IS-A Fahrzeug
        // Lkw IS-A Fahrzeug

        Fahrzeug f1 = new Pkw("AB:XY234", "Ford", "Ka");
        f1 = new Lkw("AB:GU227", "Scania", "234");

//        Object o = 123;
//        o = "Moin";



    }
}

abstract class Fahrzeug {

    // Auch in erbenden Klassen sichtbar
    protected String kennzeichen;

    protected String marke;

    protected String modell;

    // Position des Fahrzeugs
    protected int x;
    protected int y;

    // Personen, die gerade im Fahrzeug sitzen
    protected List<String> insassen = new ArrayList<>();

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    // Hat eine Klasse abstrakte Methoden, muss die Klasse auch abstrakt sein
    // Abstrakt = Nicht vollständig ausprogrammiert/implementiert
    // Kindklasse wird verpflichtet die abstrakten Methoden zu implementieren
    public abstract void einsteigen(String name);

    public abstract void bewege(int x, int y);
}

// Pkw ist auch ein Fahrzeug und erbt alle (nicht private) Eigenschaften und Methoden vom Fahrzeug
class Pkw extends Fahrzeug {

    public Pkw(String kennzeichen, String marke, String modell) {
        // Benutzt den Konstruktor von Fahrzeug
        super(kennzeichen, marke, modell);
    }

    public void einsteigen(String name) {
        if(insassen.size() < 5) // Max. 5 Personen
            insassen.add(name);
    }

    public void bewege(int x, int y) {
        if(!insassen.isEmpty()) { // Nur bewegen, wenn Insassen vorhanden
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pkw{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", insassen=").append(insassen);
        sb.append('}');
        return sb.toString();
    }
}

class Lkw extends Fahrzeug {

    // Dinge die der LKW geladen hat
    private List<String> ladung = new ArrayList<>();

    public Lkw(String kennzeichen, String marke, String modell) {
        super(kennzeichen, marke, modell);
    }

    public void einsteigen(String name) {
        if(insassen.size() < 2) // Max. 2 Personen
            insassen.add(name);
    }

    public void beladen(String zeug) {
        if(ladung.size() < 10) // Max. 10 Dinge
            ladung.add(zeug);
    }

    public void bewege(int x, int y) {
        // Nur bewegen, wenn Insassen vorhanden
        // Nur bewegen, wenn Ladung vorhanden
        if(!insassen.isEmpty() && !ladung.isEmpty()) {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lkw{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", insassen=").append(insassen);
        sb.append(", ladung=").append(ladung);
        sb.append('}');
        return sb.toString();
    }
}
