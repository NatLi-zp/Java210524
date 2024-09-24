package de.telran.module_3.lesson_12.homework_230924.task1;

import de.telran.module_3.lesson_12.MyOperation;

import java.util.function.Consumer;

public class MainPrintable {
    public static void main(String[] args) {

        Printable printable = (x) -> System.out.println(x.toUpperCase()); //
        printable.print("Миру Мир!");

        Printable printable1 = (x) -> System.out.println(x.toLowerCase()); //
        printable1.print("Миру Мир!");

        Consumer<String> consumer = (x) -> System.out.println("Consumer : " + x.toUpperCase());
        consumer.accept("Миру Мир!");

        Consumer<String> consumer1 = (x) -> System.out.println("Consumer : " + x.toLowerCase());
        consumer1.accept("Миру Мир!");
    }


}
