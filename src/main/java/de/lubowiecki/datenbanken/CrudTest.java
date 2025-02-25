package de.lubowiecki.datenbanken;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CrudTest {

    public static void main(String[] args) {

        KundenCrud crud = new KundenCrud();

        Kunde k1 = new Kunde("Bruce", "Banner");

        try {

            // Einfügen
//            if(crud.save(k1)) {
//                System.out.println("Wurde gespeichert!");
//            }
//            else {
//                System.out.println("Konnte nicht gespeichert werden!");
//            }
//
//            System.out.println();


            // Einen abfragen
            Optional<Kunde> opt = crud.findById(1);
            //opt.ifPresent(k -> System.out.println(k));

            if(opt.isPresent()) {
                Kunde k = opt.get(); // get liefert das Objekt, das Optional liegt
                k.setNachname("Rogers");
                k.setAktiv(true);
                // Datensatz ändern
                //crud.update(k);
                crud.save(k);
            }
            else {
                System.out.println("Kein passender Kunde gefunden.");
            }

            // Alle abfragen
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
