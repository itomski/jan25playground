package de.lubowiecki; // Kleinbuchstaben und Punkte und KEINE Sonderzeichen

public class FirstStep { // Klassenname

    // Namenskonventionen
    // PascalCase: Klassen- und Interfacenamen
    // camelCase: Methoden und Eigenschaften
    // snake_case: wird in Java nicht benutzt
    // SCREAMING_SNAKE_CASE: public Konstanten (Eigenschaften, die ihren Wert nicht ändern können)

    public static final double PI = 3.14; // Konstante

    private String kurzerText = "Hallo Text"; // Eigenschaft

    // Methodendefinition
    public void machWas() { // Methode (haben eine Parameterklammer)
        // In Methoden werden Aktionen ausgeführt
        System.out.println(kurzerText); // AUsgabe der Variable auf der Konsole
        System.out.println("Das ist das Haus von Nikigraus"); // Ausgabe eines Literals
    }

    // Ohne main-Methode kann das Programm NICHT gestartet werden
    public static void main(String[] args) { // Einstiegspunkt als Methode
        FirstStep fs = new FirstStep(); // Objekt wird aus der Klasse erzeugt

        // Methodenaufruf
        fs.machWas(); // Aufruf der Methode auf einem Objekt
        int zahl = 10; // lokale Variable (nur in dieser Methode sichtbar)
    }
}
