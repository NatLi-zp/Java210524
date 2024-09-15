package de.telran.module_2.lesson_8.homework_150924.task1;

import java.util.ArrayList;

public class MainHuman {
    public static void main(String[] args) {
        ArrayList<Human> listA = new ArrayList<>();
        listA.add(new Human("Петя", "голубой", 25));
        listA.add(new Human("Вася", "серый", 20));
        listA.add(new Human("Катя", "зеленый", 15));
        listA.add(new Human("Маша", "голубой", 34));
        listA.add(new Human("Ваня", "карий", 7));

        System.out.println("--------------- Исходный ArrayList----------------");
        System.out.println(listA);

        System.out.println("--------------- цвет глаз = голубой----------------");
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).colorEyes == "голубой") {
                System.out.println(listA.get(i));
            }
        }

        System.out.println("--------------- возраст человека >= 16 лет----------------");
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).age < 16) {
                listA.remove(i);
            }
        }
        System.out.println(listA);


        ArrayList<Human> listA_ = new ArrayList<>();
        listA_.add(new Human("Петя", "голубой", 25));
        listA_.add(new Human("Вася", "серый", 20));
        listA_.add(new Human("Вася", "зеленый", 20));
        listA_.add(new Human("Маша", "голубой", 34));
        listA_.add(new Human("Петя", "голубой", 25));
        listA_.add(new Human("Ваня", "карий", 25));
        listA_.add(new Human("Петя", "голубой", 25));

        System.out.println("--------------- Исходный ArrayList----------------");
        System.out.println(listA_);

        System.out.println("--------------- только уникальные элементы----------------");
        for (int i = 0; i < listA_.size(); i++) {
            for (int j = 0; j < listA_.size(); j++) {
                if (listA_.get(i).equals(listA_.get(j)) && i != j) {
                    break;
                }
                if (j == listA_.size() - 1) {
                    System.out.println(listA_.get(i));
                }
            }
        }
    }
}