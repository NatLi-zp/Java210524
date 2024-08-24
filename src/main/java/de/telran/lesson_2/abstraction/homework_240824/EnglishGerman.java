package de.telran.lesson_2.abstraction.homework_240824;

public class EnglishGerman extends Translator {

    public EnglishGerman(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public void translate() {
        System.out.println(name + " может переводить с англ на немец. язык");
    }

    @Override
    public void cost() {
        System.out.println("Переводчик англ.-нем. " + name + ", возраст " + age + " лет, пол " + gender + ", имеет час. ставку 12 евро");
    }
}
