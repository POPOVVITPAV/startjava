package Lesson_2;

public class GuessNumber {
   
    Player player;
    
    public boolean startGame() {
        player = new Player();
        int targetNumber = (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число от 0 до 100" + targetNumber);
        if (targetNumber == player.getNum()){
            System.out.printf("\n Победу одержал %s", player.getName());
            return true;
        } else if (player.getNum() > targetNumber) {
            System.out.printf("\nчисло %d больше того, что загадал компьютер", player.getNum());
            return false;
        } else {
            System.out.printf("\nчисло %d меньше того, что загадал компьютер", player.getNum());
            return false;
        }
    }
}
