package ru.job4j.loop;

public class Palindrome {
    public static void isPalindrome(int numbers) {
        String input = String.valueOf(numbers);
        String reversed = new StringBuilder(input).reverse().toString();
        String rsl = input.equals(reversed) ? "Да" : "Нет";
        System.out.println(rsl);
    }
}
