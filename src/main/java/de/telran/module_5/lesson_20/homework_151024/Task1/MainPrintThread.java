package de.telran.module_5.lesson_20.homework_151024.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class MainPrintThread {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во потоков :");
        int countThread = scanner.nextInt();

        PrintThread[] threads = new PrintThread[countThread];

        for (int i = 0; i < countThread; i++) {
            threads[i] = new PrintThread(i);
            threads[i].start();

        }
        Arrays.stream(threads).forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Выход из main");
    }


}
