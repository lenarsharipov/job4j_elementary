package ru.job4j.array.exercise;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int length = 0;
        int[] array = new int[data.length * data.length];
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data.length; cell++) {
                if (row + cell == sum) {
                    data[row][cell] = 0;
                } else {
                    array[length] = data[row][cell];
                    length++;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}