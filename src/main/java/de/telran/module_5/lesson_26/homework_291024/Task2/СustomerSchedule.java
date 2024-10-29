package de.telran.module_5.lesson_26.homework_291024.Task2;

public class СustomerSchedule implements Runnable {
    int customerNumber;

    public СustomerSchedule(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public void run() {
        try {
            System.out.println("Покупатель " + customerNumber + " вошел в магазин ");
            Thread.sleep(30);
            System.out.println("Покупатель " + customerNumber + " вышел из магазина ");

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}

//    @Override
//    public Long call() throws Exception {
//        try {
//            System.out.println("Покупатель " + customerNumber + " вошел в магазин ");
//            Thread.sleep(300);
//            System.out.println("Покупатель " + customerNumber + " вышел из магазина ");
//
//        } catch (InterruptedException e) {
//            System.err.println(e.getMessage());
//        }
//
//        return System.currentTimeMillis();

//    }
//}
