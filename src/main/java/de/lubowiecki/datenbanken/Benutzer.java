package de.lubowiecki.datenbanken;

public class Benutzer extends AbstractEntity {

    // Durch Vererbung ist hioer die Id enthalten
    private String vorname;

    private String nachname;

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
}
