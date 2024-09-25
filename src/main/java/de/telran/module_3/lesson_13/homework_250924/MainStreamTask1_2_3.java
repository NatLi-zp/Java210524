//1 уровень сложности: 1) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
//2) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//        Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
//3)* Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//Сколько раз объект «Big» встречается в коллекции?

package de.telran.module_3.lesson_13.homework_250924;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStreamTask1_2_3 {
    public static void main(String[] args) {

        //1 уровень сложности: 1) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
        List<String> listStr1 = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println("Первоначальный массив :" + listStr1);
        listStr1.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        //2) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
//        Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        System.out.println();
        List<String> listStr2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        System.out.println("Первоначальный массив :" + listStr2);
        System.out.println("Отсортир. в обрат. порядке массив, без дубликатов :" + listStr2.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList());

        //3)* Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
        //Сколько раз объект «Big» встречается в коллекции?
        System.out.println();
        List<String> listStr3 = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        System.out.println("Первоначальный массив :" + listStr3);
        System.out.println("Объект «Big» встречается : " + listStr3.stream()
                .filter(x -> x.contains("Big"))
                .count() + " раз");
    }
}
