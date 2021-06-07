package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int expected = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passed = expected == outEuro;
        System.out.println(inEuro + " rubles are " + expected + ". Test result : " + passed);

        int inUsd = 180;
        expected = 3;
        int outUsd = Converter.rubleToDollar(inUsd);
        passed = expected == outUsd;
        System.out.println(inUsd + " rubles are " + expected + ". Test result: " + passed);
    }
}