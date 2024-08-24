package de.telran.lesson_2.abstraction.homework_240824;

public class EnglishRussian extends Translator {

    public EnglishRussian(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void translate() {
        System.out.println(name + " может переводить с англ. на русский");
    }

    @Override
    public void cost() {
        System.out.println("Переводчик англ.-рус. " + name + ", возраст " + age + " лет, пол " + gender + ", имеет час. ставку 10 евро");
    }
}
