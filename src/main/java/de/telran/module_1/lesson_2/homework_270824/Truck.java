package de.telran.module_1.lesson_2.homework_270824;

public class Truck implements TransportationСargoes, MovementRoad, Service, Repair{
    String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void service() {
        System.out.println("Грузовик " + name + " требует сервисного обслуживания 1 раз в полгода");
    }

    @Override
    public void transportationCarGoes() {
        System.out.println("Грузовик " + name + " может перевозить груз до 20т");
    }

    @Override
    public void movementRoad() {
        System.out.println("Грузовик " + name + " может ехать по плохой дороге");
    }
}
