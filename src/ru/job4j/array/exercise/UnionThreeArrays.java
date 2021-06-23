package ru.job4j.array.exercise;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[2 + middle.length / 2 + right.length / 2];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];

        for (int i = 1; i < rsl.length - 1; i++) {
            if (i % 2 != 0) {
                rsl[i] = right[i - 1];
            } else {
                rsl[i] = middle[i - 1];
            }
        }
        return rsl;
    }
}
