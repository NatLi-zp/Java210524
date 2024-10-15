package de.telran.module_5.lesson_20.homework_151024.Task1;

public class PrintThread extends Thread {
    public int num;

    public PrintThread(int num) {
        this.num = num;

    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(100);
            //    System.out.println(getName());
                System.out.println("поток № " + this.num);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
