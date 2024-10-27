//1 уровень сложности: 1. Напишите программу просчета количества всех простых в диапазоне до 1 000 000.
//Просчет выполняйте в 4 потоках, которые создаются с помощью Callable.
//Получите результаты подсчета из каждого потока и напечатайте общий результат.

package de.telran.module_5.lesson_25.homework_271024;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainSimpleCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> future1 = new FutureTask<>(new SimpleCallable(2, 250_000));
        FutureTask<Integer> future2 = new FutureTask<>(new SimpleCallable(250_001, 500_000));
        FutureTask<Integer> future3 = new FutureTask<>(new SimpleCallable(500_001, 750_000));
        FutureTask<Integer> future4 = new FutureTask<>(new SimpleCallable(750_001, 1_000_000));

//        FutureTask<Integer> future1 = new FutureTask<>(new SimpleCallable(2, 25));
//        FutureTask<Integer> future2 = new FutureTask<>(new SimpleCallable(26, 50));
//        FutureTask<Integer> future3 = new FutureTask<>(new SimpleCallable(51, 75));
//        FutureTask<Integer> future4 = new FutureTask<>(new SimpleCallable(76, 100));

        Thread th1 = new Thread(future1);
        Thread th2 = new Thread(future2);
        Thread th3 = new Thread(future3);
        Thread th4 = new Thread(future4);

        th1.start();
        System.out.println(th1.getName() + " стартовал");
        th2.start();
        System.out.println(th2.getName() + " стартовал");
        th3.start();
        System.out.println(th3.getName() + " стартовал");
        th4.start();
        System.out.println(th4.getName() + " стартовал");

        System.out.println(th1.getName() + " количество = " + future1.get());
        System.out.println(th2.getName() + " количество = " + future2.get());
        System.out.println(th3.getName() + " количество = " + future3.get());
        System.out.println(th4.getName() + " количество = " + future4.get());
        System.out.println("Количество всех простых чисел = " + (future1.get() + future2.get() + future3.get() + future4.get()));

    }
}

