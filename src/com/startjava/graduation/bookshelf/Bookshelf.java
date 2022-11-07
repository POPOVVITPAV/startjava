package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int  booksOnShelves;
    Book[] books = new Book[10];

    void addBook(Book book) {
        if (booksOnShelves < books.length) {
            books[booksOnShelves] = book;
            booksOnShelves++;
        }
    }

    int findBook(Book book) {
        for (int i = 0; i < booksOnShelves; i++) {
            if (books[i].equals(book)) {
                return i;
            }
        }
        return 0;
    }

    void deleteBook(Book book) {
        for (int i = 0; i < booksOnShelves; i++) {
            if (books[i].equals(book)) {
                books[i] = books[booksOnShelves - 1];
                books[booksOnShelves - 1] = null;
            }
        }
    }

    Book[] getAllBooks() {
        return Arrays.copyOf(books, booksOnShelves);
    }

    int getNumberBooks() {
        return booksOnShelves;
    }

    int  getFreeSpace() {
        return books.length - booksOnShelves;
    }

    void clearShelf() {
        Arrays.fill(books,0, booksOnShelves, null);
        booksOnShelves = 0;
    }
}
