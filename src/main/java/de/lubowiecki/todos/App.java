package de.lubowiecki.todos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String todos = "";

        // EVA = Eingabe Verarbeitung Ausgabe

        // System.out = Ausgabestrom
        // System.in = Eingabestrom

        // Wir lesen eingaben von der Konsole ein
        Scanner scanner = new Scanner(System.in /* Bla bla bla */);

        while(true) { // Endlosschliefe
            System.out.print("Eingabe: ");
            String eingabe = scanner.nextLine();
            todos += eingabe + "\n"; // \n steht für einen Zeilenumbruch
            System.out.println("Deine Todos: \n" + todos);

            // toLowerCase() ändert den eingegebenen Text auf Kleinbuchstaben
            // equale() Inhaltsvergleich
            if(eingabe.toLowerCase().equals("exit")) {
                break; // Schleife abbrechen!
            }
        }
    }
}
