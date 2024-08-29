package de.telran.lesson_2.polymorfphism;

public class PopSinger extends Singer{
    public PopSinger(String name) {
        super(name);
    }

    @Override
    void sing() {
        System.out.println(name + " поет ПОП");

    }
}
