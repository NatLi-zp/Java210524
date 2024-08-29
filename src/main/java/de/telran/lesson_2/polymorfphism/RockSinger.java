package de.telran.lesson_2.polymorfphism;

public class RockSinger extends Singer {
    public RockSinger(String name) {
        super(name);
    }

    @Override
    void sing() {
        System.out.println(name + " поет РОК");
    }
}
