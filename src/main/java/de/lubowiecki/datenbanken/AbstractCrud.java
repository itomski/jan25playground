package de.lubowiecki.datenbanken;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// T extends AbstractEntity = Kann ein nur eine Klasse sein, die von AbstractEntity erbt
public abstract class AbstractCrud<T extends AbstractEntity> {

    private final String TABLE;

    public AbstractCrud(String tbl) throws SQLException {
        this.TABLE = tbl;
        createTable();
    }

    public List<T> findAll() throws SQLException {

        try(Connection verbindung = SQLiteUtils.getConnection();
            Statement stmt = verbindung.createStatement()) {

            ResultSet daten = stmt.executeQuery("SELECT * FROM " + TABLE);

            List<T> objekte = new ArrayList<>();
            while(daten.next()) {
                objekte.add(create(daten));
            }
            return objekte;
        }
    }

    public Optional<T> findById(int id) throws SQLException {

        try(Connection verbindung = SQLiteUtils.getConnection();
            Statement stmt = verbindung.createStatement()) {

            ResultSet daten = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE id = " + id);

            if(daten.next()) {
                return Optional.of(create(daten));
            }
            return Optional.empty();
        }
    }

    public boolean save(T t) {
        if(t.getId() > 0) {
            return update(t);
        }
        else {
            return insert(t);
        }
    }

    protected abstract boolean insert(T t);

    protected abstract boolean update(T t);

    public boolean delete(T t) throws SQLException {
        return delete(t.getId());
    }

    public boolean delete(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        // Das PreparedStatement arbeitet etwas langsamer als das "normale" Statement
        try(Connection verbindung = SQLiteUtils.getConnection();
            Statement stmt = verbindung.createStatement()) {
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    public abstract T create(ResultSet data) throws SQLException;

    protected abstract void createTable() throws SQLException;

}
