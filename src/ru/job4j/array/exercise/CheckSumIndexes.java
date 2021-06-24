package ru.job4j.array.exercise;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                count++;
                if (i + j == sum) {
                    data[i][j] = 0;
                    count--;
                }
            }
        }
        int[] array = new int[count];
        count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != 0) {
                    array[count] = data[i][j];
                } else {
                    count--;
                }
                count++;
            }
        }
        return array;
    }
}
