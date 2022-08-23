package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String str) {
        String[] operands = str.split(" ");
            int num1 = Integer.parseInt(operands[0]);
            char sign = operands[1].charAt(0);
            int num2 = Integer.parseInt(operands[2]);
                int result = switch (sign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                case '%' -> num1 % num2;
                case '^' -> (int) Math.pow(num1, num2);
                default -> throw new IllegalStateException("Неизвестная операция: " + sign);
            };
        return result;
    }
}

