package ru.job4j.array.exercise;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return left.length == 0 ? right : left;
        }
        return mergeTwoArrays(left, right);
    }

    public static int[] mergeTwoArrays(int[] left, int[] right) {
        int[] arrayTemp = Arrays.copyOf(left, left.length + right.length);
        int count = 0;
        for (int index = left.length; index < arrayTemp.length; index++) {
            arrayTemp[index] = right[count];
            count++;
        }

        count = 0;
        int[] array = new int[arrayTemp.length];
        for (int i = 0; i < arrayTemp.length; i++) {
            boolean isEqual = true;
            for (int j = 0; j < count; j++) {
                if (arrayTemp[i] == array[j]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                array[count] = arrayTemp[i];
                count++;
            }
        }
        return Arrays.copyOf(array, count);
    }
}