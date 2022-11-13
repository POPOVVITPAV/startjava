package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, %d", this.author, this.title, this.yearOfPublication);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
