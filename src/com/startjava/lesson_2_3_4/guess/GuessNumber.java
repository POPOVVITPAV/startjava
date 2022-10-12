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
        while (true) {
            if (isGuessed(player1.getName(), targetNumber, player1)) {
                break;
            } 
            if (isGuessed(player2.getName(), targetNumber, player2)) {
                break;
            }
        }
//        System.out.println(Arrays.toString(player1.getArrCopy()));
//        System.out.println(Arrays.toString(player2.getArrCopy()));
        System.out.printf("Числа которые ввел %s ", player1.getName());
        player1.getArrCopy();
        System.out.printf("Числа которые ввел %s ",  player2.getName());
        player2.getArrCopy();
    }

    private boolean isGuessed(String playerName, int targetNumber, Player player) {
        System.out.printf("%s введи число от 0 до 100 :", playerName);
        int playerNum =  scanner.nextInt();
        int count = player.writeInArr(playerNum);
        if (targetNumber == playerNum) {
            System.out.printf("Игрок %s угадал число %d с %d попытки\n", playerName, targetNumber, count);
            return true;
        }
        if (targetNumber < playerNum) {
            System.out.printf("число %d больше того, что загадал компьютер\n", playerNum);
        } else  {
            System.out.printf("число %d меньше того, что загадал компьютер\n", playerNum);
        } 
        return false;
    }
}

