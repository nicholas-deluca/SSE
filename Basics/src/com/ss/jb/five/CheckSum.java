/*
 * JB5 Assignment 2 Part 5
 */
package com.ss.jb.five;

public class CheckSum {
	
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
