package de.telran.lesson_2.homework_290824.numer3;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto = new Auto("Ниссан Кашкай", "белый", 2000);
//        auto.drive();
//        auto.repair();
//        auto.transportPassengers();
//        auto.service();

        Mechanic mechanic = auto;
        mechanic.repair();

        System.out.println();
        Driver driver = auto;
        driver.drive();
        driver.transportPassengers();
        driver.service();
    }
}
