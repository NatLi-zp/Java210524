package de.telran.practice_081124;

import java.util.stream.Stream;

public class Fibonacci {

    public static long getFibonacci(int i) {
        int result = 0; // промежуточ. переменная
        int v1 = 0;
        int v2 = 1;

        for (int j = 1; j < i; j++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        return v2;
    }


    public static long getFibonacciRec(int i) {
        if (i == 0) {
            return 0;
        }
        return i == 1 || i == 2 ? 1 : getFibonacciRec(i - 1) + getFibonacciRec(i - 2);
    }

    public static long fibStream(int index) {
        var resalt = Stream.iterate(new long[]{0, 1}, arr ->
                        new long[]{arr[1], arr[0] + arr[1]})
                .limit(index + 1)
                .map(y -> y[0])
                .max(Long::compareTo);
        return resalt.orElseThrow(IllegalAccessError::new);
    }

    public static void main(String[] args) {
        long ftime = System.currentTimeMillis();
        System.out.println(getFibonacci(40));

        long ftime2 = System.currentTimeMillis() - ftime;
        System.out.println(ftime2);

        long ftimeR = System.currentTimeMillis();
        System.out.println(getFibonacciRec(40));
        long ftimeR2 = System.currentTimeMillis() - ftimeR;
        System.out.println(ftimeR2);

        long ftimeS = System.currentTimeMillis();
        System.out.println(fibStream(40));
        long ftimeS2 = System.currentTimeMillis() - ftimeS;
        System.out.println(ftimeS2);
    }
}

