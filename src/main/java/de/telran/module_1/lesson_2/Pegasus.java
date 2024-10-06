package de.telran.module_1.lesson_2;

public class Pegasus {
    String name;
    String color;
    int weight; //кол-во груза
    int countWings;

    public Pegasus(String name, String color, int weight, int countWings) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.countWings = countWings;
    }

    public void run() {
        System.out.println("Бежит лошадь " + name + " цвет " + color);
    }

    public void transports() {
        System.out.println("Лошадь " + name + " везет груз весом " + weight);
    }

    public void fly() {
        System.out.println("Летит " + name + " цвет " + color+ " с груз весом " + weight);
    }
}
