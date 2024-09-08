//3**. Создать трехмерный массив чисел размером MхNхZ и заполните его сгенерируемыми положительными значениями:
//        выполните тот же набор операций, что и в задание выше

package de.telran.module_2.lesson_5.homework_080924;

import java.util.Arrays;
import java.util.Random;

public class MainArrayTask3 {
    static int m = 2;
    static int n = 3;
    static int z = 5;

    public static void main(String[] args) {
        int[][][] array = createArr();
        printArr(array);
        sumArr(array);
        minArr(array);
        sumQuartArr(array);
        changeEven(array);
       // changeDouble(array);
    }

    static int[][][] createArr() {

        int[][][] arr = new int[m][n][z];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = random.nextInt(11) + 1;
                }
            }
        }
        return arr;
    }


    static void printArr(int[][][] arr) {
        System.out.println("Исходный массив : " + Arrays.deepToString(arr));
    }

    static void sumArr(int[][][] arr) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < z; k++) {
                    sum += arr[i][j][k];
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

    static void minArr(int[][][] arr) {
        int min = arr[0][0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < z; k++) {
                    min = arr[i][j][k] < min ? arr[i][j][k] : min;
                }
            }
        }
        System.out.println("Наименьший элемент массива = " + min);
    }

    static void sumQuartArr(int[][][] arr) {
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < z; k++) {
                    sum += arr[i][j][k] * arr[i][j][k];
                }
            }
        }
        System.out.println("Сумма квадратов всех элементов массива = " + sum);
    }

    static void changeEven(int[][][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < z; k++) {
                    if (arr[i][j][k] % 2 == 0) {
                        arr[i][j][k] = -arr[i][j][k];
                    }
                }
            }
        }
        System.out.println("Замена четных чисел на их отрицательное значение : " + Arrays.deepToString(arr));
    }

//    static void changeDouble(int[][][] arr) {
//        for (int i = 0; i < m; i++) {
//            for (int i1 = i+1; i1 < m; i1++) {
//
//                for (int j = 0; j < n; j++) {
//                    for (int j1 = i; j1 < n; j1++) {
//
//                        for (int k = j; k < z; k++) {
//                            for (int k1 = j; k1 < z; k1++) {
//
//
//                                if (arr[i][j][k] == arr[i1][j1][k1]) {
//                                    arr[i1][j1][k1] = 0;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Замена всех дубликатов элементов на 0 : " + Arrays.deepToString(arr));
//    }
}
