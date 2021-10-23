/**
 * This class takes arguments from the command line and displays the result of adding them
 */

package com.ss.jb.two;

/**
 * @author nickdeluca
 *
 */
public class AddValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initializing a float to hold the sum
		float sum = 0;
		
		/**
		 * For each argument passed in, tries to parse a float and then add it to the running sum.
		 * If the argument is not a number, the exception is caught and an error message is displayed
		 * before the program exits.
		 */
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Float.parseFloat(args[i]);
			}
			catch (NumberFormatException e){
				System.err.println("Argument '"+args[i]+"' is not a number.");
				System.exit(1);
			}
		}
		
		// Displays the final sum
		System.out.println(sum);
	}

}
