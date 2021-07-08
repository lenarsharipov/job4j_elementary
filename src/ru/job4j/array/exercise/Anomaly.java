/*
* Назовем аномалиями диапазоны индексов, на которых значения массива меньше или равно down
* или больше или равно up. Ваша задача найти все аномалии в массиве. Если в аномалии одно,
* число то нужно вернуть диапазон [i, i] - где i индекс числа выходящего за границы.
* Например,
* {5, 10, 15}, up = 16, down = 4 => аномалий нет
* {5, 4, 15}, up = 16, down = 4 => {{1, 1}}
* {5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
* {5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}*
 */

package ru.job4j.array.exercise;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int rowCount = 0;

        for (int i = 0; i < data.length; i++) {

            if (data[i] <= down || data[i] >= up) {
                result[rowCount][0] = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] <= down || data[j] >= up) {
                        result[rowCount][1] = j;
                    } else {
                        result[rowCount][1] = i;
                    }
                    rowCount++;
                    i = j;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, rowCount);
    }
}