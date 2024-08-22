package de.telran.lesson_2;

public class PegasusExt extends Horse{ //наследование
    int countWings;

    public PegasusExt(String name, String color, int weight, int countWings) {
        super(name, color, weight);
        this.countWings = countWings;
    }

    public void fly() {
        System.out.println("Летит " + name + " цвет " + color+ " с груз весом " + weight);
    }
}
