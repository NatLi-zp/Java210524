package de.telran.module_6.lesson_28.homework_051124.task1_2;

//1 уровень сложности: 1. Представьте, что Вы ревьювите код в классе, который написал Ваш коллега.
//        Вас не устраиват реализация некоторых методов в классе, характеристик и есть
//        даже замечания по реализации самого класса.
//        Вам нужно создать аннотацию, которой Вы можете пометить вышеуказанные участки кода,
//        указать в ней ФИО ревьювера и написать в ней комментарий, в чем же Вы видите проблему.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@FixCodeAnnotation(comment = "Имя класса должно начинаться с большой буквы (MainFixCodeAnnotation)")
public class MainFixCodeAnnotation {

    @FixCodeAnnotation(comment = "переменные должны начинаться с маленькой буквы (sum) ")
    private int Sum = 20;

    @FixCodeAnnotation(comment = "переменные должны начинаться с маленькой буквы (sum2) ")
    private int Sum2 = 200;

    public MainFixCodeAnnotation() {
    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        MainFixCodeAnnotation ma = new MainFixCodeAnnotation();

        Class clazz = ma.getClass();

        // Аннотации класса
        FixCodeAnnotation annotation = ma.getClass().getAnnotation(FixCodeAnnotation.class);
        System.out.println("Name = " + annotation.name());
        System.out.println("Comment = " + annotation.comment());

        // Аннотации поля
        System.out.println();
        Field f = clazz.getDeclaredField("Sum");
        annotation = f.getAnnotation(FixCodeAnnotation.class);
        System.out.println("Name = " + annotation.name());
        System.out.println("Comment = " + annotation.comment());

//        // Аннотации методов
        System.out.println();
        Method m = clazz.getMethod("SayHi");
        annotation = m.getAnnotation(FixCodeAnnotation.class);
        System.out.println("Name = " + annotation.name());
        System.out.println("Comment = " + annotation.comment());

        ma.SayHi();
    }

    @FixCodeAnnotation(comment = "Имя метода должно начинаться с маленькой буквы (sayHi) ")
    public void SayHi() {
        System.out.println("Hi -> " + Sum);
    }
}
