package com.sreeja.shokunin;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClockFacePrinterTest {

	@Test
	public void printClockAsCircleWhenHourAndMinutePositionsSame() {
		String clockFace = ClockFacePrinter.getClockAsString(0, 0);
		assertThat(clockFace, is("       x\n" +
				"   o       o\n" +
				" o           o\n" +
				"o      .      o\n" +
				" o           o\n" +
				"   o       o\n" +
				"       o"));
	}

	@Test
	public void printClockAsCircleWhenHourAndMinutePositionsDiffer() {
		String clockFace = ClockFacePrinter.getClockAsString(9, 3);
		assertThat(clockFace, is("       o\n" +
				"   o       o\n" +
				" o           o\n" +
				"h      .      m\n" +
				" o           o\n" +
				"   o       o\n" +
				"       o"));
	}

}
