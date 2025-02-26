package de.lubowiecki.datenbanken;

// abstract = Es können keine Objekte direkt erzeugt werden
// Es muss zuerst geerbt werden

public abstract class AbstractEntity {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
