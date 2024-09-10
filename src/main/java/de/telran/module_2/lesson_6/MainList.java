package de.telran.module_2.lesson_6;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        List listO = new ArrayList<>(); // raw types - сырой тип, не рекомендуется использовать
        System.out.println(listO);
        List<Integer> listA = new ArrayList<>(); // динамич. список
        System.out.println(listA);
        List<Integer> listL = new LinkedList<>();
        System.out.println(listL);


        //------------Добавление данных
        listO.add("Вася"); // не рекоменд
        listO.add(123); // не рекоменд
        listO.add(123.01);   // не рекоменд
        System.out.println(listO);

        listA.add(1);
        listA.add(2);
        listA.add(4);
        System.out.println(listA);

        listA.add(1, 22); //вставка числа 22 в позицию 1
        System.out.println(listA);

        listA.addLast(1); //операция ,аналогична add(), вставляет в конец
        System.out.println(listA);

        listA.addFirst(4); //добавляет в начало
        System.out.println(listA);

        listA.addAll(List.of(7, 8, 9)); //добавление списка
        System.out.println(listA);

        listA.addAll(2, List.of(7, 8, 9)); //вставка списка
        System.out.println(listA);


// работа с LinkedList


        System.out.println("----------работа с LinkedList-----------");
        listL.add(1);
        listL.add(2);
        listL.add(4);
        System.out.println(listL);
        listL.add(1, 22); //вставка числа 22 в позицию 1
        System.out.println(listL);

        listL.addLast(1); //операция ,аналогична add(), вставляет в конец
        System.out.println(listL);

        listL.addFirst(4); //добавляет в начало
        System.out.println(listL);

        listL.addAll(List.of(7, 8, 9)); //добавление списка
        System.out.println(listL);

        listL.addAll(2, List.of(7, 8, 9)); //вставка списка
        System.out.println(listL);

        // изменение информации
        System.out.println(" --------Изменение информации--------");
        listA.set(1, 111);
        System.out.println(listA);

        //listA.replaceAll(); // позже изучим

        System.out.println(" --------Удаление информации--------");
        listA.remove(1); // удаление по индексу
        System.out.println("Удаление сущ. знач. 22 = " + listA.remove((Integer) 22));
        System.out.println("Удаление несущ. знач. 44 = " + listA.remove((Integer) 44));
        //listA.remove((Integer) 22);  // удаление по значению эл-та, приходится преобразовать,иначе будет считать,что это индекс
        System.out.println(listA);

        List<String> listStr = new ArrayList<>();
        listStr.addAll(List.of("Один", "Два", "Три"));
        System.out.println(listStr);
        listStr.remove("Два"); // удаление по значению эл-та
        System.out.println(listStr);

        listA.removeFirst();
        listA.removeLast();
        System.out.println(listA);

        System.out.println(listA.removeAll(List.of(2, 4, 1, 11))); // удаление любого эл-та из списка по значению
        System.out.println(listA); //если хотя бы 1 эл-т удалет,то = true

        System.out.println(listA.removeAll(List.of(2, 3, 4)));
        System.out.println(listA); //если не найдены ни один элемент и ничего не удалено, то = false

        //Поиск информации
        System.out.println(listA.get(2)); //возврат значения по индексу
        System.out.println(listA.getFirst()); //возврат значения 1го эл-та
        System.out.println(listA.getLast()); //возврат значения последнего эл-та

        System.out.println(listA.contains(9));
        if (listA.contains(7))
            System.out.println("Объект найден");
        else
            System.out.println("Объект не найден");


        //------------Заполнение массива данными
        List<Integer> list1 = List.of(1, 2, 3, 4); // не изменяемый массив
        // Операции изменения данных проводить нельзя!!!!
        //list1.add(11);
        //list1.remove(4);
        //list1.set(3,11);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4); // не изменяемый массив
        //list2.add(11);
        //list2.remove(4);
        //list2.set(3,11);

        // Сделать изменяемым
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4));
        list3.add(11);
        list3.remove(4);
        list3.set(3, 11);
        System.out.println(list3);

        // Перемещение по коллекции
        List<Integer> list4 = new ArrayList<>(); // заполнение
        for (int i = 0; i < 10; i++) {
            list4.add(i, i + 5);
        }
        System.out.println(list4);

        // итерация по доступу к элементам по индексу
        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i) + " ");
        }
        System.out.println();

        // итерация элементов по Iterator
        Iterator<Integer> iterator = list4.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
            //      iterator.remove();
            System.out.print(el + " ");

//            if (el == 11) el = 25; //редактирование данных - не работает
            if (el == 11) iterator.remove(); // удаление работает

        }
        System.out.println();
        System.out.println(list4);

        //foreach - только для просмотра
        int sum = 0;
        for (Integer el : listA) {
            System.out.print(el + " ");
            sum += el;
        }

        System.out.println();
        System.out.println("Sum = " +sum);
        list4.forEach(System.out::print);
        System.out.println();


    }

}
