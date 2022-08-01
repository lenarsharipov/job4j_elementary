package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.charAt(0) < 97 || name.charAt(0) > 122) {
            return false;
        }
        boolean valid = true;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (code < 36
                    || (code > 36 && code < 48)
                    || (code > 57 && code < 65)
                    || (code > 90 && code < 95)
                    || code == 96
                    || code > 122) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}