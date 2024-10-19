package de.telran.module_5.lesson_22.homework_191024.Task1;

import java.util.concurrent.atomic.AtomicBoolean;

public class TargetAtomic extends Thread {
    public static AtomicBoolean isHit = new AtomicBoolean();

    public AtomicBoolean getIsHit() {
        return isHit;
    }

    public void setIsHit(AtomicBoolean isHit) {
        this.isHit = isHit;
    }

    @Override
    public void run() {
        while (!isHit.get()) {
            System.out.println("Поток " + Thread.currentThread().getName() + " = " + getIsHit());

            try {
                sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

