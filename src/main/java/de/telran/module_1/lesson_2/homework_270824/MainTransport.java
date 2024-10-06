package de.telran.module_1.lesson_2.homework_270824;

public class MainTransport {
    public static void main(String[] args) {

        Bus bus = new Bus("Икарус");
        bus.transportationPassengers();
        bus.movementRoad();
        bus.service();
        bus.repair();

        System.out.println();
        Car car = new Car("Мерседес");
        car.transportationPassengers();
        car.movementRoad();
        car.service();
        car.repair();

        System.out.println();
        Ship ship = new Ship("Титаник");
        ship.transportationCarGoes();
        ship.transportationPassengers();
        ship.service();
        ship.swim();

        System.out.println();
        Airplane airplane = new Airplane("Ту-154");
        airplane.fly();
        airplane.transportationCarGoes();
        airplane.transportationPassengers();
        airplane.service();
        airplane.repair();

        System.out.println();
        Truck truck = new Truck("Камаз");
        truck.movementRoad();
        truck.transportationCarGoes();
        truck.service();
        truck.repair();

    }
}
