package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите знак математической операции: ");
        char sign = sc.nextLine().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();

        calc.setNum1(num1);
        calc.setSign(sign);
        calc.setNum2(num2);
        calc.calculate();
        sc.close(); 
    }
}
