package de.telran.module_6.lesson_27.homework_311024;

public class LibraryManager {
    Library library;

    public LibraryManager(Library library) {
        this.library = library;
    }

    public void borrowBook(String isbn, User user) {
        Book book = this.library.findBookByIsbn(isbn);
        if (book == null) {
            System.out.println("!!!Книга с isbn = " + isbn + " не найдена в библиотеке");
        } else {
            user.borrowBook(book);
            System.out.println("Читатель " + user.getName() + " взял книгу " + book.getAuthor() + " '" + book.getTitle() + "'");
        }
    }

    public void returnBook(String isbn, User user) {
        Book book = this.library.findBookByIsbn(isbn);
        user.returnBook(book);
        System.out.println("Читатель " + user.getName() + " вернул книгу " + book.getAuthor() + " '" + book.getTitle() + "'");
    }

    public void addBook(Book book) {
        this.library.addBook(book);
    }

    public void removeBook(Book book) {
        this.library.removeBook(book);
    }

    public void registerUser(User user) {
        this.library.registerUser(user);
    }

}
