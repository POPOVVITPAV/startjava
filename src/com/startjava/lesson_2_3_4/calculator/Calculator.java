package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String mathExpression) throws RuntimeException {
        String[] operands = mathExpression.split(" ");
        if (Integer.parseInt(operands[0]) < 0 || Integer.parseInt(operands[2]) < 0) throw new RuntimeException("Числа должны быть положительные");
        int num1 = Integer.parseInt(operands[0]);
        int sign = operands[1].charAt(0);
        int num2 = Integer.parseInt(operands[2]);
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

