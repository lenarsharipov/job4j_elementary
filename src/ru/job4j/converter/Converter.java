package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;

    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int usd = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + usd + " usd.");
    }
}