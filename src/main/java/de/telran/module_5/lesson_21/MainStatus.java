package de.telran.module_5.lesson_21;

public class MainStatus {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("2. " + getState()); //RUNNABLE
                int count = 0;
                for (int i = 0; i < 10_000; i++) {
                    if (i % 17 == 0) {
                        count++;
                        System.out.println("---3. " + getState()); //RUNNABLE
                    }
                }
            }
        };

        System.out.println("1. " + thread.getState()); //NEW
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("4. " + thread.getState()); //TERMINATED
    }
}
