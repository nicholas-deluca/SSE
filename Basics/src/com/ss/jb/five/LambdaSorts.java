package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSorts {

	public LambdaSortsInt lngthSrt () {
		LambdaSortsInt srt = (lst) -> {
			Arrays.sort(lst, (a,b) -> b.length()-a.length());
		};
		return srt;
	}
	
	public LambdaSortsInt revLngth () {
		LambdaSortsInt srt = (lst) -> {
			Arrays.sort(lst, (a,b) -> a.length()-b.length());
		};
		return srt;
	}
	
	public LambdaSortsInt firstChar () {
		LambdaSortsInt srt = (lst) -> {
			Arrays.sort(lst, (a,b) -> a.toLowerCase().charAt(0)-b.toLowerCase().charAt(0));
		};
		return srt;
	}
	
	public LambdaSortsInt eFirst () {
		LambdaSortsInt srt = (lst) -> {
			Arrays.sort(lst, (a,b) -> a.toLowerCase().contains("e")? (b.toLowerCase().contains("e")? 0:-1):1);
		};
		return srt;
	}
	
	public LambdaSortsInt eFirstHelp () {
		LambdaSortsInt srt = (lst) -> {
			Arrays.sort(lst, (a,b) -> eSort(a,b));
		};
		return srt;
	}
	
	private static int eSort (String a, String b) {
		if (a.toLowerCase().contains("e")) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
