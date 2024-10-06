package de.telran.module_1.lesson_3.homework_030924;

public class MainMonth {

    public static void main(String[] args) {

        //MonthEnum monthEnum = MonthEnum.APRIL;
        MonthEnum monthEnum = MonthEnum.SEPTEMBER;
        getRecommendation(monthEnum);

//        for (MonthEnum monthEnum : MonthEnum.values()) {
//            getRecommendation(monthEnum);
//        }
    }

    public static void getRecommendation(MonthEnum monthEnum) {

        switch (monthEnum) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println(monthEnum + ": потребляйте пищу, богатую витаминами А, Е, С, для защиты организма от вирусов и инфекций");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(monthEnum + ": весенние предложения просты — редис, листовая зелень, спаржа");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(monthEnum + ": свежие овощи и фрукты должны стать основой рациона летнего питания");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(monthEnum + ": включение в рацион питания продуктов, содержащих витамины группы B, помогает улучшать настроение");
                break;
            default:
                System.out.println("Ешьте, пейте и курите что угодно и сколько угодно!");
        }
    }
}