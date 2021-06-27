package ru.job4j.array.exercise;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayInSquareArrayTest {
    @Test
    public void convertArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertArray3Elements() {
        int[] array = {1, 2, 3};
        int[][] expected = {{1, 2}, {3, 0}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayWithout0() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {0, 0, 0, 0}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayVer2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 0, 0}, {0, 0, 0, 0}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayVer3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {0, 0, 0, 0}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayVer4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 0, 0, 0}};
        int[][] rsl = ArrayInSquareArray.convertArray(array);
        assertThat(rsl, is(expected));
    }
}