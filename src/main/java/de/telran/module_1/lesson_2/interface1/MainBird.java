package de.telran.module_1.lesson_2.interface1;

public class MainBird {
    public static void main(String[] args) {
        //Bird bird = new Bird(); // объект вбстракт. класса создать не возможно

        Eagle eagle = new Eagle();
        eagle.name = "Сокол";
        eagle.eat();
        eagle.fly();
        eagle.makeSound();

        Voron voron = new Voron();
        voron.name = "Каркуша";
        voron.eat();
        voron.fly();
        voron.makeSound();
    }
}
