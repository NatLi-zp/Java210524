package de.telran.lesson_2.homework_270824;

public class Bus implements RoadPassengersService, Repair {
    String name;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public void movementRoad() {
        System.out.println("Автобус " + name + " едет по дороге");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Автобус " + name + " перевозит пассажиров");
    }

    @Override
    public void service() {
        System.out.println("Автобус " + name + " требует сервисного обслуживания 1 раз в год");
    }
}



