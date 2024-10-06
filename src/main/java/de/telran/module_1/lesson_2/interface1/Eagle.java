package de.telran.module_1.lesson_2.interface1;

public class Eagle extends Bird {
    boolean isPredator; // хищник

    @Override
    public void fly() {
        System.out.println(name + " летает как орел");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кричит как орел");
    }
}
