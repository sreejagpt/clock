package io.github.scyptnex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("Duplicates")
public class TimeValidatorTest {

	@Test
	public void validTimeShouldHaveSemicolon() {
		String goodTime = "12:35";
		String badTime = "139";
		assertTrue(TimeValidator.isValid(goodTime));
		assertFalse(TimeValidator.isValid(badTime));
	}

	@Test
	public void validTimeHasTwoPositiveNumbers() {
		String noNums = "a4:2z";
		String bothNums = "04:23";
		assertFalse(TimeValidator.isValid(noNums));
		assertTrue(TimeValidator.isValid(bothNums));
	}

	@Test
	public void hoursBetween00and23() {
		String goodHour = "00";
		String badHour = "25";
		String mins = ":23";
		assertFalse(TimeValidator.isValid(badHour + mins));
		assertTrue(TimeValidator.isValid(goodHour + mins));
	}

	@Test
	public void minsBetween00and59() {
		String goodMin = "01";
		String badMin = "60";
		String hours = "12:";
		assertFalse(TimeValidator.isValid(hours + badMin));
		assertTrue(TimeValidator.isValid(hours + goodMin));
	}
}
