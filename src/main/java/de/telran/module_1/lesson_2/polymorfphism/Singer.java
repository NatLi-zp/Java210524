package de.telran.module_1.lesson_2.polymorfphism;

public abstract class Singer {
    String name;

    public Singer(String name) {
        this.name = name;
    }

    abstract void sing();
}
