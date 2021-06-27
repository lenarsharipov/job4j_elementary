package ru.job4j.array.exercise;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int count = 0, zeros = 0;
        int[] arrayTemp = new int[data.length * data.length];
        for (int row = 0; row < data.length; row++) {
            for (int cell = 0; cell < data.length; cell++) {
                if (row + cell == sum) {
                    data[row][cell] = 0;
                    zeros++;
                }
                arrayTemp[count] = data[row][cell];
                count++;
            }
        }
        Arrays.sort(arrayTemp);
        return Arrays.copyOfRange(arrayTemp, zeros, arrayTemp.length);
    }
}