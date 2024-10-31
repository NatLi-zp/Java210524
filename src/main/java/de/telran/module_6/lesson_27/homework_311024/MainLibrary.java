package de.telran.module_6.lesson_27.homework_311024;

// 1 уровень сложности: Задача: Создание системы управления библиотекой с использованием принципов SOLID
//Описание задачи:
//Вы работаете в компании, занимающейся разработкой программного обеспечения для управления библиотеками.
//Ваша задача - создать систему классов, которая будет соответствовать принципам SOLID
//и позволит эффективно управлять библиотекой. Основные функции системы включают добавление новых книг,
//учет взятых и возвращенных книг.
//Описание классов:
//Book:
//Поля: title, author, isbn, availableCopies
//User:
//Поля: name, userId, borrowedBooks
//Методы:  borrowBook(Book book), returnBook(Book book) - методы для добавления и удаления книг из borrowedBooks
//Library:
//Поля: books, users
//Методы: addBook(Book book), removeBook(Book book), registerUser(User user), findBookByIsbn(String isbn)
//LibraryManager:
//Поля: library
//Методы: borrowBook(String isbn, User user), returnBook(String isbn, User user),
//addBook(Book book), removeBook(Book book), registerUser(User user)

public class MainLibrary {
    public static void main(String[] args) {

        Book book1 = new Book("Анна Каренина", "Лев Толстой", "0001", 1);
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", "0002", 2);
        Book book3 = new Book("Евгений Онегин", "Александр Пушкин", "0003", 3);
        Book book4 = new Book("Идиот", "Федор Достоевский", "0004", 1);
        Book book5 = new Book("Двенадцать стульев", "Ильф и Петров", "0005", 2);

        User user1 = new User("Петров Петр", 1);
        User user2 = new User("Васечкин Вася", 2);
        User user3 = new User("Стрельцова Маша", 3);

        Library library = new Library();

        LibraryManager libraryManager = new LibraryManager(library);

        //добавляем книги в библиотеку
        libraryManager.addBook(book1);
        libraryManager.addBook(book2);
        libraryManager.addBook(book3);
        libraryManager.addBook(book4);
        libraryManager.addBook(book5);
        System.out.println();

        //добавляем читателей в библиотеку
        libraryManager.registerUser(user1);
        libraryManager.registerUser(user2);
        libraryManager.registerUser(user3);
        System.out.println(library);

        //выдаем книги читателям
        System.out.println();
        libraryManager.borrowBook("0002", user1);
        libraryManager.borrowBook("0003", user1);
        libraryManager.borrowBook("0007", user2);

        System.out.println(user1);
        System.out.println(user2);

        //возврат книг читателями
        System.out.println();
        libraryManager.returnBook("0002", user1);
        System.out.println(library);

        //убираем книги из библиотеки
        System.out.println();
        libraryManager.removeBook(book1);

        System.out.println(library);
    }
}
