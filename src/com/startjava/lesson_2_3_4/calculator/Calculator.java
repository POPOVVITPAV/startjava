package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] operands = mathExpression.split(" ");
        int num1 = Integer.parseInt(operands[0]);
        int sign = operands[1].charAt(0);
        int num2 = Integer.parseInt(operands[2]);
        if (num1 < 0 || num2 < 0) throw new IllegalArgumentException("Числа должны быть положительные");
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalStateException("Неизвестная операция: " + sign);
        };
    }
}

