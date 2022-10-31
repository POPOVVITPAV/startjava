package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int  booksOnShelves;
    Book[] books = new Book[10];

    void addBook(Book b) {
        if (booksOnShelves < books.length) {
            books[booksOnShelves] = b;
            booksOnShelves++;
        }
    }

    void findBook(Book b) {
        for (int i = 0; i < booksOnShelves; i++) {
            if (books[i] == b) {
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
