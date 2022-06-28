package Lesson_2;

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
            if (isGuessed(player1.getName(), targetNumber)) {
                break;
            } 
            if (isGuessed(player2.getName(), targetNumber)) {
                break;
            }
        }
    }

    public boolean isGuessed(String playerName, int targetNumber) {
        System.out.printf("%s введи число от 0 до 100 :", playerName);
        int playerNum =  scanner.nextInt();
        boolean result = false;
        if (targetNumber == playerNum) {
            System.out.printf("Победу одержал %s\n", playerName);
            result = true;
        }
        if (targetNumber < playerNum) {
            System.out.printf("число %d больше того, что загадал компьютер\n", playerNum);
        }
        if (targetNumber > playerNum) {
            System.out.printf("число %d меньше того, что загадал компьютер\n", playerNum);
        } 
        return result;
    }
}

