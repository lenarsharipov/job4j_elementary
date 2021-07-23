package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int counter = start; counter <= finish; counter++) {
            sum = sum + counter;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int counter = start; counter <= finish; counter++) {
            if (counter % 2 == 0) {
                sum = sum + counter;
            }
        }
        return sum;
    }
}