package de.telran.lesson_2.praktica_210824;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    public String getHairType() {
        System.out.println("пушистая");
        return "пушистая";
    }
}
