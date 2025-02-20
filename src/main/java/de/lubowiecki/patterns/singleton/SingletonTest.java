package de.lubowiecki.patterns.singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingletonTest {

    public static void main(String[] args) {

        // Logger logger = new Logger(); // Error: Konstruktor ist private
        // getInstance() liefert das Logger Objekt (nur 1x pro Programm verfügbar)
        Logger.getInstance().setDebugMode(false);
        machWas();
        machWasAnderes();

        System.out.println("---------------");

        Logger.getInstance().print(true);

    }

    public static void machWas() {
        //... Irgendwas erledigen
        Logger.getInstance().log("machWas ausgeführt");
    }

    public static void machWasAnderes() {
        //... Irgendwas erledigen
        Logger.getInstance().log("machWasAnderes ausgeführt");
    }
}

// Singleton: Es darf nur einen geben
class Logger {

    private boolean debug;

    // Hier werden die Meldungen gesammelt, wenn sie nicht ausgegeben werden
    private final StringBuilder protokoll = new StringBuilder();

    // Format für das Datum, welches für den Dateinamen verwendet wird
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");

    private static final Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        msg = LocalDateTime.now() + ": " + msg;

        if(debug) { // Ausgabe auf der Konsole
            System.out.println(LocalDateTime.now() + ": " + msg);
        }
        else { // Schreiben in den StringBuilder für spätere Ausgabe
            protokoll.append(msg).append("\n");
        }
    }

    public void setDebugMode(boolean debug) {
        this.debug = debug;
    }

    public void print(boolean toFile) {
        if(toFile) {
            // Dateiname
            Path pfad = Paths.get(LocalDateTime.now().format(FMT) + ".txt");
            try {
                Files.writeString(pfad, protokoll); // Schreiben in die Datei
            }
            catch (IOException e) {
                System.out.println("Problem beim Schreiben"); // Wenn nicht geschrieben werden kann
            }
        }
        else {
            System.out.println(protokoll); // Ausgabe auf der Konsole
        }
    }
}
