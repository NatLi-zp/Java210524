package de.telran.lesson_2.polymorfphism;

public class Dance {
    String name;
    int age;

    public Dance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance(){
        System.out.println(name +" просто танцует");
    }
}
