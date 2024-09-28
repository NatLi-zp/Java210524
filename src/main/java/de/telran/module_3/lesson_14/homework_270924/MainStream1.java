package de.telran.module_3.lesson_14.homework_270924;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MainStream1 {
    public static void main(String[] args) {

        //Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> list = new ArrayList<>(List.of(1, 3, 2, 4, 9, 3, 5, 4, 2, 7, 8, 3, 1));
        System.out.println("Первоначальный массив: " + list);

        System.out.println("1. Массив с нечетными числами: " + list.stream().filter(x -> x % 2 != 0).toList());

        //Задание 2: Преобразование списка строк в список чисел
        List<String> listStr = new ArrayList<>(List.of("1", "3", "2", "4", "9", "3", "5"));
        System.out.println("2. Преобразование списка строк " + listStr + " в список чисел: ");
        listStr.stream().mapToInt(x -> Integer.parseInt(x)).forEach(x -> System.out.print(x + ", "));

        //Задание 3: Суммирование списка чисел
        System.out.println();
        System.out.println();
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 2, 4));
        int sum = list1.stream().mapToInt(x -> x).sum();
        System.out.println("3. Сумма элементов массива " + list1 + " = " + sum);

        //Задание 4: Определение максимального значения в списке
        System.out.println("4. MAX = " + list1.stream()
                // .map(x -> x)
                .max(Comparator.naturalOrder()));

        //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> listStr1 = new ArrayList<>(List.of("aaa", "bbb", "ccc", "bd", "hhb"));
        char ch = 'b';
        System.out.println("5. Преобразование списка строк, которые начинаются с  " + ch + " " + listStr1 + " в верхний регистр: ");
        listStr1.stream()
                .filter(x -> x.charAt(0) == ch)
                .map(x -> x.toUpperCase())
                .forEach(x -> System.out.print(x + ", "));

        //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        System.out.println();
        List<String> listStr2 = new ArrayList<>(List.of("aaaaa", "bbbbbbb", "ccc", "aaaaa", "hhb"));
        System.out.println("6. Получение списка уникальных слов из списка строк  " + listStr2 + " длина которых больше 4 символов: ");
        listStr2.stream()
                .distinct()
                .filter(x -> x.length() > 4)
                .forEach(x -> System.out.print(x + ", "));

        //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        System.out.println();
        List<Integer> listInt = new ArrayList<>(List.of(7, 1, 3, 2, 4, 5, 10, 6));
        int sum3_5 = listInt.stream()
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .mapToInt(x -> x).sum();
        System.out.println("8. Сумма чисел, кратных 3 и 5, массива " + listInt + " = " + sum3_5);

        //--------------------------------------
        // Задача 1: Фильтрация четных чисел и умножение на 2.
        System.out.println();
        System.out.println("1. Фильтрация четных чисел и умножение на 2, массива " + listInt + " = " + listInt.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .toList());

        // Задача 2: Удаление дубликатов из списка строк.
        System.out.println();
        System.out.println("2.Удаление дубликатов из списка строк массива " + listStr2 + " = " + listStr2.stream()
                .distinct()
                .toList());

        // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        System.out.println();
        System.out.println("3.Сортировка списка чисел в порядке убывания и выбор первых трех элементов массива " + list + " = " + list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList());

        // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
        System.out.println();
        System.out.println("3.Пропуск первых двух элементов и вывод оставшихся массива " + list + " = " + list.stream()
                .skip(2)
                .toList());

        // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
        System.out.println();
        List<Integer> listInt2 = new ArrayList<>(List.of(1, 3, 60, 4, 9, 200, 1));
        System.out.println("6. Фильтрация чисел больше 50 и вывод их квадратов, массива " + listInt2 + " = " + listInt2.stream()
                .filter(x -> x > 50)
                .map(x -> x * x)
                .toList());

        // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
        List<String> listStr3 = new ArrayList<>(List.of("aoa", "bbb", "occ", "oo", "hhb"));

        System.out.println("7. Оставить только слова, содержащие букву 'o' и вывести их в обратном порядке " + listStr3 + " = " +
                listStr3.stream()
                        .filter(x -> x.contains("o"))
                        .sorted(Comparator.reverseOrder())
                        .toList());

        // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        System.out.println("8. Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания " + listInt + " = " +
                listInt.stream()
                        .filter(x -> x % 2 != 0)
                        .sorted()
                        .toList());

        // Задача 9: Получить среднее значение чисел в списке.
        System.out.println();
        System.out.println("8. Cреднее значение чисел в списке " + list1 + " = " +
                list1.stream()
                        .mapToInt(x -> x)
                        .average());
    }
}
