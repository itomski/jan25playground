package de.lubowiecki.api;


import java.time.LocalDate;

public class Artikel {

    private String name;

    private int anzahl;

    private double maxPreis;

    private boolean gekauft;

    private LocalDate datum;

    public Artikel() {
        // super(); // Aufruf des Konstruktors der Elternklasse (Object)
        System.out.println("NO-PARAM-K");
    }

    public Artikel(String name, int anzahl) {
        // super();
        this.name = name;
        setAnzahl(anzahl);
        System.out.println("2-PARAM-K");
    }

    public Artikel(String name, int anzahl, double maxPreis, boolean gekauft, LocalDate datum) {
        this(name, anzahl); // Aufruf des Konstruktors mit 2 Parametern. super wird hier nicht mehr verwendet
        setMaxPreis(maxPreis);
        this.gekauft = gekauft;
        setDatum(datum);
        System.out.println("5-PARAM-K");
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
        if(anzahl >= 0) this.anzahl = anzahl;
    }

    public double getMaxPreis() {
        return maxPreis;
    }

    public void setMaxPreis(double maxPreis) {
        if(maxPreis >= 0) this.maxPreis = maxPreis;
    }

    public boolean isGekauft() {
        return gekauft;
    }

    public void setGekauft(boolean gekauft) {
        this.gekauft = gekauft;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        if(datum.isAfter(LocalDate.now().minusDays(1))) this.datum = datum;
    }
}
