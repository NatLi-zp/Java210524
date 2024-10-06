package de.telran.module_1.lesson_1.in;

import de.telran.module_1.lesson_1.Phone;

public class SimpleInPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("InWork L");
        phone1.call();
        //phone1.model =""; // запрешен доступ
        phone1.setModel("1"); // через setter мы можем присвоить значение
    }
}
