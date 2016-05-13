package com.sreeja.shokunin;

import java.util.HashMap;
import java.util.Map;

public class ClockFacePrinter {

    private static final String BASIC_CLOCK_FACE =
            "       o\n" +
                    "   o       o\n" +
                    " o           o\n" +
                    "o      .      o\n" +
                    " o           o\n" +
                    "   o       o\n" +
                    "       o";

    private static final Map<Integer, Integer> clockNumberToStringIndexMapper = resolveMap();

    private static Map<Integer, Integer> resolveMap() {
        Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
        int lastKnownIndex = -1;
        for (int i = 0; i <= 11; i++) {
            lastKnownIndex = BASIC_CLOCK_FACE.indexOf("o", lastKnownIndex + 1);
            int clockHour = resolveClockNumberWhenTraversingClockFromLeftToRight(i);
            mapper.put(clockHour, lastKnownIndex);
        }
        return mapper;
    }

    public static String getClockAsString(int hourPosition, int minutePosition) {
        StringBuilder basicClock = new StringBuilder(BASIC_CLOCK_FACE);
        int hourCharPosition = clockNumberToStringIndexMapper.get(hourPosition);
        int minCharPosition = clockNumberToStringIndexMapper.get(minutePosition);
        if (hourCharPosition == minCharPosition) {
            return basicClock.replace(hourCharPosition, hourCharPosition + 1, "x").toString();
        }
        return basicClock.replace(hourCharPosition, hourCharPosition + 1, "h")
                .replace(minCharPosition, minCharPosition + 1, "m")
                .toString();
    }

    private static int resolveClockNumberWhenTraversingClockFromLeftToRight(int positionOfNumberInString) {
        return (positionOfNumberInString % 2) *
                (12 - (positionOfNumberInString + 1) / 2) +
                ((positionOfNumberInString + 1) % 2) *
                        (positionOfNumberInString / 2);
    }

}
