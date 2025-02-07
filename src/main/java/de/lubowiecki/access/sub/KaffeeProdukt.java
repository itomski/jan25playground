package de.lubowiecki.access.sub;

public class KaffeeProdukt {

    // Nur für diese Klasse sichtbar
    private String name;

    // Für diese Klasse und andere Klassen im gleich Package sichtbar
    int kaffee; // package-private

    // Für diese Klasse und andere Klassen im gleich Package, sowie erbende Klassen außerhalb sichtbar
    protected int milch;

    // Für alle sichtbar
    public int zucker;

    // Der Konstruktor gehört zu der Klasse, daher darf er die Eigenschaft sehen und verändern
    public KaffeeProdukt(String name) {
        this.name = name;
    }

    // Zum Lesen von privaten Eigenschaften
    public String getName() {
        return name;
    }

    // Zum Verändern von privaten Eigenschaften
    public void setName(String name) {
        this.name = name;
    }

    public String getNameInSchoen() {
        // return verlässt die Methode. Es sollte die letzte Anweisung in der Methode sein
        return "---" + name.toUpperCase() + "---";
        // name = "..."; // Aktionen nach dem return sind nicht mehr möglich
    }
}
