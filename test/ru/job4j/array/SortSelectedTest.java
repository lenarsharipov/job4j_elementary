package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {16, -15, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-15, 0, 16};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5Elements() {
        int[] data = new int[] {99, 0, -55, 5, -111};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-111, -55, 0, 5, 99};
        Assert.assertArrayEquals(expected, result);
    }
}