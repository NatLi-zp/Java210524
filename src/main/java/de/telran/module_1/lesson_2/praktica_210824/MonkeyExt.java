package de.telran.module_1.lesson_2.praktica_210824;

public class MonkeyExt extends Animal{

    public MonkeyExt(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name +" кричит");
    }
}
