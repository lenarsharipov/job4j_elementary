package ru.job4j.array.exercise;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        }
        int[] arrayTemp = Arrays.copyOf(left, left.length + right.length);
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    break;
                } else {
                    arrayTemp[count] = left[i];
                    count++;
                }
            }
        }
        return Arrays.copyOf(arrayTemp, count);
    }
}