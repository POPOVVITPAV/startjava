package com.startjava.graduation.bookshelf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

    private static final Bookshelf BOOK_SHELF = new Bookshelf();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Book b;

    public static void main(String[] args) throws IOException {
       // reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Выберите одну из команд:\n " +
                    "1. Добавить книгу \n 2. Найти книгу \n 3. Удалить книгу \n 4. Получить все книги \n " +
                    "5. Очистить полку \n 6. Завершить");
            int key = Integer.parseInt(reader.readLine());
            switch (key) {
                case 1:
                    System.out.println("You input " + key);
                   // BOOK_SHELF.addBook();
                    break;
                case 2:
                    System.out.printf("Книга находиться на %d полке"/*, BOOK_SHELF.findBook()*/);
                    break;
                case 3:
                    System.out.println("Dell book");
                    break;
                case 4:
                    System.out.println("get all books");
                    break;
                case 5:
                    BOOK_SHELF.clearShelf();
                    break;
                default:
                    System.out.println("Operation not found");
                    break;
            }
        }
    }
}
