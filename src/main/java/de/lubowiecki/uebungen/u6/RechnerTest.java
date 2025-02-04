package de.lubowiecki.uebungen.u6;

public class RechnerTest {

    public static void main(String[] args) {

        System.out.println(Rechner.add(10.5, 22.7));

        double erg1 = Rechner.add(10.5, 22.7);
        double erg2 = Rechner.sub(10.5, 22.7);
        double erg3 = Rechner.multi(10.5, 22.7);
        double erg4 = Rechner.div(10.5, 22.7);
        System.out.println(erg1 + ", " + erg2 + ", " + erg3 + ", " + erg4);


    }
}
