package de.lubowiecki.exceptions;

public class MulticatchTest {

    public static void main(String[] args) {

        try {
            int[] zahlen = createIntArray(2);
            zahlen = null;
            zahlen[5] = 100;
            zahlen[7] = 200;
            for (int zahl : zahlen) {
                System.out.println(zahl);
            }
        }
        // Catch-Blöcke schließen sich gegenseitig aus!
        catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            // Wenn mehrere catch-Blöcke den gleichen Inhalt haben, dann kann man ein Multicatch nutzen
            System.out.println("Problem mit dem Array.");
        }
        catch (NullPointerException e) {
            System.out.println("Das Array ist nicht da!");
        }
        catch (RuntimeException e) { // Dieses catch würde alle Runtime-Exceptions einfangen
            System.out.println("Problem");
        }
        finally { // Wird IMMER ausgeführt. Auch wenn keine Exception geworfen wird!
            System.out.println("IMMER");
        }

//        catch(NegativeArraySizeException e) {
//            System.out.println("Problem mit dem Array.");
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Problem mit dem Array.");
//        }
    }


    private static int[] createIntArray(int size) {
        int[] arr = new int[size];
        return arr;
    }


}
