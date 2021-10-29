/*
 * JB5 Assignment 2, Parts 2-4
 */

package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalOps {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 898, 48, 95, 1029);
		FunctionalOps f = new FunctionalOps();
		f.rightDigit(nums).forEach(n -> System.out.println(n));
		f.doubleVal(nums).forEach(n -> System.out.println(n));
		String s = "fkdfld";
		s = s.replaceAll("d", "");
		System.out.println(s);
		List<String> names = Arrays.asList("cdxcdx", "xx", "fdijcx", "xPIEx");
		f.removeX(names).forEach(n -> System.out.println(n));
	}
	
	public List<Integer> rightDigit(List<Integer> lst) {
		return lst.stream().map(i -> i%10).collect(Collectors.toList());
	}
	
	public List<Integer> doubleVal(List<Integer> lst) {
		return lst.stream().map(i -> i*2).collect(Collectors.toList());
	}
	
	public List<String> removeX(List<String> lst) {
		return lst.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
	}
}
