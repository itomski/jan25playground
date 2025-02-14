package de.lubowiecki.generics;


// T ist ein Name für einen Typ-Platzhalter
/**
 * Eine immutable Containerklasse für Werte flexiblen Datentyps
 * @param <T>
 */
public class GenericBox<T> {

    private final T content;

    /**
     * Setzt einen Wert im Container ein
     * @param content Der Wert kann unterschidlichen Typ haben
     */
    public GenericBox(T content) {
        this.content = content;
    }

    /**
     * Liefert den inneren Wert zurück
     * @return
     */
    public T getContent() {
        return content;
    }
}