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
        int [] array2 = new int [10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        arrayOutput(array2);
        int sum = 1;
        for (int value : array2) {
//            (value == 0 || value == 9)? "webwer":"evhervbeb";
            sum *= value;
        }
        System.out.println(sum);
    }

    public static void arrayOutput(int[] arrayIn) {
        for (int value : arrayIn) {
            System.out.print(value + " ");
        }
    }
}