package de.telran.module_2.lesson_5;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
        // многомерные массивы
        int[][] arr2m = new int[2][3];
        System.out.println(Arrays.deepToString(arr2m));

        int[][] arr2m1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr2m1));

        int[][][] arr3m = {{{1, 2}, {3,4}}, {{11, 22},{33,44}}, {{111, 222},{333,444}}}; //[2][2][2]
        System.out.println(Arrays.deepToString(arr3m));
    }

}
