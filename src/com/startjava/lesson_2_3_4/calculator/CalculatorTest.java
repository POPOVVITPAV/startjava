package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение отделяя числа от символа пробелом: ");
            String str = sc.nextLine();
            String[] strArray = str.split(" ");
            calc.setNum1(Integer.parseInt(strArray[0]));
            calc.setSign(strArray[1].charAt(0));
            calc.setNum2(Integer.parseInt(strArray[2]));
            System.out.printf("Результат: %s %s %s = %d\n", strArray[0], strArray[1], strArray[2], calc.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]"); 
                answer = sc.nextLine();
            } while (!(answer.equals("yes") || answer.equals("no"))); 
        }
        sc.close();
    } 
}
       
