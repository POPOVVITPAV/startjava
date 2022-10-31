package com.startjava.graduation.bookshelf;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Booksheда {

    private int  booksOnShelves;
    Book[] books = new Book[10];

    void addBook(Book b) {
        if (booksOnShelves < books.length) {
            books[booksOnShelves] = b;
            booksOnShelves++;
        }
    }

    void findBook() {
        for (int i = 0; i < booksOnShelves; i++) {
            if () {

            }
        }
    }

    void deleteBook() {

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
