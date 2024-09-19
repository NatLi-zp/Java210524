package de.telran.module_2.lesson_10.homework_180924.Task1_2;

public class Production {
    String name;
    int count;

    public Production(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return '\n' +"Production{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
