package de.telran.module_2.lesson_10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class MainArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        //как Stack
        deque.push("Маша");
        deque.push("Петя");
        deque.push("Паша");
        deque.push("Миша");
        deque.push("Гриша"); // возвращает при ошибки Exception //добавлен последний, первій на извлечение
        //System.out.println("Добавление offer = " + deque.offer("Гриша"));
        System.out.println(deque);

        System.out.println("Просмотр  = " + deque.peek());
        System.out.println("Извлечение  = " + deque.pop());
        System.out.println(deque);

        //любое изменение работает по принципу Stack, т к мы добавляли данные как в Stack
        System.out.println("Извлечение как Queue = " + deque.poll());
        System.out.println(deque);
        System.out.println("Извлечение как List = " + deque.remove());
        System.out.println(deque);

        deque.clear();

        //как Queue FIFO
        deque.offer("Маша");
        deque.offer("Петя");
        deque.offer("Паша");
        deque.offer("Миша");
        deque.offer("Гриша"); //добавлен последний, последний на извлечение
        //System.out.println("Добавление offer = " + deque.offer("Гриша"));
        System.out.println(deque);

        //любое изменение работает по принципу Stack, т к мы добавляли данные как в Stack
        System.out.println("Извлечение как Queue = " + deque.poll());
        System.out.println(deque);

        System.out.println("Извлечение как Stack = " + deque.pop());
        System.out.println(deque);

        System.out.println("Извлечение как List = " + deque.remove());
        System.out.println(deque);

        deque.clear();

        // Имитируем Stack
        deque.addFirst("Маша");
        deque.addFirst("Петя");
        deque.addFirst("Паша");
        deque.addFirst("Миша");
        deque.addFirst("Гриша"); //добавлен последний, первый на извлечение
        System.out.println(deque);
        System.out.println("Извлечение имитируем как Stack = " + deque.removeFirst());
        System.out.println(deque);

        System.out.println("Извлечение имитируем как Queue = " + deque.removeLast());
        System.out.println(deque);

        System.out.println("Извлечение имитируем как List = " + deque.remove("Паша"));
        System.out.println(deque);

        System.out.println("Извлечение имитируем как List = " + deque.remove()); //удаляет первый элемент
        System.out.println(deque);


    }
    }

