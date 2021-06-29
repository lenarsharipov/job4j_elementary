/*
* 48. Разность множеств
* Разность множеств это операция при которой в результирующее множество
* попадают элементы из первого множества, но только если их нет во втором множестве.
* Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов.
* Например,
* {1}, {2} => {1}
* {1}, {1} => {}
* {1, 2}, {2} => {1}
* {1}, {} => {1}
 */
package ru.job4j.array.exercise;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        }
        int[] arrayTemp = Arrays.copyOf(left, left.length + right.length);
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    break;
                } else {
                    arrayTemp[count] = left[i];
                    count++;
                }
            }
        }
        return Arrays.copyOf(arrayTemp, count);
    }
}