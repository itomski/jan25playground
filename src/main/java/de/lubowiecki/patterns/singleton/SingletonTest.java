package de.lubowiecki.patterns.singleton;

import java.time.LocalDateTime;

public class SingletonTest {

    public static void main(String[] args) {

        Logger.setDebugMode(true);

        machWas();
        machWasAnderes();
    }

    public static void machWas() {
        //... Irgendwas erledigen
        Logger.log("machWas ausgeführt");
    }

    public static void machWasAnderes() {
        //... Irgendwas erledigen
        Logger.log("machWasAnderes ausgeführt");
    }
}

class Logger {

    private static boolean debug;

    public static void log(String msg) {
        if(debug) {
            System.out.println(LocalDateTime.now() + ": " + msg);
        }
    }

    public static void setDebugMode(boolean debug) {
        Logger.debug = debug;
    }
}
