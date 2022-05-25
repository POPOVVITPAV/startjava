package Lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
      int numOfComputer = 10;
      boolean isFlage = true;
      int numOfUser =1;
      int a = 41;
      int c = 1119;
      int m = 111;
      while (isFlage) {
          numOfUser = (a * numOfUser + c) % m;
          System.out.println(numOfUser);
          if (numOfComputer == numOfUser) {
              System.out.println("You win! Num is " + numOfUser);
              isFlage = false;
          }
      }
    }
}
