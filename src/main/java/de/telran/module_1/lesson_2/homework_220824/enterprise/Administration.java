package de.telran.module_1.lesson_2.homework_220824.enterprise;

public class Administration extends Employee{
    public Administration(String firstName, String lastName, int age, String post) {
        super(firstName, lastName, age, post);
    }

    @Override
    public void wantMoney() {
        System.out.println(post + " " + firstName + " " + lastName + " достаточно зарабатывает");
    }
}

