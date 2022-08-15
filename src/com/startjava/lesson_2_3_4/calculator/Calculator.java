package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public int calculate(String str) {
        String[] operands = str.split(" ");
        num1 = Integer.parseInt(operands[0]);
        sign = operands[1].charAt(0);
        num2 = Integer.parseInt(operands[2]);
        switch (sign) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            case '%': return num1 % num2;
            case '^': return (int) Math.pow(num1, num2);
            default: System.out.println("Неизвестная операция ");
        }
        return 0;
    }
}
