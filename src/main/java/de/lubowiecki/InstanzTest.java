package de.lubowiecki;

public class InstanzTest {

    public static void main(String[] args) {

        Robot r2d2 = new Robot("R2-D2");
        Robot c3po = new Robot("C3-PO");
        r2d2.goRight();
        r2d2.goRight();

        System.out.println(r2d2);
        System.out.println(c3po);


    }
}
