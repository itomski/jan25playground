package de.lubowiecki.vererbung;

import java.util.List;

public class CrudTest {

    public static void main(String[] args) {

        Crud crud = new SQLitePersonCrud();

        List<Person> personen = crud.findAll();
        for(Person p : personen) {
            System.out.println(p);
        }

        // Das Interface beschreibt, WAS möglich ist.
        // Die Implementierung (Klasse) beschreibt WIE etwas umgesetzt ist
    }
}
