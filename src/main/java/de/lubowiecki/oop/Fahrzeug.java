package de.lubowiecki.oop;

public class Fahrzeug {

    private String kennzeichen;

    private String marke;

    private String modell;

    private int baujahr;

    private int kmStand;

    // Hier wird ein Motor-Objekt abgelegt d.h. HAS-A Beziehung (1:1)
    private Motor motor;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, int kmStand) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append(", kmStand=").append(kmStand);
        sb.append(", motor=").append(motor);
        sb.append('}');
        return sb.toString();
    }
}
