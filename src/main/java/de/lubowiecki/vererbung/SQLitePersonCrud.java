package de.lubowiecki.vererbung;

import java.util.List;

public class SQLitePersonCrud implements Crud {
    @Override
    public boolean insert(Person p) {
        return false;
    }

    @Override
    public boolean update(Person p) {
        return false;
    }

    @Override
    public boolean delete(Person p) {
        return false;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Person find(long id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return List.of();
    }
}
