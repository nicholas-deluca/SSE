/*
 * JB5 Date Time Coding Implementations
 */

package com.ss.jb.five;

import java.time.*;

public class DateTimeOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate bday = LocalDate.now();
		System.out.print(bday.getDayOfWeek());
		DateTimeOps d = new DateTimeOps();
		bday = bday.withDayOfMonth(23);
		System.out.println(d.lastThurs(bday).toString());
		bday = LocalDate.of(2019, 1, 1);
		System.out.println(bday.toString());
		int [] l = d.monthLengths(2020);
		for (int i: l) {
			System.out.println(i);
		}
		d.allMondays(10);
		System.out.println(d.friThirteen(bday));
		bday = LocalDate.of(2020, 11, 13);
		System.out.println(d.friThirteen(bday));
	}

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
