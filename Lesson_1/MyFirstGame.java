package Lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
      int numOfComputer = 10;
     // boolean isFlage = true;
      int numOfUser = 0;
      while (numOfUser != numOfComputer) {
              numOfUser = (numOfUser * 2 + 1) % 11;  
              numOfUser++;
          if (numOfComputer < numOfUser) {
              System.out.printf("\nчисло %d больше того, что загадал компьютер", numOfUser);
          } else if (numOfComputer > numOfUser) {
            System.out.printf("\nчисло %d меньше того, что загадал компьютер", numOfUser);
        }
      }
      System.out.println("\nYou win! Num is " + numOfUser);
    }
}
