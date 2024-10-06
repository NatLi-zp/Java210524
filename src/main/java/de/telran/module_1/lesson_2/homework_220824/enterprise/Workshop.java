package de.telran.module_1.lesson_2.homework_220824.enterprise;

public class Workshop extends Employee{

    public Workshop(String firstName, String lastName, int age, String post) {
        super(firstName, lastName, age, post);
    }

    @Override
    public void whereWork(){
        System.out.println(post+" "+firstName+" "+lastName+ " работает в цехе");
    }

    @Override
    public void withWork(){
        System.out.println(post+" "+firstName+" "+lastName+ " работает на станке");
    }

    @Override
    public void isSpecialClothing() {
        System.out.println(post + " " + firstName + " " + lastName + " нуждается в спец.одежде");
    }
}
