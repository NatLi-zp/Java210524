package de.telran.lesson_2;

public class UnicornRace extends UnicornExt{
    int countPassengers;

    public UnicornRace(String name, String color, int weight, int countHorn, int countPassengers) {
        super(name, color, weight, countHorn);
        this.countPassengers = countPassengers;
    }

    public void transportPassangers(){
       System.out.println(name+" может возить пассажиров "+ countPassengers);
    }
}
