package de.telran.module_5.lesson_22.homework_191024.Task2;

import java.util.concurrent.atomic.AtomicInteger;

public class CourseAtomic extends Thread {
    private AtomicInteger sum = new AtomicInteger();

    public AtomicInteger getSum() {
        return sum;
    }

    @Override
    public void run() {
        int max = 10_000;

        while (sum.get() < max) {
            sum.getAndAdd(100);
            System.out.println("Поток " + Thread.currentThread().getName() + " = " + sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
