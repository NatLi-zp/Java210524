package de.telran.module_5.lesson_22.homework_191024.Task2;

public class MainCourse {
    public static void main(String[] args) throws InterruptedException {

        CourseAtomic ca = new CourseAtomic();

        Thread thread1Atomic = new Thread(ca, "1");
        Thread thread2Atomic = new Thread(ca, "2");
        Thread thread3Atomic = new Thread(ca, "3");
        Thread thread4Atomic = new Thread(ca, "4");
        Thread thread5Atomic = new Thread(ca, "5");

        thread1Atomic.start();
        Thread.sleep(25);
        thread2Atomic.start();
        Thread.sleep(25);
        thread3Atomic.start();
        Thread.sleep(25);
        thread4Atomic.start();
        Thread.sleep(25);
        thread5Atomic.start();
        Thread.sleep(25);

        thread1Atomic.join();
        thread2Atomic.join();
        thread3Atomic.join();
        thread4Atomic.join();
        thread5Atomic.join();

        System.out.println("Общая сумма заработка = " + ca.getSum());
    }
}
