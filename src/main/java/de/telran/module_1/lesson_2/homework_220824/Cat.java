package de.telran.module_1.lesson_2.homework_220824;

public class Cat extends Pet {

    public Cat(String name, int countPaws, int tail) {
        super(name, countPaws, tail);
    }

    @Override
    public void run() {
        System.out.println("Кот "+name + " бежит.");
    }
}
