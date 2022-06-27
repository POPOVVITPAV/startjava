package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первый игрок введи имя:");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Второй игрок введи имя: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";
        while (answer.equals("yes")) {
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!(answer.equals("yes")) && !(answer.equals("no")));
        }
        scanner.close();   
     } 

 }
