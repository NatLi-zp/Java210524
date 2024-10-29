package de.telran.module_5.lesson_26.homework_291024.Task2;

import java.util.concurrent.*;

public class MainShopSchedule {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int countThread = 2000; //10_000;

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        long currentTime = System.currentTimeMillis();
        for (int i = 1; i <= countThread; i++) {
            executorService.execute(new СustomerSchedule(i + 1));
        }

        System.out.println("vor1");
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("Общее время обслуживания всех покупателей: " + (System.currentTimeMillis() - currentTime));
    }
}
