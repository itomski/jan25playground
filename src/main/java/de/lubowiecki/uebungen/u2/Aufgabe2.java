package de.lubowiecki.uebungen.u2;

public class Aufgabe2 {

    // Schreibe eine Klasse für ein Fahrzeug
    // Es enthält ein Kennzeichen, Marke, Modell und die gefahrenen Kilometer
    // mit einer Methode fahre() kann die Anzahl gefahrener Kilometer verändert werden
    // dabei wird bei Aufruf der Methode die Strecke in km vorgegeben

    // Instanziere zwei unterschiedliche Fahrzeuge.
    // Fahre damit etwas rum und gib den Zustand der Fahrzeuge anschließen aus

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH:AB-123", "VW", "ID.3");
        f1.fahre50Km();
        f1.fahre50Km();
        f1.fahre50Km();
        f1.fahre50Km();
        f1.fahreKm(175);
        System.out.println(f1);

        //f1.anzahl = -25;

        Fahrzeug f2 = new Fahrzeug("HH:XY-225", "Volvo", "V70");
        f2.fahreKm(3000);
        System.out.println(f2);

        //Fahrzeug.anzahl = 10;

        Fahrzeug f3 = new Fahrzeug("HB:OP-1822", "Ford", "Ka");
        f3.fahreKm(-222);
        System.out.println(f3);

    }
}
