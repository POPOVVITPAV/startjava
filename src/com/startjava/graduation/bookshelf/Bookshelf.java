package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Locale;

public class Bookshelf {

    private int  booksOnShelves;
    Book[] books = new Book[10];

    void addBook(Book book) {
        if (booksOnShelves < books.length) {
            books[booksOnShelves] = book;
            booksOnShelves++;
        }
    }

    int findBook(String search) {
        for (int i = 0; i < booksOnShelves; i++) {
            if (books[i] != null && books[i].getTitle() != null &&
                    books[i].getTitle().toLowerCase().equals(search.toLowerCase())) {
                return  i+1;
            }
        }
        return 0;
    }

    void deleteBook(String dellBook) {
        for (int i = 0; i < booksOnShelves; i++) {
            if (books[i] != null && books[i].getTitle() != null &&
                    books[i].getTitle().toLowerCase().equals(dellBook.toLowerCase())) {
                books[i] = books[booksOnShelves - 1];
                books[booksOnShelves - 1] = null;
                booksOnShelves--;
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
