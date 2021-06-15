package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas13Then0() {
        int[] data = {-12, 5, 16, 89, 1023, 0, 13};
        int el = 13;
        int result = FindLoop.indexOf(data, el);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas0ThenNeg1() {
        int[] data = {1, -15, 55, 61, -9999};
        int el = 0;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind13() {
        int[] data = new int[] {17, 13, -55, 1111, 77, 13};
        int el = 13;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind0() {
        int[] data = new int[] {0, 15, -65, 1, 62, 888, -9, 555, 87, 5556};
        int el = 0;
        int start = 2;
        int finish = 9;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}