package de.lubowiecki;

public class GCTest {

    public static void main(String[] args) throws InterruptedException {

        // zeug ist eine Referenz auf das Objekt auf dem Heap
        // zeug als Refelerenz liegt selbst auf dem Stack
        Thing zeug = new Thing("Dies und das!");
        zeug = null;
        System.gc(); // Aufforderung an die Müll-Abfuhr tätig zu werden

        // Der autuelle Sub-Prozess (Thread) wartet 1 Sekunde
        Thread.sleep(1000);

        {
            int x = 100;
        } // x wird vom Speicher entfernt


        coutTo10();
    }

    private static void coutTo10() {
        for (int i = 1; i <= 10; i++) {

            if(i == 5) return; // Verlässt vorzeitig die Methode

            System.out.println(i);
        }
    }

    // Rückgabetyp steht auf int d.h. Methode MUSS einen int-Wert per return zurückgeben
    private static int getNr() {
        return 10; //
    }
}

class Thing {

    private String content;

    public Thing(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Thing{");
        sb.append("content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Destruktor
    @Override
    protected void finalize() throws Throwable {
        // Wird ausgeführt wenn die Müll-Abfuhr das Objekt wirklich vom Speicher entfernt
        System.out.println("UGRRRR!!!!!");
    }
}
