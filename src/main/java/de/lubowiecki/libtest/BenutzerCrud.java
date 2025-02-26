package de.lubowiecki.libtest;

import de.lubowiecki.datenbanken.AbstractCrud;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BenutzerCrud extends AbstractCrud<Benutzer> {


    public BenutzerCrud() throws SQLException {
        super("benutzer");
    }

    @Override
    protected boolean insert(Benutzer benutzer) {
        return false;
    }

    @Override
    protected boolean update(Benutzer benutzer) {
        return false;
    }

    @Override
    public Benutzer create(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    protected void createTable() throws SQLException {

    }
}
