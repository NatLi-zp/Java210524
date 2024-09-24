package de.telran.module_3.lesson_12.homework_230924.task2;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainLambdaTask2 {
    public static void main(String[] args) {

        //Создать лямбда выражение, которое возвращает значение true,
        //если строка не null, используя функциональный интерфейс Predicate.
        Predicate<String> predicateStr1 = (x) -> x != null;
        String str = "Миру мир!";
        System.out.println("Predicate1: строка '" + str + "' не null : " + predicateStr1.test(str));

//        Создать лямбда выражение, которое проверяет, что строка не пуста,
//        используя функциональный интерфейс Predicate.
        System.out.println();
        Predicate<String> predicateStr2 = (x) -> !x.isEmpty();
        System.out.println("Predicate2: строка '" + str + "' не пуста : " + predicateStr2.test(str));
        System.out.println("Predicate2 строка '' не пуста : " + predicateStr2.test(""));

        //Написать программу проверяющую, что строка не null и не пуста,
        //используя функциональный интерфейс Predicate.
        System.out.println();
        Predicate<String> predicateStr3 = (x) -> x != null && !x.isEmpty();
        System.out.println("Predicate3: строка '" + str + "' не null и не пуста : " + predicateStr3.test(str));
        System.out.println("Predicate3 строка '' не null и не пуста : " + predicateStr3.test(""));

        //Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
        //и заканчивается “A”. Используем функциональный интерфейс Predicate.
        System.out.println();
        str = "JohnA";
        Predicate<String> predicateStr4 = (x) -> (x.charAt(0) == 'J' || x.charAt(0) == 'N') && x.charAt(x.length() - 1) == 'A';
        System.out.println("Predicate4: строка '" + str + "' начинается буквой “J” или “N” и заканчивается “A” : " + predicateStr4.test(str));
        str = "1JohnA";
        System.out.println("Predicate4: строка '" + str + "' начинается буквой “J” или “N” и заканчивается “A” : " + predicateStr4.test(str));
        str = "NohnA";
        System.out.println("Predicate4: строка '" + str + "' начинается буквой “J” или “N” и заканчивается “A” : " + predicateStr4.test(str));

        // Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
        //“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
        System.out.println();
        Function<Integer, String> functionNum = (x) -> {
            if (x > 0) return "Положительное число";
            else if (x < 0) return "Отрицательное число";
            else return "Ноль";
        };
        int num = 15;
        System.out.println("Function: число " + num + " = " + functionNum.apply(num));
        num = -10;
        System.out.println("Function: число " + num + " = " + functionNum.apply(num));
        num = 0;
        System.out.println("Function: число " + num + " = " + functionNum.apply(num));

        //Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
        //Используем функциональный интерфейс Supplier.
        System.out.println();
        Supplier<Integer> supplierNum = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        System.out.println("Supplier: случайное число = " +supplierNum.get());
    }
}

