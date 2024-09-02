package de.telran.lesson_2.homework_010924.number2;

public class Auto {
    String name;
    int year;

    public Auto(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void drive() {
        System.out.println("Машина " + name + " (" + year + " год выпуска) может ехать");
    }

    public void transportationPassengers() {
        System.out.println("Машина не может перевозить пассажиров");
    }
    public void TransportationСargoes() {
        System.out.println("Машина не может перевозить груз");
    }
}
