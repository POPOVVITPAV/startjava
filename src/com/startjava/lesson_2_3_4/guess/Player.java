package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, count);
    }

    public int getCount() {
        return count;
    }

    public void addNum(int num) {
        enteredNums[count] = num;
        count++;
    }

    public void reset() {
        Arrays.fill(enteredNums, 0, count, 0);
        count = 0;
    }
}
