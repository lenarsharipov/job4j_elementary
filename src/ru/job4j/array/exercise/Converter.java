package ru.job4j.array.exercise;

import java.util.Arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
        }
        length = (int) Math.ceil(Math.sqrt(length));
        int[] arrayTemp = new int[length * length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTemp[count] = array[i][j];
                count++;
            }
        }
        int[][] rsl = new int[length][];
        count = 0;
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = Arrays.copyOfRange(arrayTemp, count, count + length);
            count += length;
        }
        return rsl;
    }
}