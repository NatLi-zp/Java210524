package de.telran.module_3.lesson_14;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class MainOptional {
    public static void main(String[] args) {
        String str = getString();
        if (str != null) // првоерочное условие, иначе Exception
            System.out.println("No Optional" + str.length());
        else
            System.out.println("Ошибка возврата строки");

        //Работиаем с Optional
        Optional<String> optString = getStringOptional();

        if (optString.isPresent()) { //
            String strTmp = optString.get();
            System.out.println(strTmp.length());
        } else
            System.out.println("Ошибка возврата строки");

        //компактная реализация пробл. работы с null
        System.out.println("orElse = " + optString.orElse("").length());
        System.out.println("orElse2 = " + getStringOptional().orElse("").length());

        long count = Stream.of(1,5,3).count();
        double avr = Stream.of(1,5,3).mapToInt(e -> e).average().orElse(0);
        System.out.println("avr = " + avr);

        str = "Mama";
        Optional<String> optStr = Optional.ofNullable(str);
    }

    private static String getString() {
        Random random = new Random();
        int tempInt = random.nextInt();
        System.out.println("tempInt = " + tempInt);
        if (tempInt > 0)
            return Integer.toString(tempInt);
        else return null;
    }

    private static Optional<String> getStringOptional() {
        Random random = new Random();
        int tempInt = random.nextInt();
        System.out.println("tempInt = " + tempInt);
        if (tempInt > 0)
            return Optional.of(Integer.toString(tempInt));
        else return Optional.ofNullable(null);
    }
}
