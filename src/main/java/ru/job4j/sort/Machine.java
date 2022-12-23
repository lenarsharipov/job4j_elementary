package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money = money - price;
        for (int coinValue : coins) {
            while (money - coinValue >= 0) {
                money = money - coinValue;
                result[size] = coinValue;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}