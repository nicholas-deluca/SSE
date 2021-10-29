/*
 * JB5 Date Time Coding Implementations
 */

package com.ss.jb.five;

import java.time.*;

public class DateTimeOps {

	public LocalDate lastThurs(LocalDate date) {
		int weekday = date.getDayOfWeek().getValue();
		if (weekday < 4) {
			weekday += 7;
		}
		return date.minusDays(weekday-4);
	}
	
	public int[] monthLengths (int year) {
		LocalDate d = LocalDate.of(year, 1, 1);
		int[] lengths = new int[12];
		for (int i = 0; i <= 11; i++) {
			d = d.withMonth(i+1);
			lengths[i] = d.lengthOfMonth();
		}
		return lengths;
	}
	
	public void allMondays(int month) {
		LocalDate d = LocalDate.now().withMonth(month).withDayOfMonth(1);
		int l = d.lengthOfMonth();
		for (int i = 1; i <= l; i++) {
			d = d.withDayOfMonth(i);
			if (d.getDayOfWeek().getValue() == 1) {
				System.out.println(d.toString());
			}
		}
	}
	
	public boolean friThirteen(LocalDate date) {
		return (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5);
	}
}
