package ru.job4j.array.exercise;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int rowCount = 0;

        for (int i = 0; i < data.length; i++) {

            if (data[i] <= down || data[i] >= up) {
                result[rowCount][0] = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] <= down || data[j] >= up) {
                        result[rowCount][1] = j;
                    } else {
                        result[rowCount][1] = i;
                    }
                    rowCount++;
                    i = j;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, rowCount);
    }
}