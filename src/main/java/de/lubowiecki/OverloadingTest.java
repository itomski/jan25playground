package de.lubowiecki;

import java.util.Arrays;

public class OverloadingTest {

    public static void main(String[] args) {

        machWas(10, 1,2,3);
        // Java kann Werte automatisch zum größeren Typ anheben
        // Verkleinern ist automatisch nicht möglich

    }

    // Overloadig = mehrere Methoden mit dem gleichen Namen
    // aber mit unterschiedlichen Parametern

    /*
    1. passender Typ
    2. primitive Widening
    3. Auto-Boxing (primitiver Typ wird in seinen Wrapper-Typ eingepackt)
    4. komplex Widening
    5. Var-Args
    */

    private static void machWas(byte i) {
        System.out.println("BYTE");
    }

    public static void machWas(int i) {
        System.out.println("INT");
    }

    // Der Unterschied zweischen den Methoden wird aus dem Datentyp ermittelt
    // nicht aus den Namen der Parameter
//    private static void machWas(int x) { // Error: Eine gleiche Methode gibt es schon
//        System.out.println("INT");
//    }

    private static void machWas(float i) {
        System.out.println("FLOAT");
    }

    private static void machWas(double d) {
        System.out.println("DOUBLE");
    }

    // Wrapper: (Byte, Short, Integer, Long, Float, Double,... Boolean, Character)
    // Wrapper machen einen primitiven Wert zu einem Objekt
    private static void machWas(Integer i) {
        System.out.print("Integer Object: ");
        System.out.println(Integer.toBinaryString(i));
    }

    private static void machWas(Double d) {
        System.out.print("Double Object");
    }

    private static void machWas(Number n) {
        System.out.print("Number Object");
    }

    // Var-Arg
    // In der Parameterliste muss ein Var-Arg immer der letzte Parameter sein
    // 1 Prflichtparameter
    // Rest ist optional
    private static void machWas(int i, int... j) {
        // Die Werte werden zusammen als ein Array übergeben
        System.out.println("int Var-Arg");
        System.out.print(i);
        System.out.print(Arrays.toString(j));
        // System.out.print(j.toString());
    }

}
