package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 300);
        Book book2 = new Book("Инквизитор. Ордо Ксенос", 456);
        Book book3 = new Book("Возвышение Хоруса", 340);
        Book book4 = new Book("Лживые боги", 505);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getNameBook() + " count of page: " + book.getCountPage());
        }
        Book[] shelf = new Book[1];
        shelf[0] = book1;
        books[0] = book4;
        books[3] = shelf[0];
        System.out.println("Переставили местами книги с индексом 0 и 3");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getNameBook() + " count of page: " + book.getCountPage());
        }
        System.out.println("Выводим только Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getNameBook().equals("Clean code")) {
                System.out.println(book.getNameBook() + " count of page: " + book.getCountPage());
            }
        }
    }
}
