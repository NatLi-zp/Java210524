package de.telran.module_4.lesson_18.homework_101024;

import java.io.*;

public class MainClientSerializableTask1 {
    public static void main(String[] args) {

        //------------------через Serializable
        ClientSerializable client1s = new ClientSerializable();
        client1s.setId(1L);
        client1s.setStatus("aktiv");
        client1s.setTaxCode(1L);
        client1s.setFirstName("Петя");
        client1s.setLastName("Петров");
        client1s.setEmail("123pp@gmail.com");
        client1s.setAddress("Berlin");
        client1s.setPhone("+49123123123");

        ClientSerializable client2s = new ClientSerializable();
        client2s.setId(2L);
        client2s.setStatus("no aktiv");
        client2s.setTaxCode(2L);
        client2s.setFirstName("Вася");
        client2s.setLastName("Васечкин");
        client2s.setEmail("345vv@gmail.com");
        client2s.setAddress("Hamburg");
        client2s.setPhone("+49456567457");

        // запись в файл
        try {
            FileOutputStream fileOut = new FileOutputStream("clientFile_s.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(client1s);
            objOut.writeObject(client2s);

            objOut.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // чтение из файла
        try {
            FileInputStream fileInp = new FileInputStream("clientFile_s.txt");
            ObjectInputStream objInp = new ObjectInputStream(fileInp);
            client1s = (ClientSerializable) objInp.readObject();
            client2s = (ClientSerializable) objInp.readObject();
            System.out.println(client1s);
            System.out.println(client2s);

            objInp.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


