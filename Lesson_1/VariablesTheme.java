package Lesson_1;

public class VariablesTheme {


  public static void main(String[] args) {

    // 1. Создание переменных и вывод их значений
      System.out.println("1. Создание переменных и вывод их значений");
      System.out.println();

      byte ram = 4;
      short systemType = 64;
      int hdd = 250;
      long processorFarequency = 2l;
      float cpu = 2.00f ;
      double rating = 7.2;
      boolean hasDWDRam = true;
      char procesor = 'i';

      System.out.println("RAM = " + ram);
      System.out.println("System type = " + systemType);
      System.out.println("HDD =" + hdd);
      System.out.println("Processor farequency = " + processorFarequency);
      System.out.println("CPU = " + cpu);
      System.out.println("RAating: " + rating);
      System.out.println("DVD = " + hasDWDRam);
      System.out.println("Processor: Core " + procesor + "3");
      System.out.println();

    // 2. Расчет стоимости товара
      System.out.println("2. Расчет стоимости товара");
      System.out.println();
      double costGoodsX = 100;
      double costGoodsY = 200;
      int discount = 11;

      double sumCost = costGoodsX + costGoodsY;
      double sumDiscount = sumCost * discount/100;
      double sumCostWithDiscount = sumCost - sumDiscount;

      System.out.println("Итоговая сумма товаров со скидкой = " + sumCostWithDiscount);
      System.out.println("Сумма скидки = " + sumDiscount);
      System.out.println();

    // 3. Вывод на консоль слова JAVA
      System.out.println("3. Вывод на консоль слова JAVA");
      System.out.println();
      System.out.println("   J    a  v     v  a    ");
      System.out.println("   J   a a  v   v  a a   ");
      System.out.println("J  J  aaaaa  v v  aaaaa  ");
      System.out.println(" JJ  a     a  v  a     a ");
      System.out.println();

    // 4. Отображение min и max значений числовых типов данных

      System.out.println("4. Отображение min и max значений числовых типов данных");
      System.out.println();
      //инициализируем max значения
      byte maxByte = 127;
      short maxShort = 	32767;
      int maxInt = 2147483647;
      long maxLong = 9223372036854775807l;
      float maxFloat = 3.4E+38f;
      double maxDouble = 1.7E+308;
      
      // Выводим на экран максимальные значения
      System.out.println(maxByte);
      System.out.println(maxShort);
      System.out.println(maxInt);
      System.out.println(maxLong);
      System.out.println(maxFloat);
      System.out.println(maxDouble);
      System.out.println();
      
      // Инкрементируем значения
       maxByte++;
       maxShort++;
       maxInt++;
       maxLong++;
       maxFloat++;
       maxDouble++;

      // Выводим на экран инкрементируемые значения
      System.out.println(maxByte);
      System.out.println(maxShort);
      System.out.println(maxInt);
      System.out.println(maxLong);
      System.out.println(maxFloat);
      System.out.println(maxDouble);
      System.out.println();

      //инициализируем min значения
      byte minByte = -128;
      short minShort = -32768;
      int minInt = -2147483648;
      long minlong = -9223372036854775808l;
      float minFloat = -3.4E+38f;
      double minDouble = -1.7E+308;

      // Выводим на экран min значения
      System.out.println(minByte);
      System.out.println(minShort);
      System.out.println(minInt);
      System.out.println(minlong);
      System.out.println(minFloat);
      System.out.println(minDouble);
      System.out.println();

      //декрементируем min значения
       minByte--;
       minShort--;
       minInt --;
       minlong--;
       minFloat--;
       minDouble--;

      // Выводим на экран декрементируемые значения
      System.out.println(minByte);
      System.out.println(minShort);
      System.out.println(minInt);
      System.out.println(minlong);
      System.out.println(minFloat);
      System.out.println(minDouble);
      System.out.println();

    // 5. Перестановка значений переменных
    System.out.println("5. Перестановка значений переменных");
    System.out.println();
    double firstNum = 12.6;
    double secondNum = 781.5;
    double thirdNum;
    System.out.println("Первое число = " + firstNum);
    System.out.println("Второе число = " + secondNum);

        // Меняем числа местами

    thirdNum = firstNum;
    firstNum = secondNum;
    secondNum = thirdNum;
    System.out.println("Переменные после перестановки местами");
    System.out.println("Первое число = " + firstNum);
    System.out.println("Второе число = " + secondNum);
    System.out.println();

    // 6. Вывод символов и их кодов
    System.out.println("6. Вывод символов и их кодов");
    System.out.println();
    int num_1 = 35;
    int num_2 = 38;
    int num_3 = 64;
    int num_4 = 94;
    int num_5 = 95;

    System.out.println((char)(num_1));
    System.out.println((char)(num_2));
    System.out.println((char)(num_3));
    System.out.println((char)(num_4));
    System.out.println((char)(num_5));
    System.out.println();

    // 7. Произведение и сумма цифр числа
    System.out.println("7. Произведение и сумма цифр числа");
    System.out.println();

    int num = 345;
    int numFirst = num / 100;
    int numSecond = num % 10;
    int numThird = num / 10 % 10;

    int numProduct = numFirst*numSecond*numThird;
    int numSum = numFirst+numSecond+numThird;

    System.out.println("Произведение чисел = " + numProduct);
    System.out.println("Cумма чисел = " + numSum);
    System.out.println();

    //Задание со*

    // 8. Вывод на консоль ASC||-арт Дюка
    System.out.println("8. Вывод на консоль ASC||-арт Дюка");
    System.out.println();

    char slesh = '/';
    char reverseЫlash = '\\';
    char space = ' ';
    char underlining = '_';
    char bracketLeft = '(';
    char bracketRight = ')';
    System.out.println(space+""+space+""+space+""+space+""+slesh+""+reverseЫlash);
    System.out.println(space+""+space+""+space+""+slesh+""+space+""+space+""+reverseЫlash+"");
    System.out.println(space+""+space+""+slesh+""+underlining+""+bracketLeft+""+space+""+bracketRight+""+reverseЫlash);
    System.out.println(space+""+slesh+""+space+""+space+""+space+""+space+""+space+""+space+""+reverseЫlash);
    System.out.println(slesh+""+underlining+""+underlining+""+underlining+""+underlining+""+slesh+""+reverseЫlash+""+underlining+""+underlining+""+reverseЫlash);
    System.out.println();



    //9. Отображение количества сотен, десятков и единиц числа
    System.out.println("9.Отображение количества сотен, десятков и единиц числа");
    System.out.println();

    int number = 123;
    int numSotni = number / 100;
    int numDec = number / 10 % 10;
    int numNum = number % 10;

    System.out.println("Число содержит:");
    System.out.println(numSotni+" сотню(и)");
    System.out.println(numDec+" десятка");
    System.out.println(numNum+" еденицы");
    System.out.println();
    
    // 10. Преобразование секунд
    System.out.println("10. Преобразование секунд");
    System.out.println();
    
    int sec = 86399;
    int hour = sec / 3600;
    int minute = sec / 60 % 60;
    int secund = sec % 60;
    
    System.out.println(hour+":"+ minute +":"+ secund);


  }
}
