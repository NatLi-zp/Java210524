package de.telran.lesson_1.Homework_190824.module1.lecture1.module1.lecture1;

import de.telran.lesson_1.Phone;

public class SimplePhoneHomework {
    public static void main(String[] args) {
        PhoneHomework phone1 = new PhoneHomework("05012345676", "Nokia 3110", 100);
        PhoneHomework phone2 = new PhoneHomework("09534523569", "Sony 1515", 125);
        PhoneHomework phone3 = new PhoneHomework("06756734521", "Samsung A5", 150);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("Мама");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Папа");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Бабушка");
        System.out.println(phone3.getNumber());

    }
}
