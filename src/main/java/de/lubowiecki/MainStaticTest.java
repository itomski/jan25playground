package de.lubowiecki;

public class MainStaticTest {

    public static void main(String[] args) {

        // machWas(); // Error
        MainStaticTest mst = new MainStaticTest();
        mst.machWas(); // Instanzmethoden werden IMMER auf dem Objekt aufgerufen

        MainStaticTest.machWasAnderes();
        machWasAnderes(); // Sucht diese Methode automatisch in dieser Klasse

        // Möglich aber nicht nötig.
        // Der Kompiler tauscht das Objekt gegen die Klasse aus
        mst.machWasAnderes();

    }

    // privat = Können nur von Methoden der gleich Klasse verwendet werden

    // Instanzmethode: Für den Aufruf ist ein Objekt nötig
    private void machWas() {
        System.out.println("Was?");
    }

    // Klassenmethode: Wird auf dem Bauplan (auf der Klasse) ausgeführt
    // D.h. vor der Verwendeg muss KEIN Objekt erzeugt werden
    private static void machWasAnderes() {
        System.out.println("So was!!!");
    }
}
