package ru.job4j.array.exercise;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][str.length];
        int commonCount = 1;
        int temp = 0;

        for (int row = 0; row < result.length; row++) {
            int rowLength = 0;
            for (int cell = temp; cell < str.length; cell++) {
                if (str[cell] != c) {
                    result[row][rowLength] = str[cell];
                    rowLength++;
                } else {
                    temp = cell + 1;
                    commonCount++;
                    break;
                }
            }
            result[row] = Arrays.copyOf(result[row], rowLength);
        }
        return Arrays.copyOf(result, commonCount);
    }
}