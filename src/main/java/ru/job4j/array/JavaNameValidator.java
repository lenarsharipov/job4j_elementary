package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()
                || Character.isDigit(name.charAt(0))
                || Character.isUpperCase(name.charAt(0))) {
            return false;
        }

        boolean valid = true;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!isSpecialSymbol(code)
                    && !isUpperLatinLetter(code)
                    && !isLowerLatinLetter(code)
                    && !Character.isDigit(code)) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 96 && code < 123;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 64 && code < 91;
    }
}