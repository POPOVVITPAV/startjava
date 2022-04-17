package Lesson_1;

public class IfElseStatementTheme {

  public static void main(String[] args) {
    //1. Перевод псевдокода на язык Java
    System.out.println("\n1. Перевод псевдокода на язык Java\n");
    int age = 21;
    if (age > 20) {
        System.out.println("Можно бахнуть пивка");
    } else {
        System.out.println("Ты ещё маленький");
    }

    boolean genderMale = true;
    if (!genderMale) {
        System.out.println("Детям мороженое бабе цветы");
    }

    double height = 1.70;
    if (height < 1.80) {
        System.out.println("Программист");
    } else {
        System.out.println("Баскетболист");
    }

    char firstLetterName = "Мария".charAt(0);
    if (firstLetterName == 'М') {
        System.out.println("Русское Имя");
    } else if (firstLetterName == 'I') {
        System.out.println("Английское имя");
    } else {
        System.out.println("Неизвестно");
    }


    //2. Поиск максимального и минимального числа
    System.out.println("\n2. Поиск максимального и минимального числа");
    int srcNum1 = 235;
    int srcNum2 = 10;
    if (srcNum1 > srcNum2) {
        System.out.println("\nЧисло " + srcNum1 + " больше " + srcNum2);
    } else {
        System.out.println("\nЧисло " + srcNum2 + " больше " + srcNum1);
    }

    //3. Работа с числом
    System.out.println("\n3. Работа с числом");
    int someNumber = 5;
    if (someNumber != 0) {
        if (someNumber % 2 == 0) {
            System.out.println("\nЧисло являеться четным");
        } else {
            System.out.println("\nЧисло являеться нечетным");
        }
        if (someNumber < 0 ) {
            System.out.println("Число являеться отрицательным");
        } else {
            System.out.println("Число являеться положительным");
        }
    } else {
        System.out.println("\nЧисло являеться нулем");
    }

    //4. Поиск общей цифры в числах
    System.out.println("\n4. Поиск общей цифры в числах");
    int firstVariable = 137;
    int secondVariable = 439;
    if (firstVariable / 100 == secondVariable / 100) {
        System.out.println("Сони равны " + firstVariable / 100);
    } else if (firstVariable / 10 % 10 == secondVariable / 10 % 10) {
        System.out.println("Десятки равны " + firstVariable / 10 % 10);
    } else if (firstVariable % 10 == secondVariable % 10) {
        System.out.println("Единицы равны " + firstVariable % 10);
    }
    

    //6. Определение суммы вклада и начисленных банком %
    System.out.println("\n6. Определение суммы вклада и начисленных банком %");
    double depositAmount = 300_000;
    double accruedInterest;
    double totalAmount;
    if (depositAmount < 100_000) {
         accruedInterest = depositAmount * 0.05;
         totalAmount = depositAmount + accruedInterest; 
    } else if (100_000 <= depositAmount && depositAmount <= 300_000) {
         accruedInterest = depositAmount * 0.07;
         totalAmount = depositAmount + accruedInterest; 
    } else {
         accruedInterest = depositAmount * 0.1;
         totalAmount = depositAmount + accruedInterest; 
    }
    System.out.println("\nСумма вклада = " + depositAmount + ", начисленный процент = " + accruedInterest + ", итоговая сумма с процентами = " + totalAmount);

    //7. Определить оценки по предметам 
  /*  System.out.println("\n7. Определить оценки по предметам ");
    int balls = 10;
    int assessment = 10;
    int programmingBalls = 59;
    int historyBalls = 91;
    if (balls <= 60) {
        assessment = 2;
    } else if (balls > 60) {
        assessment = 3;
    } else if (balls > 73) {
        assessment = 4;
    } else if (balls > 91) {
        assessment = 5;
    }
    System.out.println(assessment);
    System.out.println("Средний балл = " + (programmingBalls + historyBalls)/2);
    System.out.println("Средний балл = " + (programmingBalls + historyBalls)/2);
    System.out.println("Средний процент по предметам = " + (programmingBalls + historyBalls)/2);*/
    
    //8. Расчет прибыли (убытка)
    System.out.println("\n8. Расчет прибыли (убытка)");
    double rentOfPremises = 5_000;
    double priceSoldGoods = 15_000;
    double costPrice = 9_000;
    double financialResults = (priceSoldGoods - rentOfPremises - costPrice) * 12;
    if (financialResults > 0) {
        System.out.println(" + " + financialResults);
    } else {
        System.out.println(" - " + financialResults);
    }

    //Задание со*

      // 9. Определение существования треугольника
      System.out.println("\n9. Определение существования треугольника"); 
  } 
}
