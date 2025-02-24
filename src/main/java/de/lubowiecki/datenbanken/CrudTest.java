package de.lubowiecki.datenbanken;

import java.sql.SQLException;
import java.util.List;

public class CrudTest {

    public static void main(String[] args) {

        KundenCrud crud = new KundenCrud();

        try {
            List<Kunde> kunden = crud.findAll();
            System.out.println(kunden);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
