package de.telran.module_5.lesson_24.practice_231024;

import java.util.ArrayList;

public class MainThreads {
    static int sum;

    public static void main(String[] args) {

        //      1.вариант
//        Thread tr1 = new Thread(() -> {
//            //   int sum;
//            ArrayList<Integer> arrayList1 = new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//                arrayList1.add(i);
//            }
//            for (int i = 0; i < arrayList1.size(); i++) {
//                if (i % 2 == 0) sum += i;
//
//            }
//        }
//        );

        //      2.вариант
//        new Thread(() -> {
//            //   int sum;
//            ArrayList<Integer> arrayList1 = new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//                arrayList1.add(i);
//            }
//            for (int i = 0; i < arrayList1.size(); i++) {
//                if (i % 2 == 0) sum += i;
//
//            }
//        }
//        ).start();

        //      3.вариант
        // new Thread(new MainExtendsThreads()).start();

        new Example1();

    }
}
