package de.lubowiecki.uebungen.u2;

public class Fahrzeug {

    public static int anzahl;

    private String kennzeichen;
    private String marke;
    private String modell;
    private int kmStand;
    private int nr;

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        // kmStand bekommt automatisch 0
        nr = ++anzahl;
    }

    public void fahre50Km() {
        kmStand += 50; // kmStand = kmStand + 50;
    }

    public void fahreKm(int km) {
        if(km >= 0)
            kmStand += km; // kmStand = kmStand + km;
    }


    @Override
    public String toString() {
        return "Fahrzeug{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", kmStand=" + kmStand +
                ", nr=" + nr +
                '}';
    }
}
