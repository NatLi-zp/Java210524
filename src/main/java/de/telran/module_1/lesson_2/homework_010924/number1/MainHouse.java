package de.telran.module_1.lesson_2.homework_010924.number1;

public class MainHouse {
    public static void main(String[] args) {
        Inhabitant[] inhabitants = new Inhabitant[3];

        inhabitants[0] = new Inhabitant("Петя", 120);
        inhabitants[1] = new Inhabitant("Ваня", 10);
        inhabitants[2] = new Inhabitant("Катя", 15);

        House house = new House();
        house.initInhabitant(inhabitants);

    }

}
