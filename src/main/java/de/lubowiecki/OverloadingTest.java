package de.lubowiecki;

public class OverloadingTest {

    public static void main(String[] args) {

        machWas(10);
        // Java kann Werte automatisch zum größeren Typ anheben
        // Verkleinern ist automatisch nicht möglich

    }

    // Overloadig = mehrere Methoden mit dem gleichen Namen
    // aber mit unterschiedlichen Parametern

    private static void machWas(byte i) {
        System.out.println("BYTE");
    }

    private static void machWas(int i) {
        System.out.println("INT");
    }

    private static void machWas(double d) {
        System.out.println("DOUBLE");
    }

}
