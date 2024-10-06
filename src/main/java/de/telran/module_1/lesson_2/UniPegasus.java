package de.telran.module_1.lesson_2;

public class UniPegasus extends PegasusExt{

    UnicornExt unicorn; // ассоциация

    public UniPegasus(String name, String color, int weight, int countWings, int countHorn) {
        super(name, color, weight, countWings);
        unicorn = new UnicornExt(name, color, weight, countHorn);
    }

    // is(является) PegasusExt, has(включает) - UnicornExt
}
