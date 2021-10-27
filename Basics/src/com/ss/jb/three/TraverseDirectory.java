/**
 * This program recursively finds and lists all the files and subdirectories within a directory specified at the command line
 */
package com.ss.jb.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TraverseDirectory {

	public static void main(String[] args) {
		if (args.length > 0) {
			try {
				Files.walk(Paths.get(args[0])).forEach(System.out::println);
			}
			catch (IOException e) {
				System.err.println("IOException Encountered");
				System.exit(0);
			}
		}
		else {
			System.out.println("No path specified");
		}
	}

}
