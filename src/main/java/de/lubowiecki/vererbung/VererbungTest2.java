package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class VererbungTest2 {

    public static void main(String[] args) {

        // Hund IS-A Tier
        // Katze IS-A Tier

        // Referenztyp: Tier
        // Objekttyp auf dem Heap: Hund
        Tier t1 = new Hund();
        t1 = new Katze();
        t1 = new Wurm();
        t1 = new Lindwurm(); // Listndwurm IS-A Wurm IS-A Tier

        t1.zeigeVerhalten();

        // Referenztyp: Tier
        // Objekttyp auf dem Heap: Katze
        t1.zeigeVerhalten();

        t1.zeigeVerhalten();

        t1 = new Hund();
        // t1.spieleMitEinemBall(); // Diese Methode ist über eine Tier-Referenz nicht sichtbar
        ((Hund)t1).spieleMitEinemBall(); // Mit einem Cast geht es

        t1 = new Katze();
        //((Hund)t1).spieleMitEinemBall(); // ClassCastException, Objekttyp ist Katze

        System.out.println();

        List<Tier> tiere = new ArrayList<>();
        tiere.add(new Hund());
        tiere.add(new Katze());
        tiere.add(new Hund());
        tiere.add(new Wurm());
        tiere.add(new Lindwurm());

        // Hier wird ein Typ verwendet, den alle enthaltenen Objekte gemeinsam haben: Tier
        for(Tier t : tiere) {
            if(t instanceof Hund) // Prüft, ob das Objekt auf dem Heap ein Hund ist
                t.zeigeVerhalten(); // wird auf dem echten Objekt auf dem Heap ausgeführt
        }
    }
}

class Tier {

    // super ist eine Referenz auf Object

    public void zeigeVerhalten() {
        System.out.println("Unbekannt");
    }
}

class Hund extends Tier {

    // Erbt die zeigeVerhalten-Methode von Tier
    // Ersetzt sie aber mit einer eigenen Version
    @Override
    public void zeigeVerhalten() {
        System.out.println("Bellt Leute an!");
    }

    public void spieleMitEinemBall() {
        System.out.println("Es wird mit dem Ball gespielt!");
    }

}

class Katze extends Tier {

    // Erbt die zeigeVerhalten-Methode von Tier
    // Ersetzt sie aber mit einer eigenen Version
    @Override
    public void zeigeVerhalten() {
        System.out.println("Kratzt die Leute...");
    }
}

class Wurm extends Tier {

    // Erbt die zeigeVerhalten-Methode von Tier

    // super ist eine Referenz auf Tier
}

class Lindwurm extends Wurm {

    // super ist eine Referenz auf Wurm
}