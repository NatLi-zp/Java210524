package de.telran.lesson_2.homework_290824.numer2;

public class Container extends PostalItem {


    public Container(String name, String sender, String recipient) {
        super(name, sender, recipient);
    }

    @Override
    public void deliverToRecipient() {
        System.out.println(name +" (масса до 5 т) доставляется " + " по адресу: " + recipient);
    }

    @Override
    public void send() {
        System.out.println(name + " (масса до 5 т) отправлена из " + sender);
    }
}
