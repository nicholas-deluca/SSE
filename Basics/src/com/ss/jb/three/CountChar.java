/**
 * This program counts how many times a character appears in a file. The character can be given as the first argument and the file
 * path as the second argument
 */
package com.ss.jb.three;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountChar {

	public static void main(String[] args) {
		if (args.length == 2) {
			try {
				File f = new File(args[1]);
				FileReader reader = new FileReader(f);
				
				int target = args[0].charAt(0), count = 0, curr;
				
				curr = reader.read();
				
				while (curr != -1) {
					if (curr == target) {
						count++;
					}
					curr = reader.read();
				}
				
				System.out.println("The character appeared " + count + " times");
			}
			catch (IOException e) {
				System.err.println("IOException Encountered");
				System.exit(0);
			}
		}
		else {
			System.out.println("Not enough arguments provided");
		}
	}

}
