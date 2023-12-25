package com.simsoft.bugtracker.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityClass1 {

    // Method to format dates
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    // Method to handle error logging
    public static void logError(String errorMessage) {
        // Implement error logging logic, e.g., writing errors to a log file
        System.err.println("Error: " + errorMessage);
    }

    // Other utility methods as needed
}
