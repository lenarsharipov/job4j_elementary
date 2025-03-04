package ru.job4j.array.exercise;

import java.util.Arrays;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = (int) Math.ceil(Math.sqrt(array.length));
        int[] array2 = Arrays.copyOf(array, length * length);
        int[][] rsl = new int[length][];
        int count = 0;
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = Arrays.copyOfRange(array2, count, count + length);
            count += length;
        }
        return rsl;
    }
}