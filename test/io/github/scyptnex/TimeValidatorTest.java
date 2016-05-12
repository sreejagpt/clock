package io.github.scyptnex;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

@SuppressWarnings("Duplicates")
public class TimeValidatorTest {

	@Test
	public void validTimeShouldHaveSemicolon() {
		String goodTime = "12:35";
		String badTime = "139";
		assertNotNull(TimeValidator.getValidTimeOrNull(goodTime));
		assertNull(TimeValidator.getValidTimeOrNull(badTime));
	}

	@Test
	public void validTimeHasTwoPositiveNumbers() {
		String noNums = "a4:2z";
		String bothNums = "04:23";
		assertNull(TimeValidator.getValidTimeOrNull(noNums));
		assertNotNull(TimeValidator.getValidTimeOrNull(bothNums));
	}

	@Test
	public void hoursBetween00and23() {
		String goodHour = "00";
		String badHour = "25";
		String mins = ":23";
		assertNull(TimeValidator.getValidTimeOrNull(badHour + mins));
		assertNotNull(TimeValidator.getValidTimeOrNull(goodHour + mins));
	}

	@Test
	public void minsBetween00and59() {
		String goodMin = "01";
		String badMin = "60";
		String hours = "12:";
		assertNull(TimeValidator.getValidTimeOrNull(hours + badMin));
		assertNotNull(TimeValidator.getValidTimeOrNull(hours + goodMin));
	}
}
