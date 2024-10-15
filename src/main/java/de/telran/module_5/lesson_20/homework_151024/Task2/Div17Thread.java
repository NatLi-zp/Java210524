package de.telran.module_5.lesson_20.homework_151024.Task2;

public class Div17Thread extends Thread {
    private int start;
    private int end;
    public long sum;

    public Div17Thread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        long sum = 0;
        System.out.println( "Запущен поток : " + getName());
        for (int i = start; i <= end; i++) {

            if (i % 17 == 0) {
                sum += i;

                System.out.println(getName() + ". sum = " + sum);
                //System.out.println(getName() + ". i = " + i);
            }
        }
        System.out.println(getName() + ". totalSum = " + sum);
    }
}
