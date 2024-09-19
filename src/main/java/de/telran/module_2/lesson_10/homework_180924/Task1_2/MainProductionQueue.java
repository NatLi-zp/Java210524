package de.telran.module_2.lesson_10.homework_180924.Task1_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainProductionQueue {
    public static void main(String[] args) {

        Queue<Production> queue = new LinkedList<>();
        queue.offer(new Production("Кирпич белый", 100));
        queue.offer(new Production("Кирпич красный", 50));
        queue.offer(new Production("Кирпич серый", 1000));
        queue.offer(new Production("Кирпич цветной", 700));
        queue.offer(new Production("Кирпич голубой", 600));
        System.out.println("Первоначальный склад Queue: " + queue);

        System.out.println();
        System.out.println("Отгруженный товар: " + queue.poll());
        System.out.println("Отгруженный товар: " + queue.poll());
        System.out.println();
        System.out.println("Текущий склад: " + queue);
        System.out.println();
        System.out.println("Просматриваемый товар: " + queue.peek());
        System.out.println();
        queue.offer(new Production("Кирпич фиолетовый", 200));
        queue.offer(new Production("Кирпич желтый", 10));
        System.out.println("Текущий склад: " + queue);
    }
}
