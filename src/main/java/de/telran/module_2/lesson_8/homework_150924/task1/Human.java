package de.telran.module_2.lesson_8.homework_150924.task1;

import java.util.Objects;

public class Human {
    String name;
    String colorEyes;
    int age;

    public Human(String name, String colorEyes, int age) {
        this.name = name;
        this.colorEyes = colorEyes;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "имя='" + name + '\'' +
                ", цвет глаз='" + colorEyes + '\'' +
                ", возраст=" + age +
//                '}' + '\n';
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(colorEyes, human.colorEyes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colorEyes, age);
    }
}

