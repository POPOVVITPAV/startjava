package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первый игрок введи имя:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Второй игрок введи имя: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("У каждого игрока по 10 попыток");
            game.launch();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
        scanner.close();   
     } 
 }