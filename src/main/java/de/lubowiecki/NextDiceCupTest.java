package de.lubowiecki;

import java.util.Arrays;

public class NextDiceCupTest {

    public static void main(String[] args) {

        NextDiceCup cup = new NextDiceCup(); // Instanzierung/Objekterzeugung: 6-seitig
        System.out.println(cup.roll()); // Instanzmethoden werden auf dem Objekt aufgerufen
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());

        cup = new NextDiceCup(100); // Instanzierung/Objekterzeugung: 100-seitig
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());

        System.out.println();

        NextDiceCup cup2 = new NextDiceCup(20); // Instanzierung/Objekterzeugung: 20-seitig

        System.out.println(cup.roll()); // 100-seitig
        System.out.println(cup2.roll()); // 20-seitig

        System.out.println(Arrays.toString(cup.roll(10)));
        System.out.println(Arrays.toString(cup2.roll(10)));

        // Instanzeigenschaften: Jedes Objekt hat seine eigenen
        // Klasseneigenschaften: Alle Objekte der gleichen Klasse teilen sich diese gemeinsam

    }
}
