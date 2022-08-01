package ru.job4j.array.exercise;

import java.util.Arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int[] rsl = new int[array.length];
        for (int i = 0; i < column; i++) {
            rsl[i] = array[row][i + 1];
        }
        for (int i = column; i < rsl.length - 1; i++) {
            rsl[i + 1] = array[row][i];
        }
        int[] rslColumn = new int[array.length];
        for (int i = 0; i < rslColumn.length; i++) {
            rslColumn[i] = array[i][column];
        }
        int[] rslTwo = new int[rslColumn.length];

        for (int i = 0; i < row; i++) {
            rslTwo[i] = rslColumn[i + 1];
        }
        for (int i = row; i < rsl.length - 1; i++) {
            rslTwo[i + 1] = rslColumn[i];
        }

        for (int i = 0; i < array.length; i++) {
            array[i][column] = rslTwo[i];
        }
        array[row] = Arrays.copyOf(rsl, rsl.length);
    }
}