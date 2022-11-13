package com.startjava.graduation.bookshelf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookshelfTest {

    private static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Book b;
        while (true) {
            System.out.println("""
                               Выберите одну из команд:\n " +
                               "1. Добавить книгу \n 2. Найти книгу \n 3. Удалить книгу \n 4. Получить все книги \n " +
                               "5. Очистить шкаф \n 6. Завершить
                    """);
            int key = Integer.parseInt(reader.readLine());
            switch (key) {
                case 1:
                    System.out.println("Введите автора книги");
                    String author = reader.readLine();
                    System.out.println("Введите название книги");
                    String title = reader.readLine();
                    System.out.println("Введите год издания книги");
                    int yearOfPublication = Integer.parseInt(reader.readLine());
                    BOOK_SHELF.addBook(new Book(author, title,yearOfPublication));
                    printAll();
                    break;
                case 2:
                    System.out.println("Введите название книги");
                    String search = reader.readLine();
                    System.out.printf("Книга находиться на %d полке\n", BOOK_SHELF.findBook(search));
                    printAll();
                    break;
                case 3:
                    System.out.println("Введите название книги");
                    String dellBook = reader.readLine();
                    BOOK_SHELF.deleteBook(dellBook);
                    printAll();
                    break;
                case 4:
                    printAll();
                    break;
                case 5:
                    BOOK_SHELF.clearShelf();
                    printAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        }
    }

    static void printAll() {
        System.out.printf("Шкаф содержит %d книги. Свободно - %d полок.\n",
                BOOK_SHELF.getNumberBooks(), BOOK_SHELF.getFreeSpace());
        for ( Book b : BOOK_SHELF.getAllBooks()) {
            System.out.println("|" + b +                  "|");
            System.out.println("|--------------------------|");
        }
    }
}
