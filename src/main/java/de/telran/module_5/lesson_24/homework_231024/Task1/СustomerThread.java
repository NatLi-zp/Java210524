package de.telran.module_5.lesson_24.homework_231024.Task1;

import java.util.concurrent.Semaphore;

public class СustomerThread extends Thread {
    Semaphore semaphore;

    public СustomerThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " вошел в магазин ");
            Thread.sleep(30);
            System.out.println(Thread.currentThread().getName() + " вышел из магазина ");
            semaphore.release();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
