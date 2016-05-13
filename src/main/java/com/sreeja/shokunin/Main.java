package com.sreeja.shokunin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome! Enter a time in the form hh:mm");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
			ValidTime validTime = TimeValidator.getValidTimeOrNull(input);
	        if (validTime == null) {
		        System.err.println("[ERR] Time must be in the form hh:mm. Try again!");
	        } else {
		        System.out.println(ClockFacePrinter.getClockAsString(validTime.getHourPosition(), validTime
				        .getMinutePosition()));
	        }
        }

    }
}
