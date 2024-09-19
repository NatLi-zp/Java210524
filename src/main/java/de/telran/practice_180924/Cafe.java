package de.telran.practice_180924;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Cafe {
    private Queue<DishType> dishQueue;
    private Stack<String> ingridients;

    public Cafe() {
        dishQueue = new LinkedList<>();
        ingridients = new Stack<>();
    }

    public Queue<DishType> getDishQueue() {
        return dishQueue;
    }

    public Stack<String> getIngridients() {
        return ingridients;
    }

    public void dishToToQueue(DishType dish) {
        dishQueue.offer(dish);
        System.out.println("Добавлено блюдо "+dish);
    }

    public DishType getNextDish() {
        DishType nextDish = dishQueue.peek();
        System.out.println("Просмотр след. блюда "+nextDish);
        return nextDish;
    }

    public DishType takeDishFromQueue() {
        DishType takeDish = dishQueue.poll();
        System.out.println("Берем блюдо в заказ: "+takeDish);
        return takeDish;
    }

    public void addIngridient(String ingr) {
        ingridients.push(ingr);
        System.out.println("Добавляем ингридиенты: "+ingr);
    }

    public void CheckCountOfDishes() {
        if (dishQueue.isEmpty()) {
            System.out.println("Блюда закончились");
        } else {
            System.out.println("Блюда еще не закончились");
        }
    }
}
