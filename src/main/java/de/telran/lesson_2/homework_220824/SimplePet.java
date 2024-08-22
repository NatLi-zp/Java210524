package de.telran.lesson_2.homework_220824;

public class SimplePet {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 4, 1);
        dog1.have();
        dog1.run();
        dog1.sleep();
        System.out.println();

        Cat cat1 = new Cat("Барсик", 4, 1);
        cat1.have();
        cat1.run();
        cat1.sleep();
    }
}
