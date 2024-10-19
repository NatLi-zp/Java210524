package de.telran.module_5.lesson_22.homework_191024.Task1;


import java.util.Random;

public class MainTarget {
    public static void main(String[] args) {

        TargetAtomic ta = new TargetAtomic();
        Thread thread1Atomic = new Thread(ta, "1");
        Thread thread2Atomic = new Thread(ta, "2");
        Thread thread3Atomic = new Thread(ta, "3");
        Thread thread4Atomic = new Thread(ta, "4");
        Thread thread5Atomic = new Thread(ta, "5");

        thread1Atomic.start();
        thread2Atomic.start();
        thread3Atomic.start();
        thread4Atomic.start();
        thread5Atomic.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Random random = new Random();
        int numThread = random.nextInt(5) + 1;
        System.out.println("Победил поток " + numThread);
        TargetAtomic.isHit.set(true);


    }
}
