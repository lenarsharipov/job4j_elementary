package ru.job4j.array.exercise;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rslArray = new int[length][length];
        int count = 0;
        for (int i = 0; i < rslArray.length; i++) {
            for (int j = 0; j < rslArray.length; j++) {
                if (count == array.length) {
                    break;
                }
                rslArray[i][j] = array[count];
                count++;
            }
        }
        return rslArray;
    }
}