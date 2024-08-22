package de.telran.lesson_2.praktica_210824;

public class ElephantExt extends Animal{

    public ElephantExt(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name +" трубит");
    }

    @Override
    public String getHairType(){
        System.out.println("без шерсти");
        return "без шерсти";
    }
}
