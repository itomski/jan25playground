package de.lubowiecki.exceptions;

import java.io.Serializable;

// Serializable ist ein Marker-Interface = hat keine Methoden
// Es muss eingebunden werden um anzuzeigen, dass Objejte dieser Klasse
// serialisierbar sind
public class Produkt implements Serializable {

    private String name;
    private int anzahl;
    private double preis;

    public Produkt() {
    }

    public Produkt(String name, int anzahl, double preis) {
        this.name = name;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        final StringBuilder sb = new StringBuilder("Produkt{");
        sb.append("name='").append(name).append('\'');
        sb.append(", anzahl=").append(anzahl);
        sb.append(", preis=").append(preis);
        sb.append('}');
        return sb.toString();
    }
}
