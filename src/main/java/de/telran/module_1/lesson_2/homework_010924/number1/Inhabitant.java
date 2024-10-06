package de.telran.module_1.lesson_2.homework_010924.number1;

public class Inhabitant {
    String name;
    int number;

    public Inhabitant(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void getInhabitant(){
        System.out.println("Житель "+name +" живет в кв. № "+number);
    }
}
