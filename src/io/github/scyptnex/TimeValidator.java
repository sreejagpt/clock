package io.github.scyptnex;

public class TimeValidator {
	public static boolean isValid(String time) {
		if (time.matches("^[0-9]{2}:[0-9]{2}$")){
			String[] parts = time.split(":");
			return Integer.parseInt(parts[0]) <= 23
					&& Integer.parseInt(parts[1]) <= 59;
		}
		return false;
	}
}
