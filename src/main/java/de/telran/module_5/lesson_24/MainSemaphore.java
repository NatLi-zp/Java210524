package de.telran.module_5.lesson_24;

import java.util.concurrent.Semaphore;

public class MainSemaphore {
    public static void main(String[] args) throws InterruptedException {
        // Ограничить количество одновременно работающих потоков
        Semaphore semaphore = new Semaphore(3); //fair - не всегда срабатывает
        for (int i = 0; i < 10; i++) {
            new Thread(new ThreadTest(semaphore), "Поток - "+i).start();
            Thread.sleep(200);
        }
    }
}

class ThreadTest implements Runnable
{
    Semaphore semaphore;
    public ThreadTest(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" начал работать "+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" закончил работать");
            semaphore.release();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}