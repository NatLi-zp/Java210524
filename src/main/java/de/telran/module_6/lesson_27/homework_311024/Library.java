package de.telran.module_6.lesson_27.homework_311024;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<User> users;

    public Library() {
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
    }

    //методы addBook(Book book), removeBook(Book book), registerUser(User user), findBookByIsbn(String isbn)
    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Добавлена в библиотеку книга " + book.getAuthor() + " '" + book.getTitle() + "'");
    }

    public void removeBook(Book book) {
        this.books.remove(book);
        System.out.println("Удалена из библиотеки книга " + book.getAuthor() + " '" + book.getTitle() + "'");
    }

    public void registerUser(User user) {
        this.users.add(user);
        System.out.println("Зарегистрирован читатель " + user.getName());
    }

    public Book findBookByIsbn(String isbn) {
        for (int i = 0; i < this.books.size(); i++) {
            Book currentBook = this.books.get(i);
            if (currentBook.getIsbn() == isbn) {
                // System.out.println("Найдена книга " + currentBook.getTitle());
                return currentBook;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", users=" + users +
                '}';
    }

}

