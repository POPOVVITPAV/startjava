package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение отделяя числа от символа пробелом: ");
                String mathExpression = sc.nextLine();
                try{
                    System.out.printf("%s = %d\n", mathExpression, Calculator.calculate(mathExpression));
                } catch (NumberFormatException e) {
                    System.out.println("Введите целые числа");
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();
        } while (!"no".equals(answer));
        sc.close();
    } 
}
       
