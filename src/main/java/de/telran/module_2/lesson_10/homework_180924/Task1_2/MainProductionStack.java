package de.telran.module_2.lesson_10.homework_180924.Task1_2;

import java.util.Stack;

public class MainProductionStack {
    public static void main(String[] args) {

        Stack<Production> stack = new Stack<>();
        stack.push(new Production("Кирпич белый", 100));
        stack.push(new Production("Кирпич красный", 50));
        stack.push(new Production("Кирпич серый", 1000));
        stack.push(new Production("Кирпич цветной", 700));
        stack.push(new Production("Кирпич голубой", 600));
        System.out.println("Первоначальный склад Stack: " + stack);

        System.out.println();
        System.out.println("Отгруженный товар: " + stack.pop());
        System.out.println("Отгруженный товар: " + stack.pop());
        System.out.println();
        System.out.println("Текущий склад: " + stack);
        System.out.println();
        System.out.println("Просматриваемый товар: " + stack.peek());
        System.out.println();
        System.out.println("Поступивший товар: " + stack.push(new Production("Кирпич фиолетовый", 200)));
        System.out.println("Поступивший товар: " + stack.push(new Production("Кирпич желтый", 10)));
        System.out.println("Текущий склад: " + stack);
    }
}
