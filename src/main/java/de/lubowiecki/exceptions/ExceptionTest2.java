package de.lubowiecki.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {

        RuntimeException e = new RuntimeException("Das ist eine Ausnahme!");

        // System.out
        System.out.println(e);
        System.out.println(e.getMessage());

        try {

            // Exceptions werden von Java bei Problemen automatisch geworfen

            // System.err
            throw e; // Um eine Exception auszulösen, muss ein Objekt der Exception geworfen werden
        }
        catch(RuntimeException ex) {
            //ex.printStackTrace();
            System.out.println("Gefangen: " + ex.getMessage());
        }

    }
}
