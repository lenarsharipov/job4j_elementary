/*
* 49. Симметрическая разность множеств
* Симметрическая разность - это такая операция, когда в результирующее множество
* попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в другом множествах.
* Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
* Например,
* {1}, {2} => {1, 2}
* {1, 2}, {2, 3} => {1, 3}
* {1}, {} => {1}
 */

/* Мой алгоритм
* 1. Создать новый массив arrayTemp с длинной - left.length + right.length.
* 2. Скопировать элементы из двух массивов в массив 'arrayTemp'.
* 3. Создать пустой массив 'array' с длинной arrayTemp.length.
* 4. Создать счётчик 'count', который будет выполнять функцию индекса для массива 'array',
*    а также функцию подсчета длины окончательного массива.
* 4. Создать вложенный цикл for с переключателем isEqual = true, в котором будет проверяться
*    каждый элемент массива 'arrayTemp' на его наличие одновременно в массивах 'length' and 'right'.
* 5. При наличии элемента в массивах 'length' and 'right' прервать выполнение цикла без
*    увеличения переменной count.
* 6. При отсутсвии проверяемого элемента в массивах 'left' and 'right', установить переключатель isEqual
*    в положение false, записать значение элемента в ячейку массива 'array' с индексом count и
*    увеличить count на 1.
* 7. После выполнения циклов вернуть новый массив при помощи метода 'Arrays.copyOf', используя источником
*    масиив 'array' и значение 'count' длинной нового массива.
 */

package ru.job4j.array.exercise;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] arrayTemp = Arrays.copyOf(left, left.length + right.length);
        System.arraycopy(right, 0, arrayTemp, left.length, right.length);
        int[] array = new int[arrayTemp.length];
        int count = 0;
        for (int i = 0; i < arrayTemp.length; i++) {
            boolean isEqual = false;
            for (int j = 0; j < arrayTemp.length; j++) {
                if (i == j) {
                    continue;
                } else if (arrayTemp[i] == arrayTemp[j]) {
                    isEqual = true;
                    break;
                }
            }
            if (!isEqual) {
                array[count] = arrayTemp[i];
                count++;
            }
        }
        return Arrays.copyOf(array, count);
    }
}