package de.lubowiecki.patterns.factory;

import java.time.LocalDate;
import java.time.Year;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("VW", "ID3", 2025, Farbe.BLAU);
        System.out.println(f1);

        Fahrzeug f2 = new Fahrzeug();
        f2.setMarke("VW");
        f2.setModell("ID3");
        f2.setBaujahr(2025);
        f2.setFarbe(Farbe.BLAU);
        System.out.println(f2);

        Fahrzeug f3 = createVwId3(Farbe.GRAU); // Erzeugung des Objekts wird in der Methode versteckt
        System.out.println(f3);

        // Durch eine Factory (Fabrik) wird die Objekterzeugung vereinfacht.
        // Man verliert dadurch aber die Flexibilität

        System.out.println(createVwId3(Farbe.GRUEN));
        System.out.println(createVwId3(Farbe.SCHWARZ));

        // Details der Objekterzeugung sind in der Methode versteckt
        System.out.println(createRenaultZoe(Farbe.BLAU));

        LocalDate.now(); // now ist auch eine Frabrik für LocalDate

        // Überall, wo eine Methode ein Objekt erzeugt und Details der Erzeugung versteckt
        // haben wir eine Art Fabrik

        System.out.println();

        Factory fabrik = new VwFactory("Sharan"); // Diese Fabrik baut nur VW Sharan
        System.out.println(fabrik.create(Farbe.SCHWARZ));
        System.out.println(fabrik.create(Farbe.BLAU));
        System.out.println(fabrik.create(Farbe.ROT));

        System.out.println();

        fabrik = new VwFactory("Golf"); // Fabrik für VW Golf
        System.out.println(fabrik.create(Farbe.SCHWARZ));
        System.out.println(fabrik.create(Farbe.BLAU));
        System.out.println(fabrik.create(Farbe.ROT));

        System.out.println();

        fabrik = new RenaultFabrik("R5"); // Fabrik für Renault R5
        System.out.println(fabrik.create(Farbe.SCHWARZ));
        System.out.println(fabrik.create(Farbe.BLAU));
        System.out.println(fabrik.create(Farbe.ROT));
    }

    private static Fahrzeug createVwId3(Farbe farbe) {
        return new Fahrzeug("VW", "ID3", Year.now().getValue(), farbe);
    }

    private static Fahrzeug createRenaultZoe(Farbe farbe) {
        return new Fahrzeug("Renault", "Zoe", Year.now().getValue(), farbe);
    }
}
