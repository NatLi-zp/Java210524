package de.telran.module_2.lesson_8.homework_150924.task3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class MainOrder {
    public static void main(String[] args) {
        Order order1 = new Order(new ArrayList(List.of("Оливье","Рябчик с ананасами","Мохито")), 10,125);
        Order order2 = new Order(new ArrayList(List.of("Борщ","Омлет","Компот")), 5,110);
        Order order3 = new Order(new ArrayList(List.of("Соленый огурец","Водка 50гр")), 12,100);
        Order order4 = new Order(new ArrayList(List.of("Суши","Сакэ")), 1,200);
        Order order5 = new Order(new ArrayList(List.of("Солянка","Жаркое","Вино 200гр")), 3,120);
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(order1);
        linkedHashSet.add(order2);
        linkedHashSet.add(order3);
        linkedHashSet.add(order4);
        linkedHashSet.add(order5);

        System.out.println(linkedHashSet);
    }
}
