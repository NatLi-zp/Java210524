package de.telran.module_1.lesson_2.interface1;

public class Voron extends Bird{

    @Override
    public void fly() {
        System.out.println(name + " летает как ворон");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кричит Карр");
    }
}