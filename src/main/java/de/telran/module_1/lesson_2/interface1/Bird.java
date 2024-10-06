package de.telran.module_1.lesson_2.interface1;

public abstract class Bird {
    String name;
    String color;

    public void eat() {
        System.out.println(name + " кушает через клюв");
    }

    public abstract void fly();

    public abstract void makeSound();

}
