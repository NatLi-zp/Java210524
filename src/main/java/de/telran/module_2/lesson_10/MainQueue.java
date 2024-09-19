package de.telran.module_2.lesson_10;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {

        // Добавление в очередь, классика Queue
        Queue<String> queue = new LinkedList<>();

        //Извлечение данные при пустой очереди
        System.out.println("Извлечение poll = " + queue.poll()); // классика Queue (вернет null)
        System.out.println(queue);

//        System.out.println("Извлечение remove = " + queue.remove()); // (вернет Exception)
//        System.out.println(queue);

        queue.offer("Маша");
        queue.offer("Петя");
        queue.offer("Паша");
        queue.offer("Миша");
        System.out.println("Добавление offer = " + queue.offer("Гриша"));
        System.out.println(queue);

        System.out.println("Добавление add = " + queue.add("Дима")); // добавление как в List
        System.out.println(queue);

        //Извлечение данные
        System.out.println("Извлечение poll = " + queue.poll()); // классика Queue
        System.out.println(queue);

        System.out.println("Извлечение remove = " + queue.remove()); //
        System.out.println(queue);

        System.out.println("Просмотр  peek = " +queue.peek());
        System.out.println(queue);

        System.out.println("Просмотр element = " +queue.element());
        System.out.println(queue);

        // Рекомендуется использ. один из подходов:
        // offer/ poll/ peek - проверка ошибок по возвращен. значению из метода
        // add/ remove/ element - возвращает Exception

    }
}
