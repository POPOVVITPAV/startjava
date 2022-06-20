package Lesson_2;

public class GuessNumber {
   
    Player player;

    public void startGame() {
        player = new Player();

        int targetNumber = (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число от 0 до 100");

        while (true) {
            if (player.getNum())



        }


    }
}
