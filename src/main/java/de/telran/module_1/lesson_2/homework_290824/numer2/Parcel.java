package de.telran.module_1.lesson_2.homework_290824.numer2;

public class Parcel extends PostalItem {


    public Parcel(String name, String sender, String recipient) {
        super(name, sender, recipient);
    }

    @Override
    public void deliverToRecipient() {
        System.out.println(name +" (масса до 2 кг) доставляется " + " по адресу: " + recipient);
    }

    @Override
    public void send() {
        System.out.println(name + " (масса до 2 кг) отправлена из " + sender);
    }
}
