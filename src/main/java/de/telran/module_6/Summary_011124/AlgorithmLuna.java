package de.telran.module_6.Summary_011124;

public class AlgorithmLuna {
    public static void main(String[] args) {
        String str = "4561261212345467"; //"1234567812345678";
        System.out.println(new AlgorithmLuna().isValid(str));
    }

    public boolean isValid(String cardNumber) {
        int l = cardNumber.length();
        int[] arr = new int[l];
        int sum = 0;

        for (int i = 0; i < l; i++) {
            String s = cardNumber.substring(i, i + 1);
            arr[i] = Integer.parseInt(s);
            if (i % 2 == 0) {
                if (arr[i] * 2 > 9) {
                    arr[i] = arr[i] * 2 - 9;
                } else {
                    arr[i] *= 2;
                }
            }
            sum += arr[i];
        }

//        for (int i = 0; i < l; i += 2) {
//            arr[i] *= 2;
//        }
//
//        for (int i = 0; i < l - 1; i += 2) {
//            if (arr[i] > 9) {
//                arr[i] -= 9;
//            }
//        }
        //     System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < l; i++) {
//            sum += arr[i];
//        }
        System.out.println(sum);
        return sum % 10 == 0;
    }
}
