//2*. Создать двумерный массив чисел размером MхN и заполните его сгенерируемыми положительными значениями:
//        выполните тот же набор операций, что и в задание выше

package de.telran.module_2.lesson_5.homework_060924.task1;

import java.util.Arrays;
import java.util.Random;

public class MainArrayTask2 {
    static int m = 2;
    static int n = 3;

    public static void main(String[] args) {
        int[][] array = creatArr();
        printArr(array);
        sumArr(array);
        minArr(array);
        sumQuartArr(array);
        changeEven(array);
       // changeDouble(array);
    }

    static int[][] creatArr() {

        int[][] arr = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = random.nextInt(11) + 1;
        }
        return arr;
    }

    static void printArr(int[][] arr) {
        System.out.println("Исходный массив : " + Arrays.deepToString(arr));
    }

    static void sumArr(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                sum += arr[i][j];
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    static void minArr(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min = arr[i][j] < min ? arr[i][j] : min;
            }
        }
        System.out.println("Наименьший элемент массива = " + min);
    }

    static void sumQuartArr(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j] * arr[i][j];
            }
        }
        System.out.println("Сумма квадратов всех элементов массива = " + sum);
    }

    static void changeEven(int[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0)
                    arr[i][j] = -arr[i][j];
            }
        }
        System.out.println("Замена четных чисел на их отрицательное значение : " + Arrays.deepToString(arr));
    }

//    static void changeDouble(int[][] arr) {
//        for (int i = 0; i < m; i++) {
//            for (int i1 = i+1; i1 < m; i1++) {
//
//                for (int j = 0; j < n; j++) {
//                //    for (int j1 = 0; j1 < n; j1++) {
//
//                        if (arr[i][j] == arr[i1][j]) {
//                            arr[i1][j] = 0;
//                        }
//                //    }
//                }
//            }
//        }
//        System.out.println("Замена всех дубликатов элементов на 0 : " + Arrays.deepToString(arr));
//    }
}

