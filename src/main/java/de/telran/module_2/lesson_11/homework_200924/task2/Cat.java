package de.telran.module_2.lesson_11.homework_200924.task2;

public class Cat {
    String name;
    int age;
    int weight;
    String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}'+'\n';
    }
}
