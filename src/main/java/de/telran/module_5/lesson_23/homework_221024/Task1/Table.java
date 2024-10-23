package de.telran.module_5.lesson_23.homework_221024.Task1;

public class Table {

    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Робот2 забрал деталь");
        System.out.println("Деталей на столе: " + product);
        notify();
    }

    public synchronized void put() {
        while (product == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Робот1 положил деталь");
        System.out.println("Деталей на столе: " + product);
        notify();
    }
}
