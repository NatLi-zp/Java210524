package de.telran.lesson_2.abstraction.homework_240824;

abstract public class Translator {
    String name;
    int age;
    String gender;

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    abstract public void translate();

    abstract public void cost();
}
