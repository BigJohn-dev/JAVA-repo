//Mystery game app. End game if the user has 20 wrong guesses.

import java.util.Scanner;
import java.util.Random;

public class GuessingGameV {
	public static void main(String[] args) {
	
	System.out.println(" _- WELCOME TO THE MYSTERY GAME -_");
	System.out.println("Enter any digit to guess what's on the Computer's mind...");

	Scanner input = new Scanner(System.in);
	Random picks = new Random();
	int mysteryNumber = picks.nextInt(0, 11);

	int control = 0;
	int guessCounter = 0;
	int wrongGuess = 0;

	while (wrongGuess != 20) {
	System.out.print("\nEnter the mystery number: ");
	int number = input.nextInt();
	mysteryNumber = picks.nextInt(0, 11);

	guessCounter = guessCounter + 1;
	
	if (number == mysteryNumber) {
	System.out.println("Congratulations!! You guessed right.");
	System.out.println("Total guesses: " + guessCounter);

}	else {
	System.out.println("Invalid guess!! Try again.");
	wrongGuess = wrongGuess + 1;
}
	if (wrongGuess % 3 == 0) {
	mysteryNumber = picks.nextInt(0, 11);
	System.out.println("\nThe mystery number has changed!");
}
	
	}	
	
}
}