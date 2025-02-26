package de.lubowiecki.lambdas;

public class LambdaDiceTest {

    private static final DiceRoller W6 = () -> (int)(Math.random() * 6) + 1;
    private static final DiceRoller W20 = () -> (int)(Math.random() * 20) + 1;
    private static final DiceRoller W100 = () -> (int)(Math.random() * 100) + 1;

    public static void main(String[] args) {

        System.out.println(roll());
        System.out.println(roll());
        System.out.println(roll());
        System.out.println(roll());

        System.out.println();

        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println();
        System.out.println(W20.roll());
        System.out.println(W20.roll());
        System.out.println();
        System.out.println(W100.roll());
        System.out.println(W100.roll());
    }

    private static int roll() {
        return (int)(Math.random() * 6) + 1;
    }

    // Error: Methode mit gleicher Signatur ist bereits vorhanden
//    private static int roll() {
//        return (int)(Math.random() * 20) + 1;
//    }
}

@FunctionalInterface
interface DiceRoller {
    int roll();
}