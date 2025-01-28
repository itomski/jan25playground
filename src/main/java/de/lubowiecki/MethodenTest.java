package de.lubowiecki;

public class MethodenTest {

    public static void main(String[] args) {

        // hi(); // Error: Instanzmethoden werden auf Objekten ausgeführt
        MethodenTest mt = new MethodenTest(); // Instanzierung
        mt.hi(); // Methode wird auf dem Objekt (Instanz) ausgeführt
        hallo();
    }

    // Instanzmethode
    // In Methoden werden wiederverwendbare Aktivitäten verpackt
    // Methoden sind Funktionen, die zu einer Klasse gehören
    public void hi() {
        System.out.println("Moin Moin!");
    }

    // Klassenmethode
    public static void hallo() {
        System.out.println("Tach auch!");
    }
}

/*
// Freie Funktionen gibt es in Java nicht
// Alle Funktionen werden in Java in Klassen verpackt und heißen dann Methoden

function machWas() { // Deklaration einer Funktion
    echo "Hallo";
}

machWas(); // Verwendung einer Funktion

function add(a, b) {
    return a + b;
}

sum = add(10, 25);
sum = add(33, -100);
// etc.
*/