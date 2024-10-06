package de.telran.module_4.lesson_16.homework_061024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainREgExTask1_2 {
    public static void main(String[] args) {

        //1 уровень сложности: 1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
        // \w - буквенно-цифровой символ или знак подчёркивания
        // +	один или более раз
        //*	ноль или более раз
        // Допустимые символы: «-», «.», «0...9», «@», «A... Z», «_» и «a... z».

        String regEx1 = "^[\\w-]+\\.*[\\w]+@[\\w.-]+\\.[\\w]{2,4}$";
        String str = "my_25@domen-38.de";
        Pattern pattern = Pattern.compile(regEx1);
        Matcher matcher = pattern.matcher(str);
        System.out.println(" email = " + matcher.matches());

        //-----------------------------------------------------
//        2.* Написать регулярное выражение для проверки корректности нового пароля,
//          который соответствует определенным критериям:
//        состоять минимум из 8 символов;
//        должен обязательно включать хотя бы одну маленькую букву;
//        должен обязательно включать хотя бы одну большую букву;
//        должен обязательно включать хотя бы одну цифру;
//        должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);

        regEx1 = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&_+-=]).{8,})";
        str = "mY_25@doMen";
        pattern = Pattern.compile(regEx1);
        matcher = pattern.matcher(str);
        System.out.println(" password = " + matcher.matches());

    }
}
