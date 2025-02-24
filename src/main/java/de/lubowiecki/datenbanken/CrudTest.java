package de.lubowiecki.datenbanken;

import java.sql.SQLException;
import java.util.List;

public class CrudTest {

    public static void main(String[] args) {

        KundenCrud crud = new KundenCrud();

        Kunde k1 = new Kunde("Bruce", "Banner");

        try {

            if(crud.insert(k1)) {
                System.out.println("Wurde gespeichert!");
            }
            else {
                System.out.println("Konnte nicht gespeichert werden!");
            }

            System.out.println();

            for(Kunde k : crud.findAll()) {
                System.out.println(k.getId() + ": " + k.getVorname() + " " +
                        k.getNachname() + ", " + ((k.isAktiv()) ? "aktiv" : "nicht aktiv"));
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
