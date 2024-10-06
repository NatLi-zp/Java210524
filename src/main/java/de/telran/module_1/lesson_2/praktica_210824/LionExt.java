package de.telran.module_1.lesson_2.praktica_210824;

public class LionExt extends Animal{
    public LionExt(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Lion makes sound");
    }
}
