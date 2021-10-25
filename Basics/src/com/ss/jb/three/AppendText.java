package com.ss.jb.three;

import java.io.*;

public class AppendText {

	public static void main(String[] args) {
		if (args.length > 0 && args[0] != null) {
			try {
				File f = new File(args[0]);
				FileWriter fw = new FileWriter(f, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				pw.println("This file was edited by a Java application.");
				pw.flush();
				pw.close();
			}
			catch (IOException e) {
				System.err.println("IOException Encountered");
				System.exit(0);
			}
		}
	}

}
