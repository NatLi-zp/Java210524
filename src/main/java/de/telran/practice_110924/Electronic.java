package de.telran.practice_110924;

import java.util.Set;

public class Electronic implements Product{
    String name;
    double price;
    Set<Integer> id;

    public Electronic(String name, double price, Set<Integer> id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    public Set<Integer> getId() {
        return id;
    }
}
