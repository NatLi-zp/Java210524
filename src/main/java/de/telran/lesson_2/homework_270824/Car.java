package de.telran.lesson_2.homework_270824;

public class Car implements RoadPassengersService, Repair {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void movementRoad() {
        System.out.println("Автомобиль " + name + " едет по дороге");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Автомобиль " + name + " может перевозить 4 пассажира + водитель");
    }

    @Override
    public void service() {
        System.out.println("Автомобиль " + name + " требует сервисного обслуживания 1 раз в 2 года");
    }

}
