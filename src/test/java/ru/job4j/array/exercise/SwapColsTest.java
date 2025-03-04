package ru.job4j.array.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapColsTest {

    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SwapCols.swap(data, 0, 2);
        int[][] expected = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        assertArrayEquals(expected, data);
    }

    @Test
    public void testTwo() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SwapCols.swap(data, 1, 2);
        int[][] expected = {
                {1, 3, 2},
                {4, 6, 5},
                {7, 9, 8}
        };
        assertArrayEquals(expected, data);
    }

}