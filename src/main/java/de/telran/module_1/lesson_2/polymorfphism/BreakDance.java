package de.telran.module_1.lesson_2.polymorfphism;

public class BreakDance extends Dance{
    public BreakDance(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(name + " мочит брейк!!!");
    }
}
