package de.telran.lesson_2.homework_290824.numer2;

public class Letter extends PostalItem{


    public Letter(String name, String sender, String recipient) {
        super(name, sender, recipient);
    }

    @Override
    public void deliverToRecipient() {
        System.out.println(name +" (масса до 20 гр) доставляется " + " по адресу: " + recipient);
    }

    @Override
    public void send() {
        System.out.println(name + " (масса до 20 гр) отправлено из " + sender);
    }
}
