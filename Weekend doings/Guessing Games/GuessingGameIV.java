/** 
mystery game with loops but it should keep asking until the user guesses correctly. For every wrong 3 guesses, the app just change the mystery number (Notify the user that the mystery number has changed every time you change it). You should output congratulations and the number of guesses
*/


import java.util.Scanner;
import java.util.Random;

public class GuessingGameIV {
	public static void main(String[] args) {
	
	System.out.println(" _- WELCOME TO THE MYSTERY GAME -_");
	System.out.println("Enter any digit to guess what's on the Computer's mind...");

	Scanner input = new Scanner(System.in);
	Random picks = new Random();
	int mysteryNumber = picks.nextInt(0, 11);

	int control = 0;
	int guessCounter = 0;
	int wrongGuess = 0;

	while (control != 20) {
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