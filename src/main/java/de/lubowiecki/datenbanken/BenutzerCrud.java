package de.lubowiecki.datenbanken;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BenutzerCrud extends AbstractCrud<Benutzer> {

    public BenutzerCrud() throws SQLException {
        super("benutzer"); // Tabellenname
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
    public Benutzer create(ResultSet data) throws SQLException {
        Benutzer benutzer = new Benutzer();
        benutzer.setId(data.getInt("id"));
        benutzer.setVorname(data.getString("vorname"));
        benutzer.setNachname(data.getString("nachname"));
        return benutzer;
    }

    protected void createTable() throws SQLException {

        try(Connection verbindung = SQLiteUtils.getConnection();
            Statement stmt = verbindung.createStatement()) {

            stmt.execute("CREATE TABLE IF NOT EXISTS benutzer (" +
                    "id INTEGER," +
                    "vorname TEXT NOT NULL," +
                    "nachname TEXT NOT NULL," +
                    "PRIMARY KEY(id AUTOINCREMENT))");
        }
    }
}
