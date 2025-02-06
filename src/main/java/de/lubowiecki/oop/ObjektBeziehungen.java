package de.lubowiecki.oop;

public class ObjektBeziehungen {

    public static void main(String[] args) {

        // IS-A (wird durch Vererbung Realisiert) Student IS-A Mensch
        // HAS-A: Auto HAS-A Motor, Auto HAS-A Reifen
        // 1 zu 1, 1 zu n, n zu m

        Motor m1 = new Motor("Benzin", "123ABC1522X", 8, 200, 3.0);
        System.out.println(m1);

        Fahrzeug f1 = new Fahrzeug("HH-AB123", "VW", "Polo", 2015, 40_000);
        f1.setMotor(m1); // Der Motor wird in das Fahrzeug eingefügt (Objektbeziehung)

        System.out.println(f1);
    }
}
