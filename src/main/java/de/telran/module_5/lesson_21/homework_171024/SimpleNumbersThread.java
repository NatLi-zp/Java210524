package de.telran.module_5.lesson_21.homework_171024;

public class SimpleNumbersThread extends Thread {
    private int start;
    private int end;
    public int count;

    public SimpleNumbersThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int count = 0;

        for (int i = start; i < end; i++) {

            if (!isInterrupted()) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    count++;
                    System.out.println(getName() + " count = " + count);
                }
            } else {
                System.out.println("--------------------------" + getName() + " завершен ");
                return;
            }


        }
    }
}
