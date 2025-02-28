package de.lubowiecki.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ContainerTest {

    public static void main(String[] args) {

        Container<Integer> zahlen = new Container<>(new ArrayList<>());
        zahlen = new Container<>(new LinkedList<>());
        zahlen = new Container<>(new ArrayDeque<>());
        zahlen = new Container<>(new HashSet<>());
        zahlen.addAll(1,5,7,22,19);
        zahlen.addAll(22,85,17,-10,8);
        zahlen.print();
    }
}
