package de.lubowiecki.vererbung;

// Create, Read, Update, Delete

import java.util.List;

public interface Crud {

    // Alle Eigenschaften im Interface sind automatisch public static final = Öffentliche Klassen-Konstanten

    boolean insert(Person p);

    boolean update(Person p);

    boolean delete(Person p);

    boolean deleteById(long id);

    Person find(long id);

    List<Person> findAll();
}