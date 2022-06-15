package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            calc.setNum1(sc.nextInt());
            sc.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(sc.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(sc.nextInt());
            calc.calculate();
            sc.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]"); 
                answer = sc.nextLine();
            } while (!(answer.equals("yes") || answer.equals("no"))); 
        }
        sc.close();
    } 
}
       
