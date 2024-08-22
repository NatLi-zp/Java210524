package de.telran.lesson_2.homework_220824;

public class Dog extends Pet{
    public Dog(String name, int countPaws, int tail) {
        super(name, countPaws, tail);
    }

    @Override
    public void sleep(){
        System.out.println("Собака "+name + " спит и храпит.");
    }
}
