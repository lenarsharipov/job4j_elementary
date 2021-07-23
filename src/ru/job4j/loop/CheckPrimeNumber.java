package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int counter = 2; counter < number; counter++) {
            if (number % counter == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}