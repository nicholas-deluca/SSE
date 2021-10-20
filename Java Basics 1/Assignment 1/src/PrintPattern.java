
public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Controls how many lines of each pattern will be printed
		int numLines = 5;
		
		// Calls to the methods to print each pattern
		patternOne(numLines);
		patternTwo(numLines);
		patternThree(numLines);
		patternFour(numLines);
	}
	
	// Method that prints pattern one
	public static void patternOne(int numStars) {
		System.out.println("Pattern 1:\n");
		String output = "";
		
		// For each line of the pattern, adds a star to the output and prints the output
		for (int i = 0; i < numStars; i++) {
			output += "*";
			System.out.println(output);
		}	
	}
	
	// Method that prints pattern two
	public static void patternTwo(int numStars) {
		System.out.println("\nPattern 2:\n");
		
		// Builds the top line of the pattern as a string
		String output = "";
		for (int i = 0; i < numStars; i++) {
			output += "*";
		}
		
		// Removes one star from the output string each row that is printed
		for (int i = 0; i < numStars; i++) {
			System.out.println(output);
			output = output.substring(1);
		}
	}
	
	// Method that prints pattern three
	public static void patternThree(int lines) {
		System.out.println("\nPattern 3:\n");
		
		// Calculates the number of stars on the longest line and the index of the midpoint
		int numStars = (lines * 2) - 1;
		int midpoint = numStars/2;
		String output = "";
		
		// Inserts blank space up until the midpoint and then adds the star for the first line
		for (int i = 0; i < midpoint; i++) {
			output += " ";
		}
		output += "*";
		
		/* 
		 * Prints the current line of the pattern, then adds two stars for the next line.
		 * In order to keep the output centered, one leading whitespace is removed.
		 */
		for (int i = 0; i <= midpoint; i++) {
			System.out.println(output);
			output = output.substring(1) + "**";
		}
	}
	
	// Method that prints pattern four
	public static void patternFour(int lines) {
		System.out.println("\nPattern 4:\n");
		
		// Calculates the number of stars on the longest line and the index of the midpoint
		int numStars = (lines * 2) - 1;
		int midpoint = numStars/2;
		String output = "";
		
		// Builds the output string for the top line of the pattern, which is all stars
		for (int i = 0; i < numStars; i++) {
			output += "*";
		}
		
		/* 
		 * Prints the current line of the pattern, then for the next line two stars are removed
		 * from the end of the output string, and a leading whitespace is added to keep the output
		 * centered.
		 */
		for (int i = 0; i <= midpoint; i++) {
			System.out.println(output);
			output = " " + output.substring(0, numStars-(i+2));
		}
	}
}
