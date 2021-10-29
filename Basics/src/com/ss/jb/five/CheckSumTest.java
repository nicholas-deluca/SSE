package com.ss.jb.five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckSumTest {

	@Test
	void test() {
		CheckSum c = new CheckSum();
		int[] arr = {2,4,8};
		int[] arr2 = {1,2,4,8,1};
		int[] arr3 = {2,4,4,8};
		
		assertTrue(c.groupSumClump(0, arr, 10));
		assertTrue(c.groupSumClump(0, arr2, 14));
		assertFalse(c.groupSumClump(0, arr3, 14));
	}

}
