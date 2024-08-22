package de.telran.lesson_2.praktica_210824;

public class Zoo {
    public static void main(String[] args) {
        Animal elephant1 = new ElephantExt("Elephant");
        Animal monkey1 = new MonkeyExt("Monkey");
        Animal lion1 = new LionExt("Lion");
        Animal animal = new Animal("Bear");
        Animal bear1 = new BearExt("Bear");

        elephant1.makeSound();
        monkey1.makeSound();
        lion1.makeSound();
        animal.makeSound();
        bear1.makeSound();
        System.out.println();

        elephant1.getHairType();
        monkey1.getHairType();
        lion1.getHairType();
        animal.getHairType();
        bear1.getHairType();
    }
}
