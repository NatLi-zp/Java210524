package de.telran.module_1.lesson_2.homework_290824.numer3;

public class Auto implements Mechanic, Driver {
    String name;
    String color;
    int year;

    public Auto(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public void repair() {
        System.out.println("Механик может ремонтировать " + color + " автомобиль " + name + " (" + year + " год выпуска)");
    }

    public void drive() {
        System.out.println("Водитель может ехать, имея " + color + " автомобиль " + name + " (" + year + " год выпуска)");
    }

    public void transportPassengers() {
        System.out.println("Водитель может перевозить пассажиров, имея " + color + " автомобиль " + name + " (" + year + " год выпуска)");
    }

    public void service() {
        System.out.println("Водитель обязан проходить сервисное обслуживание для автомобиля " + name + " (" + year + " год выпуска)");
    }

}
