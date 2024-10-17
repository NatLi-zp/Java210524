package de.telran.module_5.lesson_21.homework_171024;


public class MainSimpleNumbersThread {
    public static void main(String[] args) {
        SimpleNumbersThread thread1 = new SimpleNumbersThread(2, 1_000_000);
        SimpleNumbersThread thread2 = new SimpleNumbersThread(2, 1_000_000);
        SimpleNumbersThread thread3 = new SimpleNumbersThread(2, 1_000_000);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.interrupt();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.interrupt();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.interrupt();

    }
}
