package ru.job4j.array.exercise;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] array = new int[left.length * left.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                array[count] = Math.max(left[i][j], right[i][j]);
                count++;
            }
        }
        return array;
    }
}
