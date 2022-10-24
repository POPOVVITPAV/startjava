package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numArray = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] copyArr() {
        int[] arrCopy = Arrays.copyOf(numArray, count);
        return arrCopy;
    }

    public int getCount() {
        return count;
    }

    public void addNum(int num) {
        numArray[count] = num;
        count++;
    }

    public void reset() {
        Arrays.fill(numArray, 0, count, 0);
        count = 0;
    }

}
