package Lesson_1;

public class CyclesTheme {

    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int sumOdd = 0;
        int sumEven = 0;
        int counter = -10;
        int limit = 21; 
        do {
            if (counter % 2 == 0) {
                sumOdd += counter;
            } else {
                sumEven += counter;
            }
            counter++;
        } while (counter <= limit);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumOdd + ", а нечетных = " + sumEven);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0; 
        if (num1 > num2 && num2 > num3) {
            max = num1;
            min = num3;
        } else if (num2 > num3 && num3 > num1) {
            max = num2;
            min = num1;
        } else if (num3 > num1 && num1 > num2) {
            max = num3;
            min = num2;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        
        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int reversed = 0;
        int sumDigits = 0;
        while(srcNum != 0) {
            int digit = srcNum % 10;
            reversed = reversed * 10 + digit;
            srcNum /= 10;
            sumDigits += digit;
        }
        System.out.println("Число в обратном порядке: " + reversed + "\n сумма его цифр " + sumDigits);
        
        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;
        for (int i = 1; i <=24; i += 2) {
            System.out.printf("%4d", i);
            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        if (count > 0) {
            for (int j = 5 - count; j > 0; j--) {
                System.out.printf("%4d", 0);
            }
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        int srcNum5 = 3141591;
        int num5 = srcNum5;
        int count5 = 0;
        while (num5 != 0) {
            int digit = num5 % 10;
            if (digit == 1) {
                count5++;
            }
            num5 /= 10;
        }
        String word = "";
        if (count5 % 2 == 0) {
            word = "Четное";
        } else {
            word = "Нечетное";
        }
        System.out.println(" Число " + srcNum5 + " содержит " + count5 + " единицы. " + word + " количество единиц" );

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //6.2
        System.out.println();
        int a = 5;
        while(a > 0) {
            int b = 0;
            while (b < a) {
                System.out.print("#");
                b++;
            }
            System.out.println();
            a--;
        } 
        //6.3
        System.out.println(); 
        int k = 1;
        do {
            int t = 0;
            do {
                System.out.print("$");
                t++;
            } while (t < k);
            System.out.println();
            k++;
        } while (k <= 3);
        int k1 = 2;
        do {
            int t = 0;
            do {
                System.out.print("$");
                t++;
            } while (t < k1);
            System.out.println();
            k1--;
        } while (k1 >= 1);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.println("Dec " + " Char");
        for (int i = 1; i < 48; i += 2) {
            System.out.printf("%3d%6s\n", i, (char) i);
        }
        for (int i = 98; i < 122; i += 2) {
            System.out.printf("%3d%6s\n", i, (char) i);
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int srcNum8 = 12321;
        int num8 = srcNum8;
        int palindrome = 0;
        while (num8 != 0) {
            int digit = num8 % 10;
            palindrome = palindrome * 10 + digit;
            num8 /= 10;
        }
        if (srcNum8 == palindrome) {
            System.out.println("Число " + palindrome +  " является палиндромом");
        } else {
            System.out.println("Число " + palindrome +  " не является палиндромом ");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым\n");
        int srcNumber = 123411;
        int sumLeftNum  = 0;
        int sumRightNum = 0;
        int leftNum = srcNumber / 1000;
        int rightNum = srcNumber % 1000;
        while (leftNum != 0) {
            int digitLeft = leftNum % 10;
            int digitRight = rightNum % 10;
            sumLeftNum += digitLeft;
            sumRightNum += digitRight;
            leftNum /= 10;
            rightNum /= 10;
        }
        if (sumLeftNum == sumRightNum) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print(" |");
        for (int i = 2; i <= 9; i++) {
             System.out.printf("%4d", i);
        }
        System.out.println("\n__________________________________");
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    } 
}