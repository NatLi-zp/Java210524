package de.telran.module_1.lesson_2.polymorfphism;

public class PopSinger extends Singer{
    public PopSinger(String name) {
        super(name);
    }

    @Override
    void sing() {
        System.out.println(name + " поет ПОП");

    }
}
