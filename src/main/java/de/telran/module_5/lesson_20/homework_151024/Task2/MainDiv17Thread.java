package de.telran.module_5.lesson_20.homework_151024.Task2;

public class MainDiv17Thread {
    public static void main(String[] args) {

        System.out.println("Главный поток стартовал! " + Thread.currentThread().getName());
        Div17Thread th = null;

        for (int i = 1; i <= 3; i++) {
            th = new Div17Thread(0, 10_000_000);
            th.setDaemon(true);
            th.start();
        }

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Главный поток завершен! " + Thread.currentThread().getName());
    }
}
