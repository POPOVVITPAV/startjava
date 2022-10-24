package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
   
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scanner = new Scanner(System.in);
    }

    public void launch() {
        int targetNumber = (int) (Math.random() * 100 + 1);
        System.out.printf("Компьютер загадал число от 0 до 100 %d\n", targetNumber);
        player1.reset();
        player2.reset();
        while (true) {
            if (isGuessed(player1, targetNumber)) {
                break;
            } 
            if (isGuessed(player2, targetNumber)) {
                break;
            }
        }
        System.out.printf("Числа которые ввел %s ", player1.getName());
        printNum(player1);
        System.out.printf("Числа которые ввел %s ",  player2.getName());
        printNum(player2);
    }

    private boolean isGuessed(Player player, int targetNumber) {
        System.out.printf("%s введи число от 0 до 100 :", player.getName());
        int playerNum =  scanner.nextInt();
        player.addNum(playerNum);
        if (targetNumber == playerNum) {
            System.out.printf("Игрок %s угадал число %d с %d попытки\n", player.getName(), targetNumber, player.getCount());
            return true;
        }
        if (targetNumber < playerNum) {
            System.out.printf("число %d больше того, что загадал компьютер\n", playerNum);
        } else  {
            System.out.printf("число %d меньше того, что загадал компьютер\n", playerNum);
        } 
        return false;
    }
    private void printNum(Player player ) {
        for (int num : player.copyArr()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

