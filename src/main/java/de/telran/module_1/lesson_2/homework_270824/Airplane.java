package de.telran.module_1.lesson_2.homework_270824;

public class Airplane implements Fly, TransportationPassengersCargoes, Service, Repair {
    String name;

    public Airplane(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Самолет " + name + " может летать");
    }

    @Override
    public void service() {
        System.out.println("Самолет " + name + " требует сервисного обслуживания перед кажд. вылетом");
    }

    @Override
    public void transportationCarGoes() {
        System.out.println("Самолет " + name + " может перевозить грузы");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Самолет " + name + " может перевозить и пассажиров");
    }

    @Override
    public void repair() {
        System.out.println("Самолет " + name + " должен ремонтироваться только высококвалифицированными специалистами ");
    } //ремонтировать
}

