package de.lubowiecki;

public class Lager {

    private int groesse;

    private String[] produkte;

    private int next = 0;

    public Lager(int groesse) {
        // this.groesse = Instanzvariable
        // groesse = Lokale Variable / Methodenparameter
        this.groesse = groesse;
        produkte = new String[groesse];
    }

    public Lager() {
        // Da hier keine lokale Variable mit gleichen Namen vorhanden ist,
        // ist groesse automatisch die Instanzvariable. Auf this kann verzichtet werden
        groesse = 5;
        produkte = new String[groesse];
    }

    public boolean hinzufuegen(String produkt) {
        if(next < groesse) {
            produkte[next] = produkt;
            next++;
            return true;
        }
        else {
            return false;
        }
    }

    // Getter: Ist nötig, das das Array-Produkte private ist
    // d.h. von außerhalb der Klasse gibt es keinen Zugriff darauf
    public String[] getProdukte() {
        return produkte;
    }
}
