package de.lubowiecki.uebungen.u8;

import java.util.Random;
import java.util.Scanner;

public class Pilzsuche {

    /*
    Übung 3 (leichter)
    Schreibe ein Programm, dass das Spiel Pilzsuche realisiert.
    Beim Starten des Programms wird ein 10 Zeilen und 10 Spalten großes Spielfeld erzeugt. Danach
    werden automatisch 10 „Pilze“ positioniert. Jedes Pilz wird auf einer x/y-Koordinate platziert.
    Danach hat der Spieler 10 Versuche Zeit so viele Pilze wie möglich durch Eingabe der
    Koordinaten zu finden.

    Nach 10 Versuchen endet das Spiel und es wird die Anzahl der gefundenen Pilze angezeigt.

    Erweiterung
    Der Spieler wird gefragt, ob er noch ein weiteres Mal spielen möchte.
     */

    /* Schritte
    1. 10 Zeilen und 10 Spalten großes Spielfeld: erledigt
    2. automatisch 10 „Pilze“ positionieren: erledigt
    3. 10 Versuche Zeit so viele Pilze wie möglich durch Eingabe zu finden
    4. Nach 10 Versuchen endet das Spiel
     */

    private final int ANZAHL_ZEILEN;
    private final int ANZAHL_REIHEN;

    private int[][] wald;

    private final Random zufallsGenerator = new Random();

    private final Scanner scanner = new Scanner(System.in);

    // Konstruktoren sind Methoden, die IMMER das Objekt als return haben
    public Pilzsuche(int zeilen, int reihen) {
        ANZAHL_ZEILEN = zeilen;
        ANZAHL_REIHEN = reihen;
        wald = new int[ANZAHL_ZEILEN][ANZAHL_REIHEN];

    }

    public static void main(String[] args) {
        Pilzsuche pilzsuche = new Pilzsuche(10, 10);
        pilzsuche.pilzeVerteilen(15);
        pilzsuche.waldAusgeben(false);
        pilzsuche.starteSuche(10);
    }

    public void starteSuche(int anzahlVersuche) {

        int versuch = 1;
        int gefundenePilze = 0;

        while(versuch <= anzahlVersuche) {
            System.out.println("\nVersuch " + versuch + " von " + anzahlVersuche);
            System.out.print("\nZeile: ");
            int zeile = scanner.nextInt();
            System.out.print("Reihe: ");
            int reihe = scanner.nextInt();

            if(wald[zeile][reihe] == 1) {
                System.out.println("Du hast einen Pilz gefunden.");
                wald[zeile][reihe] = 2;
                gefundenePilze++;
            }
            else if(wald[zeile][reihe] == 2) {
                System.out.println("Diesen Pilz hast du schon gehabt.");
            }
            else {
                System.out.println("Nichts gefunden!");
            }

            versuch++;
            waldAusgeben(true);

            // TODO: Spiel vorzeitig beenden, wenn alle Pilze gefunden sind
        }

        System.out.println("Spiel ist beendet.");
        System.out.println("Du hast " + gefundenePilze + " Pilze gefunden.");
    }

    public void pilzeVerteilen(int anzahl) {

        int gesetzt = 0;

        // Per Zufall verteilen
        while(gesetzt < anzahl) {
            // Zeile per Zufall bestimmen
            int zeile = zufallsGenerator.nextInt(ANZAHL_ZEILEN);
            // Reihe per Zufall bestimmen
            int reihe = zufallsGenerator.nextInt(ANZAHL_REIHEN);

            // Wenn Position schon belegt, dann an eine andere Stelle setzen
            // continue: startet wider am Anfang des Blocks
            if(wald[zeile][reihe] > 0) continue;

            wald[zeile][reihe] = 1;
            gesetzt++;
        }
    }

    // Instanzmethoden brauchen eine Objekt
    public void waldAusgeben(boolean nurGefundeneAnzeigen) {
        // Ausgabe
        for(int[] zeile : wald) {
            for(int reihe : zeile) {
                if(nurGefundeneAnzeigen) {
                    if (reihe == 2) {
                        System.out.print("X ");
                    } else {
                        System.out.print("? ");
                    }
                }
                else {
                    System.out.print(reihe + " ");
                }
            }
            System.out.println(); // Zeilenumbruch
        }
    }

}
