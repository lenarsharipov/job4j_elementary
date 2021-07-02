package ru.job4j.array.exercise;

public class NoConsecutive {
    public static int find(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index + 1] != data[index] + 1) {
                return data[index + 1];
            }
        }
        return -1;
    }
}
