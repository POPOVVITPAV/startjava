
package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] array = {1,2,3,4,5,6,7};
        int[] arrayRevers = new int[array.length];
        arrayOutput(array);
        for (int i = 0; i < array.length ; i++) {
            arrayRevers[array.length - 1 - i] = array[i];
        }
        System.out.println();
        arrayOutput(arrayRevers);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        arrayOutput(array2);
        System.out.println();
        int product = 1;
        int num = 0;
        for (int i = 1; i < array2.length - 1; i++) {
            String sing = (array2[i] == array2.length - 2) ? "=" : "*";
            System.out.print(array2[i] + sing);
            product *= array2[i];
        }
        System.out.println(product);

        System.out.println("\n\n3. Удаление элементов массива");
        double [] array3 = new double[15];
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.random();
        }
        arrayOutput(array3);
        System.out.println("\n");
        int middleMass = array3.length / 2;
        for (int i = 0; i < array3.length; i++) {
            if (array3[middleMass] < array3[i]) {
                array3[i] = 0;
                count++;
            }
        }
        arrayOutput(array3);
        System.out.println(" \nколичество обнуленных ячеек = " + count);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] array4 = new char[26];
        int numChar = 65;
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (char) numChar;
            numChar++;
        }
        arrayOutput(array4);
        System.out.println();
        for (int i = array4.length; i > 0 ; i--) {
            for (int j = array4.length - 1; j > i-2 ; j--) {
                System.out.print(array4[j]);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Генерация уникальных чисел");
        int[] array5 = new int [30];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) (Math.random() * (40 + 1)) + 60;;
            for (int j = 0; j < i ; j++) {
                if (array5[j] == array5[i]) {
                    array5[i] = (int) (Math.random() * (40 + 1)) + 60;
                    j = -1;
                }
            }
        }
        arrayOutput(array5);
    }

        public static void arrayOutput( char[] arrayIn){
            for (char value : arrayIn) {
                System.out.print(value + " ");
            }
        }

        private static void arrayOutput(int[] array2){
            for (int value : array2) {
                System.out.print(value + " ");
            }
        }

       public static void arrayOutput(String[] arrayIn){
            for (String value : arrayIn) {
                System.out.print(value + ",");
            }
        }

        public static void arrayOutput( double[] arrayIn){
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







