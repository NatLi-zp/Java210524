package de.telran.lesson_1.Homework_190824.module1.lecture1.module1.lecture1;

public class SimplePerson {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.fullName = "Иванов Иван";
        person1.age = 30;
        person1.move(person1);
        person1.talk(person1);

        Person person2 = new Person("Петров Петр", 25);
        person1.move(person2);
        person1.talk(person2);
    }


}
