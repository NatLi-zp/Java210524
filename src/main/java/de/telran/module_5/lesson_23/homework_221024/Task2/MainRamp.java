//2*. На склад приезжает машина, в которой загружено N ящиков (пользователь вводит с клавиатуры).
//Автоматизированный разгрузчик вытягивает с машины ящик и ложит на рампу с определенным интервалом времени,
//на которой может одновременно разместиться например 2 ящика.
//В это время подъезжает автоматизированный погрузчик и везет его на место хранения. Он за раз может взять всего
//1 ящик. Каждый участник процесса представлен в виде отдельного потока Java.
//        Создайте программу, которая синхронизирует работу в данном процессе разгрузки автомобиля, с условием того,
//что Разгрузчик может быть только один, а Погрузчиков может быть 2 и более (на ваше усмотрение).

package de.telran.module_5.lesson_23.homework_221024.Task2;

import java.util.Scanner;


// " Мы строили-строили" , и до конца не получилось((
public class MainRamp {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Введите кол-во ящиков: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Ramp ramp = new Ramp();

        Unloader unloader = new Unloader(count, ramp);
        Loader loader1 = new Loader(count, ramp);
        Loader loader2 = new Loader(count, ramp);
        Loader loader3 = new Loader(count, ramp);

        new Thread(unloader).start();
        new Thread(loader1).start();
        new Thread(loader2).start();
        new Thread(loader3).start();

        new Thread(unloader).join();
        new Thread(loader1).join();
        new Thread(loader2).join();
        new Thread(loader3).join();

        Thread.sleep(1000);
        System.out.println("Все ящики разгружены!");
    }

}
