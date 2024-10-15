package de.telran.module_5.lesson_20.practice;

//  3**. Напишите задачу для поиска всех простых числа в диапазоне до 1 000 000.
//  Напишите программу, запустив которую вы сможете определить оптимальное количество
//  создаваемых потоков для выполнения этой задачи на текущем компьютере.
//  Используйте общее время выполнения программы при обработке всего диапазона чисел
//  для расчета оптимального количества созданных потоков.

import de.telran.module_2.lesson_9.SortFlyByName;

import java.util.Arrays;

public class MainSimple {
    public static void main(String[] args) throws InterruptedException {
        long timestart = System.currentTimeMillis();
//        System.out.println(getCountSimple(2, 1_000_000));
        System.out.println(getCountSimple(2, 300_000));
        System.out.println("time = " + (System.currentTimeMillis() - timestart));

        timestart = System.currentTimeMillis();
        SimpleNumberIsThread thread1 = new SimpleNumberIsThread(2, 100_000);
        SimpleNumberIsThread thread2 = new SimpleNumberIsThread(100_001, 200_000);
        SimpleNumberIsThread thread3 = new SimpleNumberIsThread(200_001, 300_000);

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("time Multi = " + (System.currentTimeMillis() - timestart));

        for (int i = 2; i < 10; i++) {
            System.out.println(i +"потоков ="+getTime(i, 2,300_000));
        }
        // System.out.println("getTime ="+getTime(3, 2,300_000));
    }

    public static int getCountSimple(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        return count;
    }

    public static long getTime(int countThread, int start, int end) {
        long startTime = System.currentTimeMillis();
        int interval = (end - start) / countThread;
        int currentSrart = start;
        SimpleNumberIsThread[] threads = new SimpleNumberIsThread[countThread];

        for (int i = 0; i < countThread; i++) {
            threads[i] = new SimpleNumberIsThread(currentSrart, currentSrart + interval);
            currentSrart += interval;
            threads[i].start();
        }
        Arrays.stream(threads).forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        return System.currentTimeMillis() - startTime;
    }
}
