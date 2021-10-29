/*
 * JB5 Assignment 2 Part 1
 */
package com.ss.jb.five;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumOperations {

	public static void main(String[] args) {
		NumOperations inst = new NumOperations();
		
		Scanner reader = new Scanner(System.in);
		int numOps = reader.nextInt();
		int[] ops = new int[numOps];
		int[] vals = new int[numOps];
		for (int i = 0; i < numOps; i++) {
			try {
				ops[i] = reader.nextInt();
				vals[i] = reader.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid Input. Enter integers only");
				System.exit(0);
			}
		}
		
		PerformOperation oper;
		
		for (int i = 0; i < numOps; i++) {
			if (ops[i] == 1) {
				oper = inst.isOdd();
				if (oper.intOp(vals[i])) {
					System.out.println("ODD");
				}
				else {
					System.out.println("EVEN");
				}
			}
			else if (ops[i] == 2) {
				oper = inst.isPrime();
				if (oper.intOp(vals[i])) {
					System.out.println("PRIME");
				}
				else {
					System.out.println("COMPOSITE");
				}
			}
			else if (ops[i] == 3) {
				oper = inst.isPalindrome();
				if (oper.intOp(vals[i])) {
					System.out.println("PALINDROME");
				}
				else {
					System.out.println("NOT PALINDROME");
				}
			}
			else {
				System.out.println("Invalid operation input: " + ops[i]);
			}
		}
	}
	
	public PerformOperation isOdd() {
		PerformOperation op = (num) -> {
			return num % 2 != 0;
		};
		return op;
	}
	
	public PerformOperation isPrime() {
		PerformOperation op = (num) -> {
			if (num < 2) {
				return false;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		};
		return op;
	}
	
	public PerformOperation isPalindrome() {
		PerformOperation op = (num) -> {
			List<Integer> digits = new ArrayList<>();
			while (num != 0) {
				digits.add(num%10);
				num = num/10;
			}
			int s = digits.size();
			for (int i = 0; i < s/2; i++) {
				if (digits.get(i) != digits.get(s-(i+1))) {
					return false;
				}
			}
			return true;
		};
		return op;
	}
}
