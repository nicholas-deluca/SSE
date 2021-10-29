/*
 * JB5 Assignment 1, parts 2 & 3
 */
package com.ss.jb.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.ss.jb.five.LambdaSorts;
public class StreamOps {

	public static void main(String[] args) {
		List<Integer> numbs = new ArrayList<>();
		int c=1;
		while(c<=10) {
			numbs.add(c++);
		}
		StreamOps str = new StreamOps();
		System.out.println(str.numList(numbs));
		LambdaSorts l = new LambdaSorts();
		
		List<String> names = Arrays.asList("Nick", "Austin", "paul", "taylor", "amy", "and", "andy", "car");
		str.aThree(names).forEach(n -> System.out.println(n));
	}

	public String numList(List<Integer> lst) {
		if (lst.isEmpty()) {
			return "";
		}
		return lst.stream().map(ele -> numParity(ele)).reduce("", (tot,ele) -> tot+","+ele).substring(1);
	}
	
	private String numParity(int i) {
		String result;
		if (i % 2 == 0) {
			result = "e"+i;
		}
		else {
			result = "o"+i;
		}
		return result;
	}
	
	public List<String> aThree (List<String> lst) {
		return lst.stream().filter(ele -> ele.charAt(0)=='a' && ele.length()==3).collect(Collectors.toList());
	}
}
