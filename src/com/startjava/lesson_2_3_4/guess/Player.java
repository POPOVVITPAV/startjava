package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    int[]  intArr = new int[10];
    private int count = 0;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getArrCopy() {
        int[] intArrCopy = Arrays.copyOf(intArr, count);
        for (int num : intArrCopy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int writeInArr(int playerNum) {
        intArr[count] = playerNum;
        count++;
        return count;
    }

    public void zeroingArray() {
        Arrays.fill(intArr, count);
    }
}
