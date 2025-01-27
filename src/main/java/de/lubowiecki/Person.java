package de.lubowiecki;

public class Person {

    // String = Text
    public String vorname;

    public String nachname;

    public int alter;

    public boolean fuehrerschein;

    // Erzeugt ein leeres Person-Objekt
    public Person() {
    }

    // Konstruktoren erzeugen ein Objekt nach Vorgabe
    // Heißen IMMER gleich wie die Klasse
    public Person(String vorname, String nachname, int alter, boolean fuehrerschein) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.fuehrerschein = fuehrerschein;
    }

    // Methoden führen Aktivitäten auf Basis der Eigenschaften aus
    public void sagHallo() {
        System.out.println("Hallo! Mein Name ist " + vorname + " " + nachname);
    }

    public void sagAlter() {
        System.out.println("Ich bin " + alter + " Jahre alt.");
    }

    public void hatFuehrerschein() {
        if(fuehrerschein) {
            System.out.println("Ich habe einen Führerschein.");
        }
        else {
            System.out.println("Ich habe noch keinen Führerschein.");
        }
    }

    // Methode zum konvertieren in einen String

    @Override
    public String toString() {
        return vorname + ", " + nachname + ", " + alter + ", " + fuehrerschein;
    }
}
