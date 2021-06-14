package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int x = 0; x < array.length / 2; x++) {
            temp = array[x];
            array[x] = array[array.length - 1 - x];
            array[array.length - 1 - x] = temp;
        }
        return array;
    }
}