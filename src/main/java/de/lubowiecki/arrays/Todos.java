package de.lubowiecki.arrays;

import java.util.Scanner;

public class Todos {

    // Soll eine Variable in allen Klassen-Methoden verfügbar sein, dann MUSS sie
    // als (static) Klassen-Variable deklariert sein

    // Variablen außerhalb der Methoden, die NICHT static sind, sind Instanzvariablen
    // Sie gehören einem Objekt. Vor der benutzung muss mit new zuerst ein Objekt erzeugt werden

    // private = Diese Variable ist nur INNERHALB dieser Klasse sichtbar
    // static = Diese Variable gehört der Klasse
    // final = Variable kann sich nicht ändern
    // int = Datentyp
    // SIZE = Variablenname
    private static final int SIZE = 10; // Klassenvariable: Scope: in Allen Methoden dieser Klasse sichtbar

    // Es bleibt IMMER ein String-Array mit Größe 10, Inhalt darf sich änedrn
    private static final String[] todos = new String[SIZE]; // Array mit 10 Positionen

    private static int next = 0;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // final int SIZE = 10; // lokale Konstante: Scope = nur die Main-Methode

        app: while(true) { // Endlosschleife

            System.out.print("\nAuswahl: ");
            String auswahl = scanner.nextLine().toLowerCase();
            switch(auswahl) {
                case "create" -> createTodo();
                case "print" -> printTodos();
                case "exit" -> {
                    break app; // bricht die while-schleife ab
                }
                default -> System.out.println("Falsche Eingabe!");
            }
        }
        System.out.println("Ende!");
    }

    private static void createTodo() {

        if(next >= todos.length) {
            System.out.println("\nTodolist ist voll!");
            // break; // ist für schleifen und switch gedacht
            return; // Verlässt vorzeitig die Methode
        }

        System.out.print("\nTodo: ");
        String eingabe = scanner.nextLine(); // Liest die ganze Zeile ein ikl. Leerzeichen
        todos[next] = eingabe; // Wert von der Konsole wird im Array auf der Position 0 abgeleget
        next++; // Hier kann prefix (++next) oder postfix (next++) benutzt werden
            /*
            Array
            0: <--- Hier
            1: null
            2: null
            3: null
            4: null
            5: null
            6: null
            7: null
            8: null
            9: null
             */
    }

    private static void printTodos() {
        System.out.println("\nDeine Todos: ");
        for(String todo : todos) { // todos = Klassenvariable
            if(todo != null) // Nur ausgeben, wenn nicht null
                System.out.println(todo);
        }
    }
}
