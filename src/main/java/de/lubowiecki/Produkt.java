package de.lubowiecki;

public class Produkt {

    private int nr;

    // private = Die Klasse kann diese Eigenschaft benutzen
    // für andere Klassen ist diese NICHT sichtbar
    private String name;

    private String beschreibung;

    private int anzahl;

    private double preis;

    // Wenn kein eigener Kostruktor definiert ist
    // stellt Java automatisch einen leeren Konstruktor bereit
    // default Konstruktor
    public Produkt() {
    }

    // Wenn ein eigener Konstruktor definiert wurde, stellt Java keinen default Konstruktor mehr bereit
    public Produkt(int nr, String name, String beschreibung, int anzahl, double preis) {
        this.nr = nr;
        this.name = name;
        this.beschreibung = beschreibung;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // trim entfernt nicht benötigte Leerzeichen ab beiden Enden
        if(name != null && name.trim().length() > 0) {
            this.name = name.trim();
        }
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nr=" + nr +
                ", name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", anzahl=" + anzahl +
                ", preis=" + preis +
                '}';
    }
}