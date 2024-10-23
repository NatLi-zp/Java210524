package de.telran.module_5.lesson_23.homework_221024.Task2;

public class Loader implements Runnable {
    private int count;
    private Ramp ramp;

    public Loader(int count, Ramp ramp) {
        this.count = count;
        this.ramp = ramp;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.count; i++) {
            ramp.get();
        }
    }

}
