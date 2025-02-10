package de.lubowiecki.api;

import java.util.Arrays;

public class StringBuilderTest {

    public static void main(String[] args) {

        String name = "Nikigraus";

        // String = NICHT veränderbare Sequenz von Zeichen (d.h. Folge von Zeichen)
        // StringBuilder = Veränderbare Sequenz von Zeichen
        StringBuilder sb = new StringBuilder(); // Beginnt mit einem Array von 16
        //StringBuilder sb = new StringBuilder(100); // Internes Array von 10
        //StringBuilder sb = new StringBuilder("Text"); // Internes Array = Anzahl Zeichen + 16
        // das interne Array wird automatisch vergrößert, wenn die bisherige Größe überschitten wird
        // Vergrößerung = Ale Größe * 2 + 2
        sb.append("Das ist").append(" ein Haus").append(" von ").append(name).append("\n");
        System.out.println(sb);
        String amStueck = sb.toString(); // Inhalt des StringBuilders als ein String
        sb.trimToSize(); // Verkleinert das interne Array auf die wirklich benötigte Größe

        String s = "€";
        byte[] arr = s.getBytes();
        System.out.println(Arrays.toString(arr));
        char ch = s.charAt(0);
        System.out.println(ch);

        Person p = new Person();
        p.setVorname("Peter").setNachname("Parker").setAlter(25); // Objekt-Chaining
        System.out.println(p);

        String[][] arr2 = new String[2][3]; // Symetrisch
        /*
        {
            {
                0: 2,
                1: 5,
                2: 7
            },
            {
                0: 9,
                1: 8,
                2: 5
             }
        }
         */

        // Größe der ersten Dimension muss IMMER angegeben werden
        // Der Rest kann sich später aus der Zuweisung ergeben
        int[][][] arr4 = new int[2][][];
        arr4[0] = new int[2][2];
        arr4[1] = new int[3][];
        arr4[1][0] = new int[4];
        arr4[1][1] = new int[3];
        arr4[1][2] = new int[2];

        int[][][] arr5 = { // Asymetrisch
            {
                {1,2},
                {7,9}
            },
            {
                {0,0,0,2},
                {1,2,3},
                {9,8}
            }
        };


    }
}

class Person {

    private String vorname;
    private String nachname;
    private int alter;

    public String getVorname() {
        return vorname;
    }

    public Person setVorname(String vorname) {
        this.vorname = vorname;
        return this; // this = Diese Person
    }

    public String getNachname() {
        return nachname;
    }

    public Person setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public int getAlter() {
        return alter;
    }

    public Person setAlter(int alter) {
        this.alter = alter;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", alter=").append(alter);
        sb.append('}');
        return sb.toString();
    }
}
