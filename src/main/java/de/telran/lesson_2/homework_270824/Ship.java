package de.telran.lesson_2.homework_270824;

public class Ship implements TransportationPassengersCargoes, Service, Swim {
    String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void transportationCarGoes() {
        System.out.println("Корабль " + name + " может перевозить груз до 200т");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Корабль " + name + " может перевозить и пассажиров");
    }

    @Override
    public void service() {
        System.out.println("Корабль " + name + " требует сервисного обслуживания перед каждым рейсом");
    }

}
