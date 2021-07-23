package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Размер вложенного массива равен: " + numbers[index].length);
        }
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int index = 0; index < array.length; index++) {
                System.out.println("Размер вложенного массива равен: " + array[index].length);
        }
    }
}