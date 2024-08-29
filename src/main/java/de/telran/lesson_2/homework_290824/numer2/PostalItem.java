package de.telran.lesson_2.homework_290824.numer2;

public abstract class PostalItem {
    String name;
    String sender;
    String recipient;

    public PostalItem(String name, String sender, String recipient) {
        this.name = name;
        this.sender = sender;
        this.recipient = recipient;
    }

    public abstract void deliverToRecipient(); //доставить адресату

    public abstract void send(); //отправить
}
