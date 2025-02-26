package de.lubowiecki.lambdas;

import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {

        // IntStream zahlen = IntStream.generate(() -> (int)(Math.random() * 100) + 1);
        // zahlen.forEach(i -> System.out.println(i));

        // Streams sind in Java für die Arbeit mit Lambdas optimiert
        IntStream.generate(() -> (int)(Math.random() * 100) + 1)
                .map(i -> i * 2)
                .forEach(i -> System.out.println(i));

    }
}
