package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int hold = 0;

        for (int x = 1; x <= number; x++) {
            if (number % x == 0) {
                hold++;
            }
            if (hold > 2 || number == 1) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}