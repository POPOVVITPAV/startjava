package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1,2,3,4,5,6,7};
        int len = intArray.length;
        int[] arrayRevers = new int[len];
        arrayOutput(intArray);
        for (int i = 0; i < len ; i++) {
            arrayRevers[len - 1 - i] = intArray[i];
        }
        System.out.println();
        arrayOutput(arrayRevers);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
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
        double middleNum = doubleArr[len / 2];
        for (int i = 0; i < len; i++) {
            if (middleNum < doubleArr[i]) {
                doubleArr[i] = 0;
                count++;
            }
        }
        arrayOutput(doubleArr);
        System.out.println(" \nколичество обнуленных ячеек = " + count);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        len = charArr.length;
        for (int i = 0; i < len; i++) {
            charArr[i] = (char) (65 + i);
        }
        arrayOutput(charArr);
        System.out.println();
        for (int i = len; i > 0; i--) {
            for (int j = len - 1; j > i - 2; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Генерация уникальных чисел");
        intArray = new int [30];
        len = intArray.length;
        intArray[0] = 60;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i ; j++) {
                if (intArray[j] == intArray[i] || intArray[i] == 0) {
                    intArray[i] = (int) (Math.random() * (40 + 1)) + 60;
                    j = -1;
                }
            }
        }
        arrayOutput(intArray);
        System.out.println();
        int temp;
        for (int i = len - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++){
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        arrayOutput(intArray);
    }

    private static void arrayOutput(char[] array) {
        for (char letter : array) {
            System.out.print(letter + " ");
        }
    }

    private static void arrayOutput(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void arrayOutput(double[] array) {
        int count = 0;
        for (double num : array) {
            System.out.printf(" %.2f", num);
            count++;
            if (count == 8) {
                System.out.println();
            }
        }
    }
}







