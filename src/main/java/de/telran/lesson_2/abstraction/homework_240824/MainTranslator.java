package de.telran.lesson_2.abstraction.homework_240824;

public class MainTranslator {
    public static void main(String[] args) {

        EnglishRussian englishRussian = new EnglishRussian("Иван", 35, "мужской");
        englishRussian.translate();
        englishRussian.cost();
        System.out.println();

        RussianGerman russianGerman = new RussianGerman("Семен", 20, "мужской");
        russianGerman.translate();
        russianGerman.cost();
        System.out.println();

        EnglishGerman englishGerman = new EnglishGerman("Катя", 25, "женский");
        englishGerman.translate();
        englishGerman.cost();
    }
}
