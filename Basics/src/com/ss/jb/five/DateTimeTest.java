package com.ss.jb.five;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DateTimeTest {

	@Test
	void testThurs() {
		LocalDate day = LocalDate.now();
		LocalDate thurs = LocalDate.of(2021, 10, 28);
		
		DateTimeOps oper = new DateTimeOps();
		
		assertEquals(oper.lastThurs(day), thurs);
	}

	@Test
	void testMonths() {
		LocalDate day = LocalDate.now();
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		DateTimeOps oper = new DateTimeOps();
		int[] result = oper.monthLengths(2021);
		
		for (int i = 0; i < 12; i++) {
			assertEquals(arr[i], result[i]);
		}
	}
	
	@Test
	void testFri() {
		LocalDate day = LocalDate.now();
		LocalDate fri = LocalDate.of(2021, 8, 13);
		
		DateTimeOps oper = new DateTimeOps();
		
		assertFalse(oper.friThirteen(day));
		assertTrue(oper.friThirteen(fri));
	}
}
