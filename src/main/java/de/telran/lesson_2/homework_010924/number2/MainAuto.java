package de.telran.lesson_2.homework_010924.number2;

public class MainAuto {
    public static void main(String[] args) {
        Auto car1 = new Car("Ауди", 2010, "красный", 4);
        Auto car2 = new Truck("Камаз", 2015, 100);
        Auto car3 = new CarTruck("Газель", 2000, "белый", 2, 200);

        car1.drive();
        car1.transportationPassengers();
        car1.TransportationСargoes();

        System.out.println();
        car2.drive();
        car2.transportationPassengers();
        car2.TransportationСargoes();

        System.out.println();
        car3.drive();
        car3.transportationPassengers();
        car3.TransportationСargoes();
    }

}
