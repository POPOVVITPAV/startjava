package Lesson_2;

import java.net.Socket;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Первый игрок введите свое имя");
        String nameFirstPlayer = sc.nextLine();
        System.out.println("Второй игрок введите свое имя");
        String nameSecondPlayer = sc.nextLine();
        Player player1 = new Player(nameFirstPlayer);
        Player player2 = new Player(nameSecondPlayer);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.printf("%s введите число от 0 до 100", player1.getName());
            System.out.printf("%s введите число от 0 до 100", player2.getName());
            
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = sc.nextLine();    
              } while (!(answer.equals("yes") || answer.equals("no")));
        }
        sc.close();

    }
    

}
