package de.lubowiecki.datenbanken;

// Entity = Dinge die in der Anwendung verwaltet werden
public class Kunde {

    // Spalten aus der Tabelle werden zu eingenschaften

    private int id;
    private String vorname;
    private String nachname;
    private boolean aktiv;

    public Kunde() {
    }

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", aktiv=").append(aktiv);
        sb.append('}');
        return sb.toString();
    }
}
