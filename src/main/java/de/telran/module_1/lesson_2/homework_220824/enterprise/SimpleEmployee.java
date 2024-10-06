package de.telran.module_1.lesson_2.homework_220824.enterprise;

public class SimpleEmployee {
    public static void main(String[] args) {

        Administration administration1 = new Administration("Иван", "Иванов", 50, "директор");
        Accounting accounting1 = new Accounting("Мария", "Петрова", 40, "бухгалтер");
        Workshop workshop1 = new Workshop("Петр", "Сидоров", 60, "токарь");

        administration1.whereWork();
        administration1.withWork();
        administration1.isSpecialClothing();
        administration1.wantMoney();
        administration1.isPensioner();
        System.out.println();

        accounting1.whereWork();
        accounting1.withWork();
        accounting1.isSpecialClothing();
        accounting1.wantMoney();
        accounting1.isPensioner();
        System.out.println();

        workshop1.whereWork();
        workshop1.withWork();
        workshop1.isSpecialClothing();
        workshop1.wantMoney();
        workshop1.isPensioner();
    }
}
