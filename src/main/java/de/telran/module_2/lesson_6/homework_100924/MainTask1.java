//1 уровень сложности: 1)
//        Найти сумму всех элементов ArrayList.
//        Найти среднее значение элементов ArrayList.
//        Перебрать ArrayList и найти наименьший элемент.
//        Перебрать ArrayList и найти сумму квадратов всех элементов.
//        *Перебрать ArrayList и удалить все четные числа.
//        *Перебрать ArrayList и найти второй по величине элемент.
//
//        Перебрать LinkedList и найти наибольший элемент.
//        Перебрать LinkedList и заменить все элементы, кратные 3, на нули.
//        Перебрать LinkedList и вычислить произведение всех элементов.
//        *Перебрать LinkedList и вывести все элементы в обратном порядке.
//        *Перебрать LinkedList и удалить все дубликаты элементов.


package de.telran.module_2.lesson_6.homework_100924;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {

        System.out.println(" //---------ArrayList---------------------");
        List<Integer> listA = new ArrayList<>();
        listA.addAll(0, List.of(9, 1, 2, 9, 3, 4, 5, 6, 7, 8, 9, 10)); //вставка списка
        System.out.println(listA);

        add(listA);
        avg(listA);
        min(listA);
        addSquare(listA);
        removeEven(listA);
        maxTwo(listA);
        System.out.println();

        System.out.println(" //---------LinkedList---------------------");
        List<Integer> listL = new LinkedList<>(List.of(1, 2, 9, 15, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(listL);
        max(listL);
        changeThreeElem(listL);

        listL.clear();
        listL.addAll(Arrays.asList(7, 1, 5, 2, 3, 7, 4, 8, 2));
        System.out.println(listL);
        multi(listL);
        changeOrder(listL);
        removeDouble(listL);
    }


    //---------ArrayList---------------------

    public static void add(List<Integer> listA) {
        int sum = 0;
        for (int i = 0; i < listA.size(); i++) {
            sum += listA.get(i);
        }
        System.out.println("Сумма всех элементов ArrayList = " + sum);
    }

    public static void avg(List<Integer> listA) {
        int sum = 0;
        for (int i = 0; i < listA.size(); i++) {
            sum += listA.get(i);
        }
        System.out.println("Среднее значение элементов ArrayList = " + (double) sum / listA.size());
    }

    public static void min(List<Integer> listA) {
        int min = listA.getFirst();
        for (int i = 1; i < listA.size(); i++) {
            min = min < listA.get(i) ? min : listA.get(i);
        }
        System.out.println("Наименьший элемент ArrayList = " + min);
    }

    public static void addSquare(List<Integer> listA) {
        int sum = 0;
        for (int i = 0; i < listA.size(); i++) {
            sum += listA.get(i) * listA.get(i);
        }
        System.out.println("Сумма квадратов всех элементов ArrayList = " + sum);
    }

    public static void removeEven(List<Integer> listA) {

        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) % 2 == 0) {
                listA.remove(i);
            }
        }
        System.out.println("ArrayList без четных чисел : " + listA);
    }


    //пыталась учесть частный случай,когда 1й элемент массива является максимальным и есть его дубли: [9, 1, 9, 3, 5, 7, 9]
    public static void maxTwo(List<Integer> listA) {

        int max1 = listA.getFirst();
        int max2 = max1;

        for (int i = 1; i < listA.size(); i++) {
            if (max1 <= listA.get(i)) {
                max1 = listA.get(i);
            } else {
                max2 = listA.get(i);
            }
            //max1 = max1 > listA.get(i) ? max1 : listA.get(i);
        }
        System.out.println("Первый по величине элемент ArrayList = " + max1);

        for (int i = 0; i < listA.size(); i++) {
            if (max2 < max1 && listA.get(i) > max2 && max1 < listA.get(i)) {
                max2 = listA.get(i);
            }
        }

        System.out.println("Второй по величине элемент ArrayList = " + max2);
    }


    //---------LinkedList---------------------"
    public static void max(List<Integer> listL) {
        int max = listL.getFirst();
        for (int i = 1; i < listL.size(); i++) {
            max = max > listL.get(i) ? max : listL.get(i);
        }
        System.out.println("Наибольший элемент LinkedList  = " + max);
    }

    public static void changeThreeElem(List<Integer> listL) {
        for (int i = 0; i < listL.size(); i++) {
            if (listL.get(i) % 3 == 0) {
                listL.set(i, 0);
            }
        }
        System.out.println("Замена элементов, кратных 3, на 0  LinkedList : " + listL);
    }

    public static void multi(List<Integer> listL) {
        int res = 1;
        for (int i = 0; i < listL.size(); i++) {
            res *= listL.get(i);
        }
        System.out.println("Произведение всех элементов LinkedList = " + res);
    }

    public static void changeOrder(List<Integer> listL) {
        System.out.print("Элементы в обратном порядке LinkedList: ");
        for (int i = listL.size() - 1; i >= 0; i--) {
            System.out.print(listL.get(i) + " ");
        }
        System.out.println();
    }

    public static void removeDouble(List<Integer> listL) {

        for (int i = 0; i < listL.size(); i++) {
            for (int j = i + 1; j < listL.size(); j++) {
                if (listL.get(i) == listL.get(j)) {
                    listL.remove(j);
                }
            }
        }
        System.out.println("Элементы без дублей LinkedList: " + listL);
    }

}
