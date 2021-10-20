import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a scanner for user input and a random number generator
		Scanner reader = new Scanner(System.in);
		Random r = new Random();
		
		// Generating a random number for the user to guess
		int target = r.nextInt(100) + 1;
		
		/*
		 *  Creating variables to track the number of valid guesses, the most recent valid guess,
		 *  and whether the most recent valid guess was within 10 of the target
		 */
		int numGuesses = 0, guess;
		boolean withinTen = false;
		
		/*
		 *  Loop for the user to continue guessing as long as they have used less than 5 valid
		 *  guesses and have not guessed within 10 of the target.
		 */
		while (numGuesses < 5 && !withinTen) {
			System.out.println("Guess a number from 1 to 100: ");
			
			// Checks that the user has entered an integer
			if (reader.hasNextInt()) {
				guess = reader.nextInt();
				
				// Checks if the user's guess was in the valid range
				if (guess < 1 || guess > 100) {
					System.out.println("The number must be between 1 and 100. Try again.\n");
				}
				/*
				 *  If the guess was valid, checks if it is within 10 of the target and logs it as
				 *  a valid guess using the counter
				 */
				else {
					if (Math.abs(target - guess) <= 10) {
						withinTen = true;
					}
					numGuesses++;
				}
			}
			// If the user did not enter enter an integer, a message is displayed and scanner clears
			else {
				System.out.println("You didn't enter a number. Try again.\n");
				reader.next();
			}
		}
		
		// Displays a message if the user was close enough
		if (withinTen) {
			System.out.println("Correct, the number was " + target);
		}
		// Displays a message if the user was not close enough in the given number of guesses
		else {
			System.out.println("Sorry, the target number was " + target);
		}
	}

}
