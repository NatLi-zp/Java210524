package de.telran.module_6.lesson_27.homework_311024;

public class Book {
    String title;
    String  author;
    String isbn;
    int availableCopies;  //кол-во копий

    public Book(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
