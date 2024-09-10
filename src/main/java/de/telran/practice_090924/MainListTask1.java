//1. Создать объект ArrayList<Integer> и LinkedList<Integer>.
//        Просчитать время работы с большим количеством элементов (10 млн.) для каждого объекта:
//        - добавление в конец - add или addLast
//        - добавление в начало - addFirst или add(0,значение)
//        - добавление в середину - add(index, значение)
//
//        - удаление с конца - removeLast
//        - удаление с начала - removeFirst
//        - удаление с середины - remove(index) // удалять средний объект
//        - удаление по значению - remove(значение) //первый объект
//
//        - получение данных с конца - getLast
//        - получение данных с начала - getFirst
//        - получение данных с середины - get(index)
//
//        - изменение данных - set(index, новоеЗначение);
//        На основании полученных данных определите, для каких операций рекомендуется
//        использовать ArrayList или LinkedList.


package de.telran.practice_090924;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainListTask1 {
    public static void main(String[] args) {

        //=========ArrayList=================
        List<Integer> listA = new ArrayList<>(); // динамич. список
        long startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 1000000; i++) {
            listA.add(i);
        }
        //   System.out.println(listA);
        long endA = System.currentTimeMillis(); // фиксируем время в конце
        long resA = endA - startA;
        System.out.println("Затраченное время A add = " + resA);

        List<Integer> listL = new LinkedList<>();
        long startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 1000000; i++) {
            listL.add(i);
        }
        long endL = System.currentTimeMillis(); // фиксируем время в конце
        long resL = endL - startL;
        System.out.println("Затраченное время L add = " + resL);


        System.out.println("----------------------------------старт addFirst");
        listA.clear();
        listL.clear();
        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 100000; i++) {
            listA.addFirst(i);
        }

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A addFirst = " + resA);


        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 100000; i++) {
            listL.addFirst(i);
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L addFirst = " + resL);

        System.out.println("=============старт addLast");
        listA.clear();
        listL.clear();
        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 1000000; i++) {
            listA.addLast(i);
        }

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A addLast = " + resA);


        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 1000000; i++) {
            listL.addLast(i);
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L addLast = " + resL);


        System.out.println("=============добавление в середину - add(index, значение)");
        listA.clear();
        listL.clear();
        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 10000; i++) {
            if (i<=1) {
                listA.addFirst(i);
            }else{
                listA.add(i/2,i);
            }
        }

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A add(index, значение) = " + resA);


        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i <= 10000; i++) {
            if (i <= 1) {
                listL.addFirst(i);
            } else {
                listL.add(i / 2, i);
            }
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L add(index, значение) = " + resL);


        System.out.println("=============старт removeLast");
        listA.clear();
        listL.clear();
        for (int i = 0; i <= 1000000; i++) {
            listA.add(i);
        }

        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 1000000; i++) {
            listA.removeLast();
        }
        System.out.println(listA);

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A removeLast = " + resA);

        for (int i = 0; i <= 1000000; i++) {
            listL.add(i);
        }
        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 1000000; i++) {
            listL.removeLast();
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L removeLast = " + resL);



        System.out.println("=============старт getFirst");
        listA.clear();
        listL.clear();
        for (int i = 0; i <= 1000000; i++) {
            listA.add(i);
        }

        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 1000000; i++) {
            listA.getFirst();
        }
      //  System.out.println(listA);

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A getFirst = " + resA);

        for (int i = 0; i <= 1000000; i++) {
            listL.add(i);
        }
        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 1000000; i++) {
            listL.getFirst();
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L getFirst = " + resL);


        System.out.println("=============старт getLast");
        listA.clear();
        listL.clear();
        for (int i = 0; i <= 1000000; i++) {
            listA.add(i);
        }

        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 1000000; i++) {
            listA.getLast();
        }
        //  System.out.println(listA);

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A getLast = " + resA);

        for (int i = 0; i <= 1000000; i++) {
            listL.add(i);
        }
        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 1000000; i++) {
            listL.getLast();
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L getLast = " + resL);


        System.out.println("=============старт get(i)");
        listA.clear();
        listL.clear();
        for (int i = 0; i <= 100000; i++) {
            listA.add(i);
        }

        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 100000; i++) {
            listA.get(i);
        }

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A get(i) = " + resA);

        for (int i = 0; i <= 100000; i++) {
            listL.add(i);
        }
        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 100000; i++) {
            listL.get(i);
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L get(i) = " + resL);



        System.out.println("=============старт set(index, новоеЗначение)");
        listA.clear();
        listL.clear();
        for (int i = 0; i <= 100000; i++) {
            listA.add(i);
        }

        startA = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 100000; i++) {
            listA.set(i,i+1);

        }

        endA = System.currentTimeMillis(); // фиксируем время в конце
        resA = endA - startA;
        System.out.println("Затраченное время A set(i) = " + resA);

        for (int i = 0; i <= 100000; i++) {
            listL.add(i);
        }
        startL = System.currentTimeMillis(); // фиксируем время в начале
        for (int i = 0; i < 100000; i++) {
            listL.set(i,i+1);
        }
        endL = System.currentTimeMillis(); // фиксируем время в конце
        resL = endL - startL;
        System.out.println("Затраченное время L set(i) = " + resL);


        //--------------------------------------------
//        for (int i = 0; i <= 10000000; i++) {
//            listA.addLast(100);
//        }

//        listA.addFirst(200);
//        listA.add(10000000, 1);
//        listA.removeLast();
//        listA.removeFirst();
//        listA.remove(9999999);
//        listA.remove((Integer) 100);


        //=========LinkedList=================

//        List<Integer> listL = new LinkedList<>();
//        long startL = System.currentTimeMillis(); // фиксируем время в начале
//        for (int i = 0; i <= 10000000; i++) {
//            listL.add(i);
//        }
//
//        listL.addLast(100);
//        listL.addFirst(200);
//        listL.add(10000000, 1);
//        //System.out.println(listL);
//        long endL = System.currentTimeMillis(); // фиксируем время в конце
//        long resL = endL - startL;
//        System.out.println("Затраченное время = " + resL);
    }
}
