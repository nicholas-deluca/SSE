package com.ss.jb.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TraverseDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
