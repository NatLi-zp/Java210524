// 1. Создать одномерный массив чисел размером M и заполните его сгенерируемыми положительными значениями:
//        вывести все элементы на экран.
//        найти сумму всех элементов.
//        найти наименьший элемент.
//        найти сумму квадратов всех элементов.
//        заменить все четные числа на их отрицательное значение.
//        -* найти второй по величине элемент.
//        -* замените все дубликаты элементов на 0.

package de.telran.module_2.lesson_5.homework_080924;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MainArrayTask1 {
    public static void main(String[] args) {
        int[] array = creatArr();
        printArr(array);
        sumArr(array);
        minArr(array);
        sumQuartArr(array);
        changeEven(array);
        findeTwoMin(array);
        changeDouble(array);
    }

    static int[] creatArr() {
        int m = 10;
        int[] arr = new int[m];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            arr[i] = random.nextInt(11) + 1;
        }
        return arr;
    }

    static void printArr(int[] arr) {
        System.out.println("Исходный массив : " + Arrays.toString(arr));
    }

    static void sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    static void minArr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
        }
        System.out.println("Наименьший элемент массива = " + min);
    }

    static void sumQuartArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }
        System.out.println("Сумма квадратов всех элементов массива = " + sum);
    }

    static void changeEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr[i] = -arr[i];
        }
        System.out.println("Замена четных чисел на их отрицательное значение : " + Arrays.toString(arr));
    }

    static void findeTwoMin(int[] arr) {
        // int[] arr1 = {1,1,1};
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length); // сделаем копию массива
        Arrays.sort(arr1);

        // System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        arr1 = Arrays.stream(arr1).distinct().toArray(); //уберем дубли из массива
        System.out.println(Arrays.toString(arr1));
        if (arr1.length > 1) {
            System.out.println("Второй по величине элемент = " + arr1[arr1.length - 2]);
        } else {
            System.out.println("В массиве все элементы  = " + arr1[arr1.length - 1]);
        }
    }

    static void changeDouble(int[] arr) {
        System.out.println();
        System.out.println("Массив до замены: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println("Замена всех дубликатов элементов на 0 : " + Arrays.toString(arr));
    }
}
