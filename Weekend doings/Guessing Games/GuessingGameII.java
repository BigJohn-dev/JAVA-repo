//mystery game with loops this time

import java.util.Scanner;
import java.util.Random;

public class GuessingGameII {
	public static void main(String[] args) {
	
	System.out.println(" _- WELCOME TO GUESSING GAME -_");
	System.out.println("Enter any digit to guess what's on the Computer's mind...");

	int guess = 0;
	int control = 0;

	Scanner input = new Scanner(System.in);
	Random picks = new Random();
	int randomPicks = picks.nextInt(0, 11);

	
	while (control != 5) {
	System.out.println("Enter any number from 1 to 10: ");
	int number = input.nextInt();

	control = control + 1;

	if (number < 0 || number > 10 ) {
	System.out.println("Invalid input");

}	else if (number == randomPicks) {
	System.out.println("You are correct!!");

}	else if(number < randomPicks) {
	System.out.println("Number is too low");

}	else if(number > randomPicks) {
	System.out.println("Number is too high");
}	

	}

}
}