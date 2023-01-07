package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        int symbol;
        boolean result;
        char[] array = name.toCharArray();
        if (name.isEmpty()) {
            return false;
        }
        if (!isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < array.length; i++) {
            symbol = name.codePointAt(i);
            if (!isSpecialSymbol(symbol)
                && !isUpperLatinLetter(symbol)
                    && !isLowerLatinLetter(symbol)
                        && !Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
