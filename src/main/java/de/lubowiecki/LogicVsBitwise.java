package de.lubowiecki;

public class LogicVsBitwise {

    public static void main(String[] args) {
        // && = Logisch
        // & = Bit-Operator

        int zahl1 = 35;
        int zahl2 = 17;

        //System.out.println(zahl1 && zahl2); // Braucht auf beiden Seiten boolean
        System.out.println(zahl1 & zahl2);
        // 35: 00100011
        // 17: 00010001 &
        //  1: 00000001

        System.out.println();

        String text = null; // Kein Text hinterlegt

        // Bitweises AND: Beide Seiten werden ausgewertet
//        if(text != null & text.length() > 0) // NullPointerException
//            System.out.println(text);

        // Logisches AND: Rechte Seite wird nur ausgewertet, wenn linke true ergab
        if(text != null && text.length() > 0) // Keine NullPointerException
            System.out.println(text);
    }
}
