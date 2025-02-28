package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Container<T> {

//    private ArrayList<T> list; // ArrayList schränkt die Klasse sehr ein
//    private List<T> list; // Zu einschränkend
    private Collection<T> list; // am besten

//    public Container(ArrayList<T> list) {
//        this.list = list;
//    }

    public Container(Collection<T> list) {
        this.list = list;
    }

    public void addAll(T... elements) {
        list.addAll(Arrays.asList(elements));
    }

    public void print() {
        for(T element : list) {
            System.out.print(element + ", ");
        }
    }
}
