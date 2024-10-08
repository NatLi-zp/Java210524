package de.telran.module_4.lesson_17.homework_081024;

import java.io.*;
import java.util.Scanner;

public class MainFileTask1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к существующему файлу:");
        String nameFile1 = scanner.nextLine(); //"./file1.txt";//

        System.out.println("Введите имя нового файла:"); //./file1.txt
        String nameFile2 = scanner.nextLine(); //"./file2.txt";

        File file1 = new File(nameFile1);
        if (file1.exists()) {

            FileInputStream fileInput = new FileInputStream(file1);
            FileOutputStream fileOutput = new FileOutputStream(nameFile2);

            while (fileInput.available() > 0) { //для проверки достижения конца файла
                int data = fileInput.read();
                fileOutput.write(data);
            }

            fileInput.close();
            fileOutput.close();

            System.out.println("Успешно записан файл " + nameFile2);
        } else System.out.println("Операция копирования не выполнена. Нет файла-источника " + nameFile1);
    }
}

