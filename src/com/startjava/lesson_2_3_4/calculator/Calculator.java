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

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getSign() {
        return sign;
    }

    public void splitArray(String str) {
        String[] strArray = str.split(" ");
        setNum1(Integer.parseInt(strArray[0]));
        setSign(strArray[1].charAt(0));
        setNum2(Integer.parseInt(strArray[2]));
    }

    public int calculate() {
        //int result = 0;
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
