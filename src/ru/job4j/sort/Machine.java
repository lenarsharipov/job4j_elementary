package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int coinValue : coins) {
            while (money - coinValue >= 0) {
                money = money - coinValue;
                rsl[size] = coinValue;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}