package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int counter = 1; counter <= n; counter++) {
            result *= counter;
        }
        return result;
    }
}