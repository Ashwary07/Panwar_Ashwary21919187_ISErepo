package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DateUtility {
    public static int[] parseDate(String dateInput) {
        String[] parts = dateInput.split("-");
        return new int[] {Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])};
    }

    public static boolean isValidDate(int day, int month, int year) {
        return year >= 1901 && year <= 2024;
    }
}
