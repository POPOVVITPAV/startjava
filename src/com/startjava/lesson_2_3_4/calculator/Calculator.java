package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate(String str) {
        String[] operands = str.split(" ");
        setNum1(Integer.parseInt(operands[0]));
        setSign(operands[1].charAt(0));
        setNum2(Integer.parseInt(operands[2]));
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
