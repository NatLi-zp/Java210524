package de.telran.module_5.lesson_25.homework_271024;

import java.util.concurrent.Callable;

public class SimpleCallable implements Callable {
    private int start;
    private int end;

    public SimpleCallable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        //  Thread.sleep(2000);
        int count = 0;

        for (int i = start; i <= end; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {

                count++;
                   System.out.println(Thread.currentThread().getName() + " count = " + count);

            }
        }
        return count;
    }
};

