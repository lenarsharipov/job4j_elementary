package ru.job4j.array.exercise;

public class RightShift {
    public static void shift(int[] nums, int count) {
        while (count > 0) {
            RightShift.shift(nums);
            count--;
        }
    }

    private static void shift(int[] nums) {
        int[] array = new int[nums.length];
        array[0] = nums[nums.length - 1];
        for (int index = 1; index < array.length; index++) {
            array[index] = nums[index - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = array[i];
        }
    }
}