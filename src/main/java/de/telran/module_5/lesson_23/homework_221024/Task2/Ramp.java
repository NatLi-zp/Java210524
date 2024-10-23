package de.telran.module_5.lesson_23.homework_221024.Task2;

public class Ramp {
    private int product = 0;

    public synchronized void get() {
        String name = Thread.currentThread().getName();
        while (product < 1) {
            try {
                wait();
                System.out.println("2. Погрузчик  " + name + " ждет");
            } catch (InterruptedException e) {
            }
        }
        product--;

        System.out.println(name + " - погрузчик взял 1 ящик");
        System.out.println("Ящиков на рампе: " + product);
        notify();
    }


    public synchronized void put() {
        String name = Thread.currentThread().getName();
        while (product == 2) {
            try {
                wait();
                System.out.println("1. Разгрузчик  " + name + " ждет");
            } catch (InterruptedException e) {
            }
        }
        product++;

        System.out.println("Разгрузчик положил на рампу 1 ящик");
        System.out.println("Ящиков на рампе: " + product);
        notifyAll();
    }

}

