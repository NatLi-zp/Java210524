//2)*
//Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//Перебрать ArrayList и объединить все элементы в одну строку.
//Перебрать ArrayList и найти самую короткую строку.
//Перебрать ArrayList и найти первое вхождение определенной строки.
//Перебрать ArrayList и объединить все строки в одну с использованием разделителя.
//
//Перебрать LinkedList и найти самую длинную строку.
//Перебрать LinkedList и удалить все элементы, содержащие определенную подстроку.
//Перебрать LinkedList и заменить все гласные буквы в каждой строке на символ '*'.
//Перебрать LinkedList и найти самую длинную строку, не содержащую пробелов.

package de.telran.module_2.lesson_6.homework_100924;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {

        System.out.println(" //---------ArrayList---------------------");
        List<String> listA = new ArrayList<>();
        listA.addAll(0, List.of("Barsik", "Sharik", "Bobik", "Vaska", "Murka", "bob", "Bony")); //вставка списка
        System.out.println(listA);

        char key = 'B';
        int k = 0;
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).toUpperCase().charAt(0) == key) {
                k += 1;
            }
        }
        System.out.println("Кол-во элементов, начинающихся с буквы ArrayList " + key + " = " + k);

        String str = "";
        for (int i = 0; i < listA.size(); i++) {
            str = str + listA.get(i);
        }
        System.out.println("Объединить все элементы в одну строку ArrayList : " + str);


        String minStr = listA.get(0);
        int minIndex = listA.get(0).length();
        for (int i = 1; i < listA.size(); i++) {

            if (listA.get(i).length() < minIndex) {
                minStr = listA.get(i);
                minIndex = listA.get(i).length();
            }
        }
        System.out.println("Самая короткая строка : " + minStr);


        String str1 = "Bo";
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).contains(str1)) {
                System.out.println("Первое вхождение строки " + str1 + " ArrayList  = " + listA.get(i));
                break;
            }
        }

        String str2 = "";
        for (int i = 0; i < listA.size() - 1; i++) {
            str2 = str2 + listA.get(i) + ",";
        }
        str2 = str2 + listA.get(listA.size() - 1);
        System.out.println("Объединить все эл-ты в одну стр. с использ. разделителя ArrayList : " + str2);

        System.out.println();
        System.out.println(" //---------LinkedList---------------------");
        List<String> listL = new LinkedList<>();
        listL.addAll(0, List.of("Barsik", "Sharik 7777777", "Bobik", "Vaska", "SuperMurka", "bob", "Bony")); //вставка списка
        System.out.println(listL);

        String maxStr = listL.get(0);
        int maxIndex = listL.get(0).length();
        for (int i = 1; i < listL.size(); i++) {
            if (listL.get(i).length() > maxIndex) {
                maxStr = listL.get(i);
                maxIndex = listA.get(i).length();
            }
        }
        System.out.println("Самая длинная строка LinkedList: " + maxStr);


        String str3 = "Bo";
        for (int i = 0; i < listL.size(); i++) {
            if (listL.get(i).contains(str1)) {
                listL.remove(i);
            }
        }
        System.out.println("Удалить все элементы, содержащие подстроку " + str3 + " LinkedList  = " + listL);


        for (int i = 0; i < listL.size(); i++) {

            listL.set(i, listL.get(i).replace('a', '*'));
            listL.set(i, listL.get(i).replace('e', '*'));
            listL.set(i, listL.get(i).replace('u', '*'));
            listL.set(i, listL.get(i).replace('z', '*'));
            listL.set(i, listL.get(i).replace('o', '*'));
            listL.set(i, listL.get(i).replace('i', '*'));
        }
        System.out.println("Заменить все гласные буквы на символ '*' LinkedList  = " + listL);

        String maxStr1 = "";
        int maxIndex1 = 0;
        for (int i = 0; i < listL.size(); i++) {
            if (!listL.get(i).contains(" ") && listL.get(i).length() > maxIndex1) {
                maxStr1 = listL.get(i);
                maxIndex1 = listL.get(i).length();
            }
        }
        System.out.println("Самая длинная строка не содержащую пробелов LinkedList: " + maxStr1);
    }
}
