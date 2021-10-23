/**
 * This class randomly populates a 2D array, then finds the max value and displays it's position
 * in the array
 */

package com.ss.jb.two;

import java.util.Random;

/**
 * @author nickdeluca
 */
public class FindMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[][] arr = new int[10][10];
		
		// Randomly populates the array and displays it for the user
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				arr[x][y] = rand.nextInt(100);
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
		
		// Sets the max and its position to the first value in the array
		int max = arr[0][0];
		int[] pos = {0,0};
		
		/*
		 *  Traverses the array and checks if each value is greater than the max found.
		 *  If a value is greater, the max is updated and the position of the max is set to the
		 *  current position.
		 */
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				if (arr[x][y] > max) {
					max = arr[x][y];
					pos[0] = x;
					pos[1] = y;
				}
			}
		}
		
		// Prints the max value and its indices
		System.out.println("\nMax Value: "+max+"\tIndex: ["+pos[0]+"]["+pos[1]+"]");
	}

}
