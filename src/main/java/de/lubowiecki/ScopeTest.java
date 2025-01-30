package de.lubowiecki;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ScopeTest {

    // Scope = Geltungsbereich
    public static void main(String[] args) {

        int i = 10; // Bis zu Ende des blocks gültig in dem sie deklariert wurde
        //machWas();

        {
            int x = 200; // Bis zu Ende des blocks gültig in dem sie deklariert wurde
            System.out.println(x);
        } // Am Ende des Blocks wird x vom Speicher entfernt

        while(true) { // Block
            int z = 200; // Bis zu Ende des blocks gültig in dem sie deklariert wurde
            System.out.println(i); // i ist in einem Block darüber deklariert, daher hier auch sichtbar
            break;
        } // z wird vom Speicher entfernt

        // System.out.println(z); // Error: z ist nicht mehr verfügbar

        int x = 300;

        System.out.println();

        boolean exit = false;

        String meldung; // Bis zu ende der Main-Methode sichtbar

        if(exit) {
            meldung = "Wird verlassen";
        }
        else {
            meldung = "Läuft noch";
        }

        System.out.println(meldung);

        System.out.println(UtilityKlasse.ZAHL);
        UtilityKlasse.ZAHL = 355;
        System.out.println(UtilityKlasse.ZAHL);
    }

    static void machWas() {
        int i = 20; // Bis zu Ende des blocks gültig in dem sie deklariert wurde
    }
}
