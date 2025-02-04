package de.lubowiecki;

public class BarTest {

    public static void main(String[] args) {

        // var = Kompiler wählt einen passenden Typ selbst
        var str = Bar.trinkeCola("Yogi Bär");
        str = Bar.trinkeFanta(str);
        str = Bar.isstNachos(str);
        System.out.println(str);

        double flaeche = GeoUtils.flaeche(100, 200);
        System.out.printf("Die Fläche ist %.2f qm", flaeche); // Farmatierte Ausgabe
        System.out.printf("Die Fläche ist %.2f qm", GeoUtils.flaeche(100, 200)); // Auch ok

        String erg = String.format("Die Fläche ist %.2f qm", flaeche); // Formatierte Rückgabe

        // Statische Methoden verarbeiten Parameter und brauchen keinen Objektzustand.

    }
}
