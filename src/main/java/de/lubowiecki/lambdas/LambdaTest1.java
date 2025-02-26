package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // Implementierung der Methode aus dem Interface
        MathOperation add = (a, b) -> a + b; // Definition
        MathOperation multi = (a, b) -> a * b; // Definition
        MathOperation div = (a, b) -> a / b; // Definition
        MathOperation sub = (a, b) -> a - b; // Definition

        double erg = add.exec(100, 200); // Aufruf
        System.out.println(erg);

        erg = multi.exec(100, 200); // Aufruf
        System.out.println(erg);

        System.out.println();

        // void accept(T t);
        Consumer<String> printer1 = (s) -> System.out.println("#" + s.toUpperCase() + "#");
        Consumer<String> printer2 = (s) -> System.out.println(s);
        Consumer<String> printer3 = (s) -> System.out.println(">>>" + s.toLowerCase());

        printer1.accept("Das ist das Haus von Nikigraus!");

        System.out.println();

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Bruce");

        // namen.forEach(printer3);
        namen.forEach(s -> System.out.println(s.charAt(0)));

        // Vorgabe der Werte bei der Erzeugung der ArrayList
        List<Integer> ints = new ArrayList<>(List.of(10, 17, 22,1, 9, 100, -17, -8, 0));

        // boolean test(T t);
        Predicate<Integer> pred1 = i -> i < 0;
        ints.removeIf(pred1); // Entfernt alle Zahlen für die das Predicate true ergibt
        System.out.println(ints);

        // Der Lambda-Ausdruck implemetiert die eine und einizige abstrakte Methode des FunctionalInterface

        System.out.println();

        namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Bruce");
        namen.add("Tony");
        namen.add("Scott");

        // int compare(T o1, T o2);
        Comparator<String> comp1 = (s1, s2) -> s1.compareTo(s2);
        Comparator<String> comp2 = (s1, s2) -> s2.compareTo(s1);
        Comparator<String> comp3 = (s1, s2) -> s1.length() - s2.length();
        // Comparator<String> comp4 = (s1) -> 10.0; // Error! Passt nicht zum FunctionalInterface
        namen.sort(comp3);

        System.out.println(namen);

    }
}

@FunctionalInterface // Prüft, ob die Regeln für ein FunctionalInterface beachtet wurden
interface MathOperation {

    // FunctionalIntefaces haben nur eine einzige abstrakte Methode
    // SAM - Single Abstract Method
    double exec(double a, double b);

}

// Vor Java 8 (Interface musste implementiert werden)
class Add implements MathOperation {

    @Override
    public double exec(double a, double b) {
        return a + b;
    }
}

