package edu.byui.apj.week5;

import java.util.regex.*;

public class MathUtils {
    public static final double PI = 3.141592653589793;
    private static int instanceCount = 0;

    static {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static int square(int number) {
        return number * number;
    }

    public static String toHex(int number) {
        return Integer.toHexString(number);
    }

    public static String reversedNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        return stringBuilder.reverse().toString();
    }

    public static boolean isValidInteger(String input) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static String formatAsDate(long number) {
        String numStr = String.valueOf(number);

        if (!numStr.matches("\\d{8}")) {
            return "Invalid input: Must be a 8-digit number.";
        }
        StringBuilder formattedDate = new StringBuilder();
        formattedDate.append(numStr.substring(0, 4)).append("-")
                .append(numStr.substring(4, 6)).append("-")
                .append(numStr.substring(6, 8));

        return formattedDate.toString();
    }
}