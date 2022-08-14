package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение отделяя числа от символа пробелом: ");
            calc.splitArray(sc.nextLine());
            System.out.printf("%d %c %d = %d\n", calc.getNum1(), calc.getSign(), calc.getNum2(), calc.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]"); 
                answer = sc.nextLine();
            } while (!(answer.equals("yes") || answer.equals("no"))); 
        }
        sc.close();
    } 
}
       
