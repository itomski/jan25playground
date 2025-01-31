package de.lubowiecki;

public class OperatorTest1 {

    public static void main(String[] args) {

        // Operatoren
        // Mathematisch: +,-,*,/,%
        System.out.println(1 * 15);

        // Zuweisung: =,+=,*=,etc
        int x = 100;
        x += 17;

        // Relational: ==, !=, <, >, >=, <=
        // Erg. ist immer boolean
        System.out.println(10 == 15); // ist 10 gleich 15?
        System.out.println(10 < 15); // ist 10 kleiner als 15?

        // Logische:
        x = 10;
        System.out.println(x > 0 && x < 200); // ist x gößer 0 und ist x kleiner als 200?
        System.out.println(x > 0 || x > 200); // ist x gößer 0 oder ist x größer als 200?
        System.out.println(!(x > 100)); // ist x NICHT gößer als 100

        /*
        XOR = ^ Exclusiv-Oder
        AND = &&
        OR = ||
        NOT = ! // Dreht den Wert um

        | a | b | a AND b | a OR b | a XOR b | NOT a | NOT b
        | 1 | 0 | 0       | 1      | 1       | 0     | 1
        | 1 | 1 | 1       | 1      | 0       |
        | 0 | 1 | 0       | 1      | 1       |
        | 0 | 0 | 0       | 0      | 0       |
        */

        // Ternärer Operator
        //            Bedingung      Wahr               Sonst
        String text = (x > 10) ? "Ist größer als 10" : "Ist kleiner als 10";
        System.out.println(text);

        System.out.println();

        x = 5;
        System.out.println("Wert ist " + ((x > 10) ? "größer" : "kleiner") + " als 10");


        System.out.println();

        String txt; // Deklaration
        if(x > 10) {
            txt = "Ist größer als 10"; // Zuweisung
        }
        else {
            txt = "Ist kleiner als 10";
        }
        System.out.println(txt);



    }
}
