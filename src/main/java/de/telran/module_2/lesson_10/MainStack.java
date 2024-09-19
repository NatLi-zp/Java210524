package de.telran.module_2.lesson_10;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //LIFO
        stack.push(9);
        stack.push(1);
        stack.push(3);
        stack.push(8);
        stack.push(4);
        //stack.push(3);

        System.out.println(stack.push(3)); //возвращает добавляемое значение в случае успеха
        System.out.println(stack);

        System.out.println("Output stack = " + stack.pop()); //извлечение
        System.out.println(stack);

        System.out.println("Peek stack = " + stack.peek()); // вернуло последнее значение, не извлекает, только смотрит
        System.out.println(stack);

        System.out.println("Empty stack? = " +stack.empty()); //проверка на заполненность

        System.out.println("Search  = " +stack.search(3)); // если об. найден, то возврю его знач
        System.out.println("Search  = " +stack.search(10)); // если об. не найден, то возвр. -1


    }
}
