package de.telran.practice_111124;

public class Matrix {
    public boolean hasNum(int[][] arr, int k) {
        int row = arr.length - 1;

        int column = 0;
        boolean fl = false;
        // while (arr[row][column] != k && (column < arr.length || row >= 0)) {
        while (column < arr.length && row >= 0) {
            System.out.println(arr[row][column]);
            if (arr[row][column] < k) {
                column++;
            } else if (arr[row][column] > k) {
                row--;
            } else {
                fl = true;
                break;
            }
        }
        return fl;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 7, 11, 21},
                {3, 6, 9, 22, 25},
                {5, 15, 18, 28, 33},
                {17, 20, 38, 45, 56},
                {24, 31, 42, 59, 81}};

        int k = 39;
        System.out.println(new Matrix().hasNum(array, k));
    }

}
