package de.lubowiecki.uebungen.u6;

import java.util.Random;

public class DiceCup {

    private static final Random randGenerator = new Random();

    public static int roll() {
        return randGenerator.nextInt(6) + 1;
    }

    public static int[] roll(int count) {

        int[] arr = new int[count]; // Ein leeres Array in passender Größe
        for (int i = 0; i < count; i++) { // Das Array wird mit Zufallszahlen gefüllt
            arr[i] = roll();
        }
        return arr;
    }
}
