package de.telran.practice_181124;

public class Kursor {
    public static void main(String[] args) {
        System.out.println(isAtStart("AABBCCDD"));
    }

    public static boolean isAtStart(String path) {
        if (path.length() % 2 != 0) return false;

        int countRow = 0;
        int countColumn = 0;
//        int countC = 0;
//        int countD = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'A') {
                countColumn++;
            }
            if (path.charAt(i) == 'B') {
                countRow++;
            }
            if (path.charAt(i) == 'C') {
                countColumn--;
            }
            if (path.charAt(i) == 'D') {
                countRow--;
            }
        }
        //  if (countA == countC && countB == countD) {
        return countRow == countColumn;
    }
}
