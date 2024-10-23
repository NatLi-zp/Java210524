//1 уровень сложности: 1. У вас есть стол, на который один робоманипулятор ложит деталь, а второй забирает эту деталь.
//Когда Робот1 положит деталь на стол, он должет обязательно ждать, пока Робот2 заберет эту деталь
//и только тогда ложить следующую. Постройте программу, которая автоматизирует эту работу.
//        Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.
//        (wait - notify)

package de.telran.module_5.lesson_23.homework_221024.Task1;

import java.util.Scanner;

public class MainTable {
    public static void main(String[] args) {

        System.out.println("Введите кол-во обрабатываемых деталей: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Table table = new Table();
        Robot1 robot1 = new Robot1(count, table);
        Robot2 robot2 = new Robot2(count, table);

        new Thread(robot1).start();
        new Thread(robot2).start();

    }
}
