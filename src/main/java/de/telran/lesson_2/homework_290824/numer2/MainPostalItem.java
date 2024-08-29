package de.telran.lesson_2.homework_290824.numer2;

public class MainPostalItem {
    public static void main(String[] args) {

        PostalItem postalItem1 = new Letter("Письмо", "г.Берлин", "г.Гамбург");
        postalItem1.deliverToRecipient();
        postalItem1.send();

        System.out.println();
        PostalItem postalItem2 = new Parcel("Бандероль", "г.Вена", "г.Париж");
        postalItem2.deliverToRecipient();
        postalItem2.send();

        System.out.println();
        Package postalItem3 = new Package("Посылка", "г.Будапешт", "г.Рим");
        postalItem3.deliverToRecipient();
        postalItem3.send();

        System.out.println();
        Container postalItem4 = new Container("Контейнер", "г.Барселона", "г.Прага");
        postalItem4.deliverToRecipient();
        postalItem4.send();
    }
}
