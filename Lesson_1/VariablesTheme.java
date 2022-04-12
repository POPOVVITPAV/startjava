package Lesson_1;

public class VariablesTheme {

  public static void main(String[] args) {
      // 1. Создание переменных и вывод их значений
      System.out.println("\n1. Создание переменных и вывод их значений\n");

      byte ram = 4;
      short systemType = 64;
      int hdd = 250;
      long cpuFrequency = 2l;
      float cpu = 2.00f ;
      double rating = 7.2;
      boolean hasDWDRam = true;
      char cpuType = 'i';

      System.out.println("RAM = " + ram);
      System.out.println("System type = " + systemType);
      System.out.println("HDD =" + hdd);
      System.out.println("Processor farequency = " + cpuFrequency);
      System.out.println("CPU = " + cpu);
      System.out.println("RAating: " + rating);
      System.out.println("DVD = " + hasDWDRam);
      System.out.println("Processor: Core " + cpuType + "3\n");

      // 2. Расчет стоимости товара
      System.out.println("2. Расчет стоимости товара\n");
      double costGoodsX = 100;
      double costGoodsY = 200;
      int discount = 11;

      double sumCost = costGoodsX + costGoodsY;
      double sumDiscount = sumCost * discount / 100;
      double sumCostWithDiscount = sumCost - sumDiscount;

      System.out.println("Итоговая сумма товаров со скидкой = " + sumCostWithDiscount);
      System.out.println("Сумма скидки = " + sumDiscount);

      // 3. Вывод на консоль слова JAVA
      System.out.println("\n3. Вывод на консоль слова JAVA");
      System.out.println();
      System.out.println("   J    a  v     v  a    ");
      System.out.println("   J   a a  v   v  a a   ");
      System.out.println("J  J  aaaaa  v v  aaaaa  ");
      System.out.println(" JJ  a     a  v  a     a ");

      // 4. Отображение min и max значений числовых типов данных
      System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
      //инициализируем max значения
      byte maxByte = 127;
      short maxShort = 	32767;
      int maxInt = 2147483647;
      long maxLong = 9223372036854775807l;
      
      // Выводим на экран максимальные значения
      System.out.println(maxByte);
      System.out.println(maxShort);
      System.out.println(maxInt);
      System.out.println(maxLong+"\n");

      // Выводим на экран инкрементируемые значения
      System.out.println(++maxByte);
      System.out.println(++maxShort);
      System.out.println(++maxInt);
      System.out.println(++maxLong);

      // 5. Перестановка значений переменных
      System.out.println("\n5. Перестановка значений переменных");
      double firstNum = 12.6;
      double secondNum = 781.5;
      double thirdNum;
      System.out.println("\nПервое число = " + firstNum);
      System.out.println("Второе число = " + secondNum);

      // Меняем числа местами
      thirdNum = firstNum;
      firstNum = secondNum;
      secondNum = thirdNum;
      System.out.println("Переменные после перестановки местами");
      System.out.println("Первое число = " + firstNum);
      System.out.println("Второе число = " + secondNum);

      // 6. Вывод символов и их кодов
      System.out.println("\n6. Вывод символов и их кодов\n");
      int code1 = 35;
      int code2 = 38;
      int code3 = 64;
      int code4 = 94;
      int code5 = 95;

      System.out.println((char) code1);
      System.out.println((char) code2);
      System.out.println((char) code3);
      System.out.println((char) code4);
      System.out.println((char) code5);

      // 7. Произведение и сумма цифр числа
      System.out.println("\n7. Произведение и сумма цифр числа");

      int srcNum = 345;
      int num1 = srcNum / 100;
      int num2 = srcNum / 10 % 10;
      int num3 = srcNum % 10;

      int numProduct = num1 * num2 * num3;
      int numSum = num1 + num2 + num3;

      System.out.println("\nПроизведение чисел = " + numProduct);
      System.out.println("Cумма чисел = " + numSum);

      //Задание со*

      // 8. Вывод на консоль ASCII-арт Дюка
      System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");

      char slesh = '/';
      char backlash = '\\';
      char space = ' ';
      char underlining = '_';
      char lBracket = '(';
      char rBracket = ')';

      System.out.println("" + space + space + space + space + slesh + backlash);
      System.out.println("" + space + space + space + slesh + space + space + backlash);
      System.out.println("" + space + space + slesh + underlining + lBracket + space + rBracket + backlash);
      System.out.println("" + space + slesh + space + space + space + space + space + space + backlash);
      System.out.println("" + slesh + underlining + underlining + underlining + underlining + slesh + backlash + underlining + underlining + backlash);

      //9. Отображение количества сотен, десятков и единиц числа
      System.out.println("\n9.Отображение количества сотен, десятков и единиц числа");

      int numSrc = 123;
      int hundreds = numSrc / 100;
      int dozens = numSrc / 10 % 10;
      int units = numSrc % 10;

      System.out.println("\nЧисло содержит:");
      System.out.println(hundreds + " сотню(и)");
      System.out.println(dozens + " десятка");
      System.out.println(units + " еденицы");
      
      // 10. Преобразование секунд
      System.out.println("\n10. Преобразование секунд\n");
      
      int totalSec = 86399;
      int hours = totalSec / 3600;
      int minutes = totalSec / 60 % 60;
      int seconds = totalSec % 60;
      
      System.out.println(hours+":"+ minutes +":"+ seconds);
  }
}
