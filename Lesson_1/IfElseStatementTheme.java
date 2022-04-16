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
  } 
}
