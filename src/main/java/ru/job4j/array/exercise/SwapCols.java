package ru.job4j.array.exercise;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        for (int index = 0; index < data.length; index++) {
            int temp = data[index][src];
            data[index][src] = data[index][dst];
            data[index][dst] = temp;
        }
    }
}
