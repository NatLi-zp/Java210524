package de.telran.lesson_2.abstraction.homework_240824;

public class RussianGerman extends Translator {

    public RussianGerman(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void translate() {
        System.out.println(name + " может переводить с русского на немецкий язык");
    }

    @Override
    public void cost() {
        System.out.println("Переводчик рус.-нем. " + name + ", возраст " + age + " лет, пол " + gender + ", имеет час. ставку 15 евро");
    }
}
