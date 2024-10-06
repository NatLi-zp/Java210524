package de.telran.module_1.lesson_2.homework_220824;

public class Pet {
    String name;
    int countPaws;
    int countTail;

    public Pet(String name, int countPaws, int countTail) {
        this.name = name;
        this.countPaws = countPaws;
        this.countTail = countTail;
    }

    public void have() {
        System.out.println("Это " + name + ". У него " + countPaws + " лапы и " + countTail + " хвост");
    }

    public void run() {
        System.out.println("Животное " + name + " бежит.");
    }

    public void sleep() {
        System.out.println("Животное " + name + " спит");
    }
}
