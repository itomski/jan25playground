package de.lubowiecki.basics;

import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {

        String a = "Das ist das Haus von Nikigraus"; // Landet im String-Literal-Pool
        String b = "Das ist das Haus von Nikigraus"; // Verwendet den Wert aus dem String-Literal-Pool
        String c = new String("Das ist das Haus von Nikigraus"); // Verwendet NICHT den Pool

        System.out.println(a == b); // Ist es das gleiche Objekt auf dem Heap?
        System.out.println(a.equals(b)); // Hat es den gleichen Inhalt?

        System.out.println();

        System.out.println(a == c); // Ist es das gleiche Objekt auf dem Heap?
        System.out.println(a.equals(c)); // Hat es den gleichen Inhalt?

        System.out.println();

        NumberBox b1 = new NumberBox(15);
        NumberBox b2 = new NumberBox(15);
        //NumberBox b2 = null;

        System.out.println(b1 == b2); // Ist es das gleiche Objekt auf dem Heap?
        System.out.println(b1.equals(b2)); // Hat es den gleichen Inhalt?
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}

class NumberBox {

    private int nr;

    public NumberBox(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NumberBox numberBox = (NumberBox) o;
        return nr == numberBox.nr;
    }

    // equals und hashCode MÜSSEN auf gleichen Eigenschaften basieren
    @Override
    public int hashCode() {
        return Objects.hashCode(nr);
    }
}
