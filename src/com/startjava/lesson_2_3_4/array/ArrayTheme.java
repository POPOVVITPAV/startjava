package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] array = {1,2,3,4,5,6,7};
        int len = array.length;
        int[] arrayRevers = new int[len];
        arrayOutput(array);
        for (int i = 0; i < len ; i++) {
            arrayRevers[len - 1 - i] = array[i];
        }
        System.out.println();
        arrayOutput(arrayRevers);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] intArray = new int[10];
        len = intArray.length;
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
        }
        arrayOutput(intArray);
        System.out.println();
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            System.out.print(intArray[i] + ((intArray[i] == len - 2) ? "=" : "*"));
            product *= intArray[i];
        }
        System.out.println(product);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        arrayOutput(doubleArr);
        System.out.println("\n");
        int count = 0;
        int middleNum = len / 2;
        for (int i = 0; i < len; i++) {
            if (doubleArr[middleNum] < doubleArr[i]) {
                doubleArr[i] = 0;
                count++;
            }
        }
        arrayOutput(doubleArr);
        System.out.println(" \nколичество обнуленных ячеек = " + count);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        len = charArr.length;
        int numChar = 65;
        for (int i = 0; i < len; i++) {
            charArr[i] = (char) numChar;
            numChar++;
        }
        arrayOutput(charArr);
        System.out.println();
        for (int i = len; i > 0 ; i--) {
            for (int j = len - 1; j > i-2 ; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Генерация уникальных чисел");
        intArray = new int [30];
        len = intArray.length;
        for (int i = 0; i < len; i++) {
            intArray[i] = (int) (Math.random() * (40 + 1)) + 60;;
            for (int j = 0; j < i ; j++) {
                if (intArray[j] == intArray[i]) {
                    intArray[i] = (int) (Math.random() * (40 + 1)) + 60;
                    j = -1;
                }
            }
        }
        arrayOutput(intArray);
    }

        private static void arrayOutput( char[] arrayIn){
            for (char value : arrayIn) {
                System.out.print(value + " ");
            }
        }

        private static void arrayOutput(int[] array2){
            for (int value : array2) {
                System.out.print(value + " ");
            }
        }

        private static void arrayOutput( double[] arrayIn){
            int count = 0;
            for (double value : arrayIn) {
                System.out.printf(" %.2f", value);
                count++;
                if (count == 8) {
                    System.out.println();
                }
            }
        }
}







