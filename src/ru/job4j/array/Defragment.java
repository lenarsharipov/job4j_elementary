package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        SwitchArray.swap(array, index, i);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}