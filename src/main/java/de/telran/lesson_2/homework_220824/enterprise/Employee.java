package de.telran.lesson_2.homework_220824.enterprise;

public class Employee {
    String firstName;
    String lastName;
    int age;
    String post; //должность

    public Employee(String firstName, String lastName, int age, String post) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
    }

    public void whereWork() {
        System.out.println(post + " " + firstName + " " + lastName + " работает в офисе");
    }

    public void withWork() {
        System.out.println(post + " " + firstName + " " + lastName + " работает на компьютере");
    }

    public void isSpecialClothing() {
        System.out.println(post + " " + firstName + " " + lastName + " не нуждается в спец.одежде");
    }

    public void wantMoney() {
        System.out.println(post + " " + firstName + " " + lastName + " хочет больше зарабатывать");
    }

    public void isPensioner() {
        if (age >= 60) {
            System.out.println(post + " " + firstName + " " + lastName + " - пенсионер. Ему/ей " + age+ " лет");
        } else {
            System.out.println(post + " " + firstName + " " + lastName + " - не пенсионер. Ему/ей " + age+ " лет");
        }
    }
}
