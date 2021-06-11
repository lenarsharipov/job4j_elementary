package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int x = 1; x <= finish; x++) {
            if (CheckPrimeNumber.check(x)) {
                count++;
            }
        }
        return count;
    }
}