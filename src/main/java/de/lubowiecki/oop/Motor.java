package de.lubowiecki.oop;

public class Motor {

    private final String typ;

    private final String modellNr;

    private final int anzahlZilinder;

    private final int staerkeInPs;

    private final double hubraum;

    // Finale Instanzvariablen müssen gleich einen Wert zugeweisen bekommen
    // oder spätestens im Konstruktor gesetzt werden


    public Motor(String typ, String modellNr, int anzahlZilinder, int staerkeInPs, double hubraum) {
        this.typ = typ;
        this.modellNr = modellNr;
        this.anzahlZilinder = anzahlZilinder;
        this.staerkeInPs = staerkeInPs;
        this.hubraum = hubraum;
    }

    public String getTyp() {
        return typ;
    }

    public String getModellNr() {
        return modellNr;
    }

    public int getAnzahlZilinder() {
        return anzahlZilinder;
    }

    public int getStaerkeInPs() {
        return staerkeInPs;
    }

    public double getHubraum() {
        return hubraum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motor{");
        sb.append("typ='").append(typ).append('\'');
        sb.append(", modellNr='").append(modellNr).append('\'');
        sb.append(", anzahlZilinder=").append(anzahlZilinder);
        sb.append(", staerkeInPs=").append(staerkeInPs);
        sb.append(", hubraum=").append(hubraum);
        sb.append('}');
        return sb.toString();
    }
}
