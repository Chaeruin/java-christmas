package christmas.utils;

import christmas.enums.ErrorMessage;

public class InputValidator {

    public static boolean isValidIntDate(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_DATE_NUMBER.getErrorMessage());
        }
        return true;
    }

    public static boolean isValidOrderInput(String input) {
        String[] inputParse = input.replaceAll("-", ",").split(",");
        try {
            if (inputParse.length % 2 != 0) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
            }
            for (int i = 1; i < inputParse.length; i += 2) {
                Integer.parseInt(inputParse[i]);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
        }
        return true;
    }

    public static boolean isNotDuplicateMenu(String input) {
        String[] inputParse = input.replaceAll("-", ",").split(",");
        for (int i = 0; i < inputParse.length; i += 2) {
            for (int j = i + 2; j < inputParse.length; j += 2) {
                compareTo(inputParse[i], inputParse[j]);
            }
        }
        return true;
    }

    public static void compareTo(String one, String two) {
        if (one.equals(two)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
        }
    }


}
