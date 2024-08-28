package de.telran.lesson_2.interface1.inter;

public interface SwimDivingable {
    void swim(); // плавать
    default void diving(){ // после Java8 включительно
        System.out.println("ныряет под воду");
    } //нырять
}
