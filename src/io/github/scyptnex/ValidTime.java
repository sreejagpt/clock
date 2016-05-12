package io.github.scyptnex;

public class ValidTime {
	private int hourPosition;
	private int minutePosition;

	public ValidTime(String validTime) {
		String[] tmp = validTime.split(":");
		hourPosition = Integer.parseInt(tmp[0])%12;
		minutePosition = Integer.parseInt(tmp[1])/5;
	}

	public int getHourPosition() {
		return hourPosition;
	}

	public int getMinutePosition() {
		return minutePosition;
	}
}
