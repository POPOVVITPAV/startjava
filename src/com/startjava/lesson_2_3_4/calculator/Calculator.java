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

    public int calculate() {
        int result = 0;
        switch (sign) {
            case '+': 
                result = num1 + num2;
                break;
            case '-': 
                result = num1 - num2;
                break;
            case '*': 
                result = num1 * num2;
                break;
            case '/': 
                result = num1 / num2;
                break;
            case '%': 
                result = num1 % num2;
                break;
            case '^': 
                result = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("Неизвестная операция ");
        }
        return result;
    }
}
