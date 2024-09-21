//1 уровень сложности: 1) Есть Map, в котором храниться количество жителей по разным городам.
//        Найдите город с самым большим количеством жителей.
//        Найдите среднее количество жителей по всем городам.
//        Найдите все города, у которых количество жителей одинаковое.

package de.telran.module_2.lesson_11.homework_200924;

import java.util.*;

public class MainMapTask1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new TreeMap<>();

        map1.put("Berlin", 3_645_000); // добавление данных
        map1.put("Hamburg", 1_841_000);
        map1.put("Schwarzenbek", 17_000);
        map1.put("Köln", 1_086_000);
        map1.put("Mölln", 17_000);
        map1.put("Geesthacht", 2_000);
        map1.put("Berlin2", 3_645_000);
        map1.put("Schwarzenbek2", 17_000);

        System.out.println("Список городов с населением :" + map1);

        //Найдите город с самым большим количеством жителей.
        int max = 0;
        String maxkey = "";
        for (Map.Entry<String, Integer> entry1 : map1.entrySet()) {
            if (entry1.getValue() > max) {
                max = entry1.getValue();
                maxkey = entry1.getKey();
            }
        }
        System.out.println("Город с самым большим кол-вом жителей : " + maxkey + ", кол-во жителей = " + max);


        //-------------Найдите среднее количество жителей по всем городам.
        System.out.println();
        int sum = 0;
        int i = 0;
        for (Map.Entry<String, Integer> entry2 : map1.entrySet()) {
            sum += entry2.getValue();
            i += 1;
        }
        System.out.println("Все население = " + sum + ", кол-во городов = " + i + ", среднее кол-во жителей = " + sum / i);


        //--------------Найдите все города, у которых количество жителей одинаковое. (1 способ)
        System.out.println();
        List<Map.Entry<String, Integer>> valuesList = new ArrayList(map1.entrySet());
        Collections.sort(valuesList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Отсортированный List по кол-ву жителей Comparator= " + valuesList);


        System.out.println();
        System.out.println("Города, у которых количество жителей одинаковое: ");

        String key = valuesList.getFirst().getKey();
        int value = valuesList.getFirst().getValue();

        for (int j = 1; j < valuesList.size(); j++) {
            if (value == valuesList.get(j).getValue()) {
                System.out.print(key + " и " + valuesList.get(j) + ", ");
            } else {
                value = valuesList.get(j).getValue();
                key = valuesList.get(j).getKey();
            }
        }
        System.out.println();

        //--------------Найдите все города, у которых количество жителей одинаковое. (2 способ (по отбору))

        System.out.println();
        int value2 = 17000;
        System.out.println("Города, у которых количество жителей одинаковое (по отбору): "+value2 + " жителей : ");

        for (Map.Entry<String, Integer> entry2 : map1.entrySet()) {
            if (entry2.getValue() == value2) {
                System.out.println(entry2.getKey());
            }
        }
    }
}

