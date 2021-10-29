/*
 * JB5 Assignment 2, Parts 2-4
 */

package com.ss.jb.five;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalOps {
	
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
