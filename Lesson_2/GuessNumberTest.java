package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nПервый игрок введите свое имя ");
        String nameFirstPlayer = sc.nextLine();
        System.out.printf("\nВторой игрок введите свое имя ");
        String nameSecondPlayer = sc.nextLine();
        sc.nextLine();
        Player player1 = new Player(nameFirstPlayer);
        Player player2 = new Player(nameSecondPlayer);
        String answer = "yes";
        while (answer.equals("yes")) {
            guessNumber.startGame();
            while (guessNumber.startGame() != true) {
                System.out.printf("\n%s введите число от 0 до 100 ", player1.getName());
                player1.setNum(sc.nextInt());
                sc.nextLine();
                System.out.printf("\n%s введите число от 0 до 100 ", player2.getName());
                player2.setNum(sc.nextInt());
            }
            sc.nextLine();
            do {
                System.out.printf("Хотите продолжить игру? [yes/no12]:");
                answer = sc.nextLine();    
              } while (!(answer.equals("yes") || answer.equals("no")));
        }
        sc.close();

    }
    

}
