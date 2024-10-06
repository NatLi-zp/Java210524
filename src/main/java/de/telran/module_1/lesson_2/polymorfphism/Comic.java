package de.telran.module_1.lesson_2.polymorfphism;

public class Comic implements Playable{

    String name;

    public Comic(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на балалайке");
    }

    @Override
    public void speak() {
        System.out.println(name + " рассказывает веселые истории");
    }
}
