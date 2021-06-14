package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        Float[] prices = new Float[40];

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "Jennifer Aniston";
        names[1] = "Courtney Cox";
        names[2] = "Lisa Kudrow";
        names[3] = "Matt LeBlanc";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}