package de.telran.module_1.lesson_4;

public class Printer {
    public void print(int[] arr) {
        System.out.println("Я печатаю  int[] :");
        for (Integer val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public <T> void print(T[] arr) {
        System.out.println("Я печатаю  T[] :");
        for (T val : arr)
            System.out.print(val + " ");
        System.out.println();
    }
}
