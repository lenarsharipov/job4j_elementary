package ru.job4j.array.exercise;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int min = 1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    break;
                }
                count++;
            }
            if (count > min) {
                min = count;
            }
            count = 1;
        }
        return min;
    }
}
