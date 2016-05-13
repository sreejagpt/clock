package com.sreeja.shokunin;

public class TimeValidator {
    public static ValidTime getValidTimeOrNull(String time) {
        if (time.matches("^[0-9]{2}:[0-9]{2}$")) {
            String[] parts = time.split(":");
            return timestampWithinBounds(parts[0], parts[1]) ? new ValidTime(time) : null;
        }
        return null;
    }

    private static boolean timestampWithinBounds(String hours, String minutes) {
        return Integer.parseInt(hours) <= 23
                && Integer.parseInt(minutes) <= 59;
    }
}
