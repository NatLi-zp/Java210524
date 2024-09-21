
//2) У вас есть приют для животных, в которых живут коты.
//        Есть объект Cat с данными: имя, возраст, вес, порода.
//        создайте Map, ключем которого будет имя, а значением объект Cat.
//        информация о котах должна храниться в упорядоченном виде по имени.
//        выведите имена котов, порода которых равна N (на ваше усмотрение).
//        выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
//        * найдите кота с самым большим весом и возрастом одновременно.

package de.telran.module_2.lesson_11.homework_200924.task2;

import java.util.Map;
import java.util.TreeMap;

public class MainCat {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new TreeMap<>();
        catMap.put("Барсик", new Cat("Барсик", 5, 7, "сиамская"));
        catMap.put("Буся", new Cat("Буся", 1, 3, "британская"));
        catMap.put("Мурка", new Cat("Мурка", 10, 5, "персидская"));
        catMap.put("Васька", new Cat("Васька", 1, 6, "без породы"));
        catMap.put("Кузя", new Cat("Кузя", 10, 8, "британская"));
        catMap.put("Маркиза", new Cat("Маркиза", 2, 15, "мей-кун"));
        System.out.println("Питомник в упорядоченном виде по имени :");
        System.out.println(catMap);

        //выведите имена котов, порода которых равна N
        System.out.println();
        String isBreed = "британская";
        System.out.println("Имена котов, порода которых = " + isBreed + " : ");

        for (Map.Entry<String, Cat> entry : catMap.entrySet()) {
            if (entry.getValue().breed.equals(isBreed)) {
                System.out.println(entry.getKey());
            }
        }

        //выведите имена котов, порода которых равна N
        System.out.println();
        int isWeight = 5;
        System.out.println("Список котов, вес которых > " + isWeight + " кг: ");

        for (Map.Entry<String, Cat> entry : catMap.entrySet()) {
            if (entry.getValue().weight > isWeight) {
                System.out.println(entry.getKey() + " с весом " + entry.getValue().weight + " кг");
            }
        }

        // найдите кота с самым большим весом и возрастом одновременно.
        System.out.println();
        int maxWeightAge = 0;
        int catWeightAge = 0;
        String maxName = "";
        System.out.println("Кот с самым большим весом и возрастом одновременно:");

        for (Map.Entry<String, Cat> entry : catMap.entrySet()) {
            catWeightAge = entry.getValue().weight + entry.getValue().age;
            if (catWeightAge > maxWeightAge) {
                maxWeightAge = catWeightAge;
                maxName = entry.getValue().name;
            }
        }
        System.out.println(catMap.get(maxName));
    }


}
