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
        System.out.println("\n3. Работа с числом\n");
        int num = 5;
        System.out.print("Число является ");
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
            if (num < 0) {
                System.out.println("отрицательным");
            } else {
                System.out.println("положительным");
            }
        } else {
            System.out.println("нулем");
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах\n");
        srcNum1 = 137;
        srcNum2 = 439;
        if (srcNum1 / 100 == srcNum2 / 100) {
            System.out.println("Сони равны " + srcNum1 / 100);
        } else if (srcNum1 / 10 % 10 == srcNum2 / 10 % 10) {
            System.out.println("Десятки равны " + srcNum1 / 10 % 10);
        } else if (srcNum1 % 10 == srcNum2 % 10) {
            System.out.println("Единицы равны " + srcNum1 % 10);
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char symbol = '\u005A';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("это маленькая буква " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("это большая буква " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("это число " + symbol);
        } else {
            System.out.println("это не буква и не число");
        }
    
        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double depositAmount = 300_000;
        double percentageDeposit;
        double accruedInterest;
        double totalAmount;
        if (depositAmount < 100_000) {
            percentageDeposit = 5 / 100; 
        } else if (100_000 <= depositAmount && depositAmount <= 300_000) {
            percentageDeposit = 7 / 100; 
        } else {
            percentageDeposit = 10 / 100; 
        }
        accruedInterest = depositAmount * percentageDeposit;
        totalAmount = depositAmount + accruedInterest; 
        System.out.println("\nСумма вклада = " + depositAmount + ", начисленный процент = " + accruedInterest + ", итоговая сумма с процентами = " + totalAmount);

        //7. Определить оценки по предметам 
        System.out.println("\n7. Определить оценки по предметам\n");
        int programmingBalls = 91;
        int historyBalls = 56;
        int programmingAssessment = 2;
        int historyAssessment = 2;
        if (programmingBalls <= 60) {
            programmingAssessment = 2;
        } else if (programmingBalls > 60) {
            programmingAssessment = 3;
        } else if (programmingBalls > 73) {
            programmingAssessment = 4;
        } else if (programmingBalls > 91) {
            programmingAssessment = 5;
        }
        if (historyBalls <= 60) {
            historyAssessment = 2;
        } else if (historyBalls > 60) {
            historyAssessment = 3;
        } else if (historyBalls > 73) {
            historyAssessment = 4;
        } else if (historyBalls > 91) {
            historyAssessment = 5;
        }
        System.out.println("История - " + historyAssessment +"\nПрограммирование - " + programmingAssessment);
        System.out.println("Средний балл = " + (historyAssessment + programmingAssessment) / 2);
        System.out.println("Средний балл = " + (programmingBalls + historyBalls) / 2);
        
        //8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)\n");
        double rentOfPremises = 5_000;
        double priceSoldGoods = 15_000;
        double costPrice = 9_000;
        double financialResults = (priceSoldGoods - rentOfPremises - costPrice) * 12;
        if (financialResults < 0) {
            System.out.println("прибыль за год: " + financialResults);
        } else {
            System.out.println("прибыль за год: +" + financialResults);
        }

        //Задание со*

        // 9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника\n"); 
        double a = 3;
        double b = 4;
        double c = 5;
        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("Треугольник существует с такими длинами сторон");
            double cathet1 = 1;
            double cathet2 = 1;
            double hypotenuse = 1;
            if (a * a + b * b == c * c ) {
                cathet1 = a;
                cathet2 = b;
                hypotenuse = c;
            } else if (b * b + c * c == a * a) {
                cathet1 = b;
                cathet2 = c;
                hypotenuse = a;
            } else if (c * c + a * a == b * b) {
                cathet1 = c;
                cathet2 = a;
                hypotenuse = b;
            } 
            System.out.println("Катет 1 = " + cathet1 + " Катет 2 = " + cathet2 + " Гипотенуза = " + hypotenuse);
            System.out.println("Площадь треугольника = " + (cathet1 + cathet2) / 2);
        } else {
            System.out.println("Треугольник не существует с такими длинами сторон");
        }
        System.out.println("|\\");
        System.out.println("| \\");
        System.out.println("|  \\");
        System.out.println("|___\\");

        // 10. Подсчет количества банкнот 
        System.out.println("\n10. Подсчет количества банкнот\n"); 
        int srcAmount = 567;
        int denominationBanknote = 50;
        int denominationBanknote_50 = 1;
        int denominationBanknote_10 = 1;
        int unitsSum = 1;
        System.out.println("Деньги " + srcAmount + " состоят из");
        if (denominationBanknote == 1) {
            unitsSum = srcAmount / denominationBanknote;
        } else if (denominationBanknote == 10) {
            denominationBanknote_10 = srcAmount / denominationBanknote;
            unitsSum =  srcAmount % 10;
        }else if (denominationBanknote == 50) {
            denominationBanknote_50 = srcAmount / denominationBanknote;
            srcAmount %= denominationBanknote;
            denominationBanknote_10 = srcAmount / 10;
            unitsSum = srcAmount % 10;
        }
        System.out.println("Количество банкнот номиналом 50 = " + denominationBanknote_50);
        System.out.println("Количество банкнот номиналом 10 = " +  denominationBanknote_10);
        System.out.println("Количество банкнот номиналом 1 = " + unitsSum);
    } 
}
