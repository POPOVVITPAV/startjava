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
        //4. Вывод чисел на консоль в несколько строк
        //5. Проверка количества единиц на четность
        //6. Отображение фигур в консоли
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int i = 0;
        int j = 5;
        while (i < 5) {
            while (j < 0) {
                System.out.print("*");
                }
                 j--;
            System.out.print("*");
            i++;    
        }
        //7. Отображение ASCII-символов
        //8. Проверка, является ли число палиндромом
        //9. Определение, является ли число счастливым
        //10. Вывод таблицы умножения Пифагора


    } 
}