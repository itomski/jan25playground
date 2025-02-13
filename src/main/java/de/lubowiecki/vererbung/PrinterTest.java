package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class PrinterTest {

    public static void main(String[] args) {

        Printer printer = new Printer();
        //WordDokument doc = new WordDokument("Das ist ja schön!...");

        // PowerPointDokument doc = new PowerPointDokument("Bla bla bla", "Seite 2", "Seite 3");
        ExcelDokument doc = new ExcelDokument(10.5, 22.19, 18.22);

        printer.print(doc);

    }
}

class Printer {

    // Statt eine konkrete Klasse als Paramter-Typ zu nutzen, wird ein Interface verwendet
    public void print(Printable doc) {
        doc.print();
    }
}

interface Printable {
    void print();
}

class WordDokument implements Printable {

    private String content;

    public WordDokument(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("---- WORD-DOC START ----");
        System.out.println(content);
        System.out.println("---- WORD-DOC ENDE ----");
    }

}

class PowerPointDokument implements Printable {

    private List<String> slides = new ArrayList<>();

    public PowerPointDokument(String... pageContent) {
        slides.addAll(List.of(pageContent)); // Fügt Werte eines VarArgs in eine List ein
    }

    public void print() {
        System.out.println("---- POWER-POINT-DOC START ----");
        System.out.println(slides);
        System.out.println("---- POWER-POINT-DOC ENDE ----");
    }
}

class ExcelDokument implements Printable {

    private List<Double> werte = new ArrayList<>();

    public ExcelDokument(double... zahlen) {
        for(double zahl : zahlen) {
            werte.add(zahl); // Fügt Werte eines VarArgs in eine List ein
        }
    }

    @Override
    public void print() {
        System.out.println("---- EXCEL-DOC START ----");
        System.out.println(werte);
        System.out.println("---- EXCEL-DOC ENDE ----");
    }
}