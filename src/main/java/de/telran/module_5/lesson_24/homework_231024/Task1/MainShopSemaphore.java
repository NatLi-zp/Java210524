package de.telran.module_5.lesson_24.homework_231024.Task1;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class MainShopSemaphore {
    public static void main(String[] args) throws InterruptedException {
        int countThread = 10_000;
        Semaphore semaphore = new Semaphore(10, true);

        Thread[] threads = new Thread[countThread];

        long currentTime = System.currentTimeMillis();

        for (int i = 0; i < countThread; i++) {
            threads[i] = new Thread(new СustomerThread(semaphore), "Покупатель - " + (i + 1));
            threads[i].start();
        }

        Arrays.stream(threads).forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Общее время обслуживания всех покупателей: " + (System.currentTimeMillis() - currentTime));
    }
}
