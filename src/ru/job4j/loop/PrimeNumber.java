package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int counter = 2; counter <= finish; counter++) {
            if (CheckPrimeNumber.check(counter)) {
                count++;
            }
        }
        return count;
    }
}