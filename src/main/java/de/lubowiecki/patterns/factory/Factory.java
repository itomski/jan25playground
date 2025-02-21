package de.lubowiecki.patterns.factory;

import java.time.Year;

public abstract class Factory {

    private final String marke;

    private final String modell;

    private final int baujahr;

    public Factory(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = Year.now().getValue();
    }

    public Fahrzeug create(Farbe farbe) {
        return new Fahrzeug(getMarke(), getModell(), getBaujahr(), farbe);
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }
}
