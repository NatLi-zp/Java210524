package de.telran.module_4.lesson_18.homework_101024;

import java.io.*;

//малость извращенненько получилось )))
public class MainClientTask1 {
    public static void main(String[] args) {

        Client client1 = new Client();
        client1.setId(1L);
        client1.setStatus("aktiv");
        client1.setTaxCode(1L);
        client1.setFirstName("Петя");
        client1.setLastName("Петров");
        client1.setEmail("123pp@gmail.com");
        client1.setAddress("Berlin");
        client1.setPhone("+49123123123");

        Client client2 = new Client();
        client2.setId(2L);
        client2.setStatus("no aktiv");
        client2.setTaxCode(2L);
        client2.setFirstName("Вася");
        client2.setLastName("Васечкин");
        client2.setEmail("345vv@gmail.com");
        client2.setAddress("Hamburg");
        client2.setPhone("+49456567457");

        //пишем в файл
        try {
            FileWriter writer = new FileWriter("clientFile.txt");
            writer.write(String.valueOf(client1.getId()));
            writer.write("\n");
            writer.write(client1.getStatus());
            writer.write("\n");
            writer.write(String.valueOf(client1.getTaxCode()));
            writer.write("\n");
            writer.write(client1.getFirstName());
            writer.write("\n");
            writer.write(client1.getLastName());
            writer.write("\n");
            writer.write(client1.getEmail());
            writer.write("\n");
            writer.write(client1.getAddress());
            writer.write("\n");
            writer.write(client1.getPhone());
            writer.write("\n");

            writer.write(String.valueOf(client2.getId()));
            writer.write("\n");
            writer.write(client2.getStatus());
            writer.write("\n");
            writer.write(String.valueOf(client2.getTaxCode()));
            writer.write("\n");
            writer.write(client2.getFirstName());
            writer.write("\n");
            writer.write(client2.getLastName());
            writer.write("\n");
            writer.write(client2.getEmail());
            writer.write("\n");
            writer.write(client2.getAddress());
            writer.write("\n");
            writer.write(client2.getPhone());

            writer.close();

        } catch (IOException e) {
            System.out.println("Возникла ошибка при записи!");
        }

        //читаем из файла
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("clientFile.txt"));
            client1.setId(Long.parseLong(reader.readLine()));
            client1.setStatus(reader.readLine());
            client1.setTaxCode(Long.parseLong(reader.readLine()));
            client1.setFirstName(reader.readLine());
            client1.setLastName(reader.readLine());
            client1.setEmail(reader.readLine());
            client1.setAddress(reader.readLine());
            client1.setPhone(reader.readLine());

            client2.setId(Long.parseLong(reader.readLine()));
            client2.setStatus(reader.readLine());
            client2.setTaxCode(Long.parseLong(reader.readLine()));
            client2.setFirstName(reader.readLine());
            client2.setLastName(reader.readLine());
            client2.setEmail(reader.readLine());
            client2.setAddress(reader.readLine());
            client2.setPhone(reader.readLine());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(client1);
        System.out.println(client2);
    }
}


