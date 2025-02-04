package de.lubowiecki;

import java.util.Random;

public class NextDiceCup {

    private final Random randGenerator = new Random();

    // Instanzeigenschaft: Jedes Objekt hat eine eigene
    private int size = 6;

    public NextDiceCup() {
    }

    public NextDiceCup(int size) {
        this.size = size;
    }

    // Instanzmethode: Verwendet den Zustand des aktuellen Objekts
    public int roll() {
        return randGenerator.nextInt(size) + 1;
    }

    public int[] roll(int count) {

        int[] arr = new int[count]; // Ein leeres Array in passender Größe
        for (int i = 0; i < count; i++) { // Das Array wird mit Zufallszahlen gefüllt
            arr[i] = roll();
        }
        return arr;
    }
}
