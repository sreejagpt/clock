package io.github.scyptnex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidTimeTest {
	@Test
	public void hasValidHourAndMinuteValues() {
		ValidTime validTime = new ValidTime("08:45");
		assertThat(validTime.getHourPosition(), is(8));
		assertThat(validTime.getMinutePosition(), is(9));
	}

	@Test
	public void minutesShouldRoundDown() {
		ValidTime validTime = new ValidTime("12:23");
		assertThat(validTime.getMinutePosition(), is(4));
	}

	@Test
	public void hoursShouldRoundDown() {
		ValidTime twelveOClock = new ValidTime("12:00");
		assertThat(twelveOClock.getHourPosition(), is(0));
		ValidTime minuteToMidnight = new ValidTime("23:59");
		assertThat(minuteToMidnight.getHourPosition(), is(11));
	}
}