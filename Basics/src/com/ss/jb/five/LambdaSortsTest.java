package com.ss.jb.five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaSortsTest {


	@Test
	void test() {
		String[] arr = {"pie", "pizza", "Car", "computer", "Laptop", "guitar", "sandwich"};
		String[] sorted = {"computer", "sandwich", "Laptop", "guitar", "pizza", "pie", "Car"};
		LambdaSorts getter = new LambdaSorts();
		LambdaSortsInt lngthSort = getter.lngthSrt();
		
		lngthSort.lbdaSrt(arr);
		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], sorted[i]);
		}
	}

}
