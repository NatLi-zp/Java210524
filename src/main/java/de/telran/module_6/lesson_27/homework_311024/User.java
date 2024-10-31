package de.telran.module_6.lesson_27.homework_311024;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int userId;
    List<Book> borrowedBooks;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    // Методы:  borrowBook(Book book), returnBook(Book book) - методы для добавления и удаления книг из borrowedBooks
    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        // System.out.println("Взята книга "+book.getAuthor()+ " '"+book.getTitle()+ "'");
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        //  System.out.println("Возвращена книга "+book.getAuthor()+ " '"+book.getTitle()+ "'");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}

