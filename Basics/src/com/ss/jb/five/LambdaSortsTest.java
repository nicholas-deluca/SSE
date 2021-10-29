package com.ss.jb.five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaSortsTest {


	@Test
	void testLngth() {
		String[] arr = {"pie", "pizza", "Car", "computer", "Laptop", "guitar", "sandwich"};
		String[] sorted = {"computer", "sandwich", "Laptop", "guitar", "pizza", "pie", "Car"};
		LambdaSorts getter = new LambdaSorts();
		LambdaSortsInt lngthSort = getter.lngthSrt();
		
		lngthSort.lbdaSrt(arr);
		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], sorted[i]);
		}
	}
	
	@Test
	void testRev() {
		String[] arr = {"pie", "pizza", "Car", "computer", "Laptop", "guitar", "sandwich"};
		String[] sorted = {"pie", "Car", "pizza", "Laptop", "guitar", "computer", "sandwich"};
		LambdaSorts getter = new LambdaSorts();
		LambdaSortsInt lngthSort = getter.revLngth();
		
		lngthSort.lbdaSrt(arr);
		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], sorted[i]);
		}
	}
	
	@Test
	void testFirst() {
		String[] arr = {"pie", "pizza", "Car", "computer", "Laptop", "guitar", "sandwich"};
		String[] sorted = {"Car", "computer", "guitar", "Laptop", "pie", "pizza", "sandwich"};
		LambdaSorts getter = new LambdaSorts();
		LambdaSortsInt lngthSort = getter.firstChar();
		
		lngthSort.lbdaSrt(arr);
		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], sorted[i]);
		}
	}
	
	@Test
	void testE() {
		String[] arr = {"pie", "pizza", "Car", "computer", "Laptop", "guitar", "sandwich"};
		String[] sorted = {"pie", "computer", "pizza", "Car", "Laptop", "guitar", "sandwich"};
		LambdaSorts getter = new LambdaSorts();
		LambdaSortsInt lngthSort = getter.eFirst();
		
		lngthSort.lbdaSrt(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" "+sorted[i]);
			assertEquals(arr[i], sorted[i]);
		}
		
		lngthSort = getter.eFirstHelp();
		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], sorted[i]);
		}
	}
}
