package de.lubowiecki.patterns.singleton;

public class SimpleSingletonTest {

    public static void main(String[] args) {
        String s = new String();
        SimpleSingleton.getInstance(); // liefert das Objekt
    }

    private static void machWas() {
        // s ist nicht Verfügbar, da es einen andern Scope hat
        SimpleSingleton.getInstance(); // liefert das gleiche Objekt wie in der main
    }
}

class SimpleSingleton {

    // Singleton enthält immer eine Instanz von sich selbst
    private static final SimpleSingleton instance = new SimpleSingleton();

    // privater Konstruktor unterbindet mehrfache Objekterzeugung
    private SimpleSingleton() {
    }

    // Liefert die einzige Instanz des Objekts
    public static SimpleSingleton getInstance() {
        return instance;
    }
}
