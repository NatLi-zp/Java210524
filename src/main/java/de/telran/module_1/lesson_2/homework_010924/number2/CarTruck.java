package de.telran.module_1.lesson_2.homework_010924.number2;

public class CarTruck extends Car {
    public Truck truck;

    public CarTruck(String name, int year, String color, int countPassengers, int countCargo) {
        super(name, year, color, countPassengers);
        truck = new Truck(name, year, countCargo);
    }

    @Override
    public void TransportationСargoes() {
        truck.TransportationСargoes();
    }
}


