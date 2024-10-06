package de.telran.module_1.lesson_2.interface1.inter;

public class Submarine implements Soundable, SwimDivingable {
    @Override
    public void makeSound() {
        System.out.println("сильно шумит двигатель");
    }

    @Override
    public void swim() {
        System.out.println("плывет используя гребной винт");
    }

    @Override
    public void diving() {
        System.out.println("ныряет под воду, используя заполнения кингстонов");
    }
}