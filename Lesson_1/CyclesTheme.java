package Lesson_1;

public class CyclesTheme {

    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        int oddNumberSum = 0;
        int evenNumberSum = 0;
        int currentValue = -10;
        int limit = 21; 
        do {
            if (currentValue % 2 == 0) {
                oddNumberSum += currentValue;
            } else {
                evenNumberSum += currentValue;
            }
            currentValue++;
        } while (currentValue <= limit);
        System.out.println("Сумма четных чисел = " + oddNumberSum);
        System.out.println("Сумма нечетных чисел = " + evenNumberSum);

        //2. Вывод чисел между max и min
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2 & num2 > num3) {
            max = num1;
            min = num3;
        } else if (num1 < num2 & num2 < num3) {
            max = num3;
            min = num1;
        } else if (num2 > num3 & num3 > num1) {
            max = num2;
            min = num1;
        } else if (num2 < num3 & num3 < num1) {
            max = num2;
            min = num1;    
        } else if (num3 > num1 & num1 > num2) {
            max = num3;
            min = num2;
        }else if (num3 < num1 & num1 < num2) {
            max = num3;
            min = num2;    
        }
        for (int i = min + 1; i < max; i++) {
            System.out.print(i + ",");
        }
        
        //3. Вывод реверсивного числа и суммы его цифр
        int num = 1234;
        int reversed = 0;
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            sum += digit;
        }
        System.out.println("Число в обратном порядке: " + reversed + ", сумма его цифр " + sum);
        
        //4. Вывод чисел на консоль в несколько строк
        for (int j = 1; j <= 24; j += 2) {
            System.out.printf("%4d", j);
            if (j % 5 == 4) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
        //5. Проверка количества единиц на четность
        int num5 = 3141591;
        int count = 0;
        String word;
        while (num5 !=0) {
            int numOne = num5 % 10;
            if (numOne == 1) {
                count++;
            }
            num5 /= 10;
        } if (count % 2 == 0) {
            word = "Четным";
        } else {
            word = "Нечетным";
        }
        System.out.println("Количество еденийц: " + count + ", является " + word);

        //6. Отображение фигур в консоли
       for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }//6.2
        int a = 5;
        while(a > 0){
            int b = 0;
            while (b < a){
                System.out.print("#");
                b++;
            }
            System.out.println();
            a--;
        } //6.3 
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
        //8. Проверка, является ли число палиндромом
        int srcNum = 12321;
        int num8 = srcNum;
        int palindrome = 0;
        while (num8 != 0) {
            int digit = num8 % 10;
            palindrome = palindrome * 10 + digit;
            num8 /= 10;
        }
        if (srcNum == palindrome) {
            System.out.println("Число является палиндромом " + palindrome);
        } else {
            System.out.println("Число не является палиндромом " + palindrome);
        }
        //9. Определение, является ли число счастливым
         int number = 123411;
        int step = 1;
        int count = 0;
        int sum12 = 0;
        while (number != 0) {
            sum12 += step * (number % 10);
            number /= 10;
            if (++count == 3) {
                step =- step;
            }
        }
        if (count == 6 && sum12 == 0) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }
        //10. Вывод таблицы умножения Пифагора
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    } 
}