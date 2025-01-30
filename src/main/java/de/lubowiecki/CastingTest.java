package de.lubowiecki;

public class CastingTest {

    public static void main(String[] args) {

        // Casting = Wechsel von einem auf einen anderen Datentyp

        // Upcasting und Downcasting

        // byte < short < int < long < float < double
        //         char <

        // Primitiver Cast von kleineren auf größere Datentypen erfolgt automatisch

        // Promotion
        int i1 = 'c'; // automatischer cast, da char kleiner ist als int
        double d1 = 100; // automatischer cast, da int kleiner ist als double
        float f1 = i1; // automatischer cast, da int kleiner ist als float

        // beim Rechnen muss der kleinere zum größeren Typ angehoben werden
        // Erg. ist vom größten verwendeten Typ
        double sum = 10 + 25.5 + 15.2f;

        // kleinere Typen als int werden zum Rechnen zu int angehoben
        byte b1 = 10;
        byte b2 = 20;
        //byte sum2 = b1 + b2; // Error: sum2 muss ein int sein

        // + - * /
        int sum3 = 10 + 2 * 15;

        // Modulo Ganzteilige Division mit Rest
        System.out.println(10 % 2); // 0
        System.out.println(11 % 2); // 1
        System.out.println(7 % 25); // 7
        System.out.println(5 % 3); // 2

        sum3 = 10; // Zuweisung
        sum3 += 10; // sum3 = sum3 + 10
        sum3 *= 10; // sum3 = sum3 * 10

        // Postfix
        sum++; // sum = sum + 1
        sum--; // sum = sum - 1

        // Prefix
        ++sum; // sum = sum + 1
        --sum; // sum = sum - 1

        int i2 = 15;
        int i3 = 33;

        //    16   + 33
        sum = ++i2 + i3; // Erhöhung hat Auswirkung auf die Rechnung

        i2 = 15;
        i3 = 33;
        //    15   + 33 (anschließend wird i2 erhöht)
        sum = i2++ + i3; // Erhöhung hat keine Auswirkung auf die Rechnung

        i2 = 15;
        //                 15   + 16  // bei der nächsten Verwendung ist die Variable schon geändert
        System.out.println(i2++ + i2);

        i2 = 15;
        //                 15   +   17
        System.out.println(i2++ + ++i2);

        byte b3 = 10;
        b3 += 2; // b3 = (byte)(b3 + 2); // Hier erfolgt ein Cast zum ursprünglichen Typ (byte)
        b3++; // b3 = (byte)(b3 + 1)

        System.out.println();

        byte b4 = 100;
        System.out.println(b4);
        b4 += 20;
        System.out.println(b4);
        // Bei einem Cast kann es zu einem Überlauf oder Unterlauf kommen
        b4 += 20; // Überlauf
        System.out.println(b4);

        // Umwandlung größerer Typen in kleinere MUSS immer durch ein CAST erzwungen werden
        System.out.println((byte)1000); // Cast von int auf byte
    }
}
