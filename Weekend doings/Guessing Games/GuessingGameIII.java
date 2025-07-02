//mystery game with loops but it should keep asking until the user guesses correctly. You should output congratulations and the number of guesses

import java.util.Scanner;

public class GuessingGameIII {
	public static void main(String[] args) {
	
	System.out.println(" _- WELCOME TO THE MYSTERY GAME -_");
	System.out.println("Enter any digit to guess what's on the Computer's mind...");

	Scanner input = new Scanner(System.in);

	int mysteryNumber = 7;
	int number = 0;
	int control = 0;

	while (number != mysteryNumber) {
	System.out.println("\nEnter the mystery number: ");
	number = input.nextInt();

	control = control + 1;

	if (number != mysteryNumber) {
	System.out.println("Invalid guess!!");
}
	}

	System.out.println("Congratulations!! You guessed right.");
	System.out.println("Total guesses: " + control);

	
}
}