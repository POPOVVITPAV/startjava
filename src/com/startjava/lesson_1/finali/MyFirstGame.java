package com.startjava.lesson_1.finali;

public class MyFirstGame {
    public static void main(String[] args) {
      int numOfComputer = 10;
      int numOfPlayer = (2 * 1 + 3) % 9;
      while (numOfPlayer != numOfComputer) {
          if (numOfComputer < numOfPlayer) {
              System.out.printf("\nчисло %d больше того, что загадал компьютер", numOfPlayer);
              numOfPlayer++;
          } else if (numOfComputer > numOfPlayer) {
              System.out.printf("\nчисло %d меньше того, что загадал компьютер", numOfPlayer);
              numOfPlayer--;
          }
     }
      System.out.println("\nYou win! Num is " + numOfPlayer);
    }
}
