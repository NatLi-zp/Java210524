package de.telran.module_5.lesson_24.practice_231024;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MainExtendsThreads implements Runnable {

    @Override
    public void run() {

        int sum = 0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList1.add(i);
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            if (i % 2 == 0) sum += i;

        }
    }
}

class Example1 extends Thread{
    public Example1(){
        this.start();
        new  Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Override
    public void run() {

        int sum = 0;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList1.add(i);
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            if (i % 2 == 0) sum += i;

        }
    }
}

class ExampleCall implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}
