package de.lubowiecki.collections;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class QueueTest {

    public static void main(String[] args) {

        Server server = new Server();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Nachricht: ");
            String eingabe = scanner.nextLine();

            if(eingabe.equalsIgnoreCase("exit")) break;

            server.createMessage(eingabe);
        }

        System.out.println("Ende des Programms");
        server.stop();
    }
}

class Server {

    private final Queue<Nachricht> nachrichten = new LinkedList<>();

    // Führt aufgaben in regelmäßigen Abstenden aus
    private final ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);

    public Server() {
        // Führt die Aufgabe alle 5 Sekunden aus
        pool.scheduleAtFixedRate(() -> send(), 0, 5, TimeUnit.SECONDS);
    }

    private void send() {
        Nachricht n = nachrichten.poll(); // Entnimmt eine Nachricht aus der Queue
        if(n != null)
            System.out.println("\nVERSCHICKT: " + n);
    }

    public void createMessage(String text) {
        nachrichten.offer(new Nachricht(text));
    }

    public void stop() {
        pool.shutdown(); // Abarbeitung des Aufgaben-Pools wird gestopt
    }
}

class Nachricht {

    private final String text;
    private final LocalDateTime createdAt;

    public Nachricht(String text) {
        this.text = text;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return createdAt + " > " + text;
    }
}
