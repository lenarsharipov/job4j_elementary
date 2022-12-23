package ru.job4j.array.exercise;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckSumIndexesTest {
    @Test
    public void collectNewArray() {
        int[][] data = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 3);
        int[] expected = {1, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 16};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVarious() {
        int[][] data = {
                {-57,   2,  3,   -16},
                {5,    88,  7,  -999},
                {9,  -155,  11,   90},
                {665,   1,   3,    2}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 3);
        int[] expected = {-57, 2, 3, 5, 88, -999, 9, 11, 90, 1, 3, 2};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVer2() {
        int[][] data = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 4);
        int[] expected = {1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 14, 15, 16, 18, 19, 20, 22, 23, 24, 25};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVer3() {
        int[][] data = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 0);
        int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVer4() {
        int[][] data = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 3);
        int[] expected = {1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVer5() {
        int[][] data = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, -1);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVer6() {
        int[][] data = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 7);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 25};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArrayVer7() {
        int[][] data = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 100);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        assertThat(rsl, is(expected));
    }
}