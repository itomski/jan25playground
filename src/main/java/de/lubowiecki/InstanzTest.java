package de.lubowiecki;

public class InstanzTest {

    public static void main(String[] args) {

        // Jedes Objekt hat seinen eigenen Zustand
        // Der Zustand wid durch die Eigenschaften beschrieben

        Robot r2d2 = new Robot("R2-D2");
        Robot c3po = new Robot("C3-PO");

        // Instanzmethoden verändern oder ermitteln den aktuellen Zustand eines Roboters
        r2d2.goRight();
        r2d2.goRight();

        c3po.goUp();
        c3po.goLeft();
        c3po.goLeft();
        c3po.goUp();

        System.out.println(r2d2);
        System.out.println(c3po);
    }
}
