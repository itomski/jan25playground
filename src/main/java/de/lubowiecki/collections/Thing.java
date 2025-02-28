package de.lubowiecki.collections;

import java.util.Objects;

public class Thing implements Comparable<Thing> {

    private String name;

    private double weight;

    public Thing(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

//    @Override
//    public boolean equals(Object o) {
//        System.out.println("EQUALS");
//        return super.equals(o);
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("HASHCODE: " + super.hashCode());
//        return super.hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(weight, thing.weight) == 0 && Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        int code = Objects.hash(name, weight);
        System.out.println("HASHCODE: " + code);
        return code;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Thing{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Thing other) { // Damit wird dieses Objekt mit einem anderen verglichen
        //return Double.compare(weight, other.weight); // Sortieren nach Gewicht
        return name.compareTo(other.name); // Sortieren nach Name
    }
}
