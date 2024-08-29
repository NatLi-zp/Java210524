package de.telran.lesson_2.homework_290824.numer1;

import java.util.Arrays;

public class MainUtils {
    public static void main(String[] args) {
        getAVG(5, 7);
        getMAX(5, 7);
        getMIN(5, 7);

        System.out.println();
        getAVG(5.5, 7.7);
        getMAX(5.5, 7.7);
        getMIN(5.5, 7.7);

        System.out.println();
        getAVG(5, 7.7);
        getMAX(5, 7.7);
        getMIN(5, 7.7);

        System.out.println();
        int[] arr1 = {7, 2, 10, 5};
        getAVG(arr1);
        getMAX(arr1);
        getMIN(arr1);

        System.out.println();
        double[] arr2 = {7.7, 2.2, 10.1, 5.5};
        getAVG(arr2);
        getMAX(arr2);
        getMIN(arr2);
    }

    //int
    static void getAVG(int num1, int num2) {

        System.out.println("AVG " + num1 + " и " + num2 + " = " + (num1 + num2) / 2);
    }

    static void getMAX(int num1, int num2) {
        System.out.println("MAX " + num1 + " и " + num2 + " = " + (num1 > num2 ? num1 : num2));
    }

    static void getMIN(int num1, int num2) {
        System.out.println("MIN " + num1 + " и " + num2 + " = " + (num1 < num2 ? num1 : num2));
    }

    //double
    static void getAVG(double num1, double num2) {

        System.out.println("AVG " + num1 + " и " + num2 + " = " + (num1 + num2) / 2);
    }

    static void getMAX(double num1, double num2) {
        System.out.println("MAX " + num1 + " и " + num2 + " = " + (num1 > num2 ? num1 : num2));
    }

    static void getMIN(double num1, double num2) {
        System.out.println("MIN " + num1 + " и " + num2 + " = " + (num1 < num2 ? num1 : num2));
    }

    //int + double
    static void getAVG(int num1, double num2) {

        System.out.println("AVG " + num1 + " и " + num2 + " = " + (num1 + num2) / 2);
    }

    static void getMAX(int num1, double num2) {
        System.out.println("MAX " + num1 + " и " + num2 + " = " + (num1 > num2 ? num1 : num2));
    }

    static void getMIN(int num1, double num2) {
        System.out.println("MIN " + num1 + " и " + num2 + " = " + (num1 < num2 ? num1 : num2));
    }

    //int[] array
    static void getAVG(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("AVG массива" + Arrays.toString(arr) + " = " + sum / 2);
    }

    static void getMAX(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("MAX массива" + Arrays.toString(arr) + " = " + (max));
    }

    static void getMIN(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("MIN массива" + Arrays.toString(arr) + " = " + (min));
    }

    //double[] array
    static void getAVG(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("AVG массива" + Arrays.toString(arr) + " = " + sum / 2);
    }

    static void getMAX(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("MAX массива" + Arrays.toString(arr) + " = " + (max));
    }

    static void getMIN(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("MIN массива" + Arrays.toString(arr) + " = " + (min));
    }

}
