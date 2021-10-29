/*
 * JB5 Assignment 2 Part 5
 */
package com.ss.jb.five;

public class CheckSum {

	public static void main(String[] args) {
		CheckSum c = new CheckSum();
		int[] arr = {2,4,8};
		System.out.println(c.groupSumClump(0, arr, 10));
		int[] arr2 = {1,2,4,8,1};
		System.out.println(c.groupSumClump(0, arr2, 14));
		int[] arr3 = {2,4,4,8};
		System.out.println(c.groupSumClump(0, arr3, 14));
	}
	
	public boolean groupSumClump(int curr, int[] nums, int sum) {
		if (curr >= nums.length) {
			return sum == 0;
		}
		
		int add = 0, i = curr; 
		
		while (i < nums.length && nums[i] == nums[curr]) {
			add += nums[i];
			i++;
		}
		
		return groupSumClump(i, nums, sum) || groupSumClump(i, nums, sum-add);
	}
}
