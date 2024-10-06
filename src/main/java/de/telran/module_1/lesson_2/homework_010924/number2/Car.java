package de.telran.module_1.lesson_2.homework_010924.number2;

public class Car extends Auto {
    String color;
    int countPassengers;

    public Car(String name, int year, String color, int countPassengers) {
        super(name, year);
        this.color = color;
        this.countPassengers = countPassengers;
    }

    @Override
    public void drive() {
        System.out.println(color + " автомобиль " + name + " (" + year + " год выпуска) может ехать");
    }

    @Override
    public void transportationPassengers() {
        System.out.println(color + " автомобиль " + name + " (" + year + " год выпуска) может перевозить "+countPassengers +" пассажира" );
    }
}


