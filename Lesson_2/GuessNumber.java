package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
   
    Player player1;
    Player player2;
    Scanner scanner; 

   public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
   }
    public void startGame() {
        int targetNumber = (int) (Math.random() * 100);
        System.out.printf("Компьютер загадал число от 0 до 100 %d\n", targetNumber);
        while (true) {
            int player1Answer = determineWinner(player1.getName(), targetNumber);
            if (targetNumber == player1Answer) {
                break;
            } 
            int player2Answer = determineWinner(player2.getName(), targetNumber);
            if (targetNumber == player2Answer) {
                break;
            }
        }
    }

    public int determineWinner(String playerName, int targetNumber) {
        scanner = new Scanner(System.in);
        System.out.printf("%s введи число от 0 до 100 :", playerName);
        int playerNum =  scanner.nextInt();
        if (targetNumber == playerNum){
            System.out.printf("Победу одержал %s\n", playerName);
            return playerNum;
        } else if (targetNumber < playerNum) {
            System.out.printf("число %d больше того, что загадал компьютер\n", playerNum);
            return playerNum;
        } else {
            System.out.printf("число %d меньше того, что загадал компьютер\n", playerNum);
            return playerNum;
        }
    }
}
