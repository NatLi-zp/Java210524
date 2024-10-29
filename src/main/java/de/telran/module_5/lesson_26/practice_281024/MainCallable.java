package de.telran.module_5.lesson_26.practice_281024;

import java.util.concurrent.*;

public class MainCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService oddService = Executors.newSingleThreadExecutor();
        ExecutorService evenService = Executors.newSingleThreadExecutor();

        OddCalc oddTask = new OddCalc();
        EvenCalc evenTask = new EvenCalc();

        Future<Integer> oddFuture = oddService.submit(oddTask);
        Future<Integer> evenFuture = evenService.submit(evenTask);
        int sum = oddFuture.get() + evenFuture.get();
        System.out.println(sum);
        oddService.shutdown();
        evenService.shutdown();

    }
}

class OddCalc implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + "  =  " + sum);
            }
        }
        return sum;
    }
}

class EvenCalc implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 50; i++) {
            Thread.sleep(200);
            if (i % 2 == 0) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + "  =  " + sum);
            }
        }
        return sum;
    }
}