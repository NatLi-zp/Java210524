package de.telran.module_1.lesson_1.Homework_190824.module1.lecture1.module1.lecture1;

public class Person {
    String fullName;
    int age;

    public void move(Person person) {
        System.out.println(person.toString() + " говорит");
    }

    public void talk(Person person) {
        System.out.println(person.toString() + " говорит");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
