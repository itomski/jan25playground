package de.lubowiecki;

public class ArrayTest2 {

    public static void main(String[] args) {

        // Im Alltag wird die Array-Klammer meistens an den Datentyp geschrieben
        int[] a = {10, 20, 30};
        int b[] = {10, 20, 30};

        int c1, d1, e1; // Deklariert 3 Variablen vom gleichen Typ
        int[] c2, d2, e2; // Deklariert 3 int-Array Variablen
        int c3, d3, e3[]; // Deklariert 2 int Variablen und eine int-Array Variable


        // Linke Seite: Datentyp und Varibale
        // Rechte Seite: Array-Erzeugung mit Größenangabe
        char[] zeichen = new char[5]; // Erzeugt ein leeres char-Array mit Größe 5

        // Ein Array ist ein Objekt. Klasse ist aber in der Bibliothek nicht auffindbar
        // new = Objekterzeugung

        // Nur bei gleichzeitiger Daklaration erlaubt
        char[] zeichen2 = {'x', 'y', 'z'}; // Ein gefülltes Array mit Größe 3 wird erzeugt

        char[] zeichen3 = new char[]{'x', 'y', 'z'}; // Ein gefülltes Array mit Größe 3 wird erzeugt

        // zeichen3 = {'a', 'b', 'c'}; // Error!
        // Ist die Variable bereits deklariert ist nur diese Schreibweise erlaubt
        zeichen3 = new char[]{'a', 'b', 'c'};

        // oder ein leeres Array zuweisen
        zeichen3 = new char[5]; // Index: 0,1,2,3,4

        System.out.println();

        /*
        Array:
        0:
        1:
        2:
        3:
        4:
         */

        zeichen3[2] = 'A'; // Legt einen Wert an gewünschter Position im Array ab
        zeichen3[1] = 'X';
        /*
        Array:
        0:
        1: X
        2: A
        3:
        4:
         */

        System.out.println(zeichen3[2]); // Wert am Index 2 aus dem Array auslesen

        // Eine einfache Variable vom primitiven Typ kann NUR EINEN EINZIGEN WERT aufnehmen
        // Eine Array-Variable kann mehrere Werte des gleich Typs aufnehmen

        // Zugriff auf einen NICHT VORHANDENEN Index produziert IMMER eine ArrayIndexOutOfBoundsException
        //System.out.println(zeichen3[6]); // Exception
        zeichen3[6] = 'Z'; // Exception

    }
}
