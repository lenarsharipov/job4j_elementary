package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        int i = 1;
        for (int row = 0; row < array.length; row++) {
            int j = 1;
            for (int cell = 0; cell < array.length; cell++) {
                array[row][cell] = i * j;
                System.out.println(array[row][cell]);
                j++;
            }
            i++;
        }
        return array;
    }
}