package de.lubowiecki.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class TryWithResourcesTest {

    public static void main(String[] args) {


        // Normales try braucht immer ein catch oder finally order beides

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("data.txt", true));
            writer.append("Text...");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Problem beim Schließen der Datei");
                }
            }
        }

        // try-with-resources
        // () wird zum öffnen einer Resource verwendet
        // IO
        try(BufferedWriter out = new BufferedWriter(new FileWriter("data.txt", true))) {

            // An Ende des Blocks werden die geöffneten Resourcen automatisch geschlossen
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        // NIO
        Path path = Paths.get("data.txt");
        try(BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {

            // An Ende des Blocks werden die geöffneten Resourcen automatisch geschlossen
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Hier können nur Resourcen geöffnet werden die das Interface AutoCloseable implementieren
        try(Scanner scanner = new Scanner(System.in)) {

            // An Ende des Blocks wird der Scanner automatisch geschlossen
        }

        // String ist nicht AutoCloseable = hat keine close Methode
//        try(String s = new String("...")) { // Die Resource MUSS eine close-Methode haben
//            //...
//        }
    }
}
