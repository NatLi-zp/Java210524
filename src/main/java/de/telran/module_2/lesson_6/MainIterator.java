package de.telran.module_2.lesson_6;

import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(); // динамич. список
        System.out.println(listA);
        List<Integer> listL = new LinkedList<>();
        System.out.println(listL);

        listA.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)); //добавление списка
        System.out.println(listA);

        listL.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)); //добавление списка
        System.out.println(listA);

        // -------ListIterator-----------
        ListIterator<Integer> listIterator = listA.listIterator();
        while (listIterator.hasNext()) {
            Integer el = listIterator.next();
            //      iterator.remove();
            System.out.print(el + " ");

//            if (el == 11) el = 25; //редактирование данных - не работает
            if (el == 11) listIterator.remove(); // удаление работает

        }
        long start = System.currentTimeMillis(); // фиксируем время в начале

        System.out.println();
        // новый функционал
        while (listIterator.hasPrevious()) {
            Integer el = listIterator.previous();
            System.out.print(el + " ");

            if (el == 3) listIterator.remove(); // удаление работает
            if (el == 5) listIterator.set(555); //изменение работает
            if (el == 8) listIterator.add(888); //вставка работает

        }
        System.out.println();
        System.out.println(listA);

        long end = System.currentTimeMillis(); // фиксируем время в конце
        System.out.println("Затраченное время = "+(end - start));
    }
}
