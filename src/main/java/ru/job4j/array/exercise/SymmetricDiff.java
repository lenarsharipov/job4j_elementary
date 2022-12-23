package ru.job4j.array.exercise;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] arrayTemp = Arrays.copyOf(left, left.length + right.length);
        System.arraycopy(right, 0, arrayTemp, left.length, right.length);
        int[] array = new int[arrayTemp.length];
        int count = 0;
        for (int i = 0; i < arrayTemp.length; i++) {
            boolean isEqual = false;
            for (int j = 0; j < arrayTemp.length; j++) {
                if (i == j) {
                    continue;
                } else if (arrayTemp[i] == arrayTemp[j]) {
                    isEqual = true;
                    break;
                }
            }
            if (!isEqual) {
                array[count] = arrayTemp[i];
                count++;
            }
        }
        return Arrays.copyOf(array, count);
    }
}