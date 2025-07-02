import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("Welcome to Rock, Paper and Scissor!!");

	System.out.println("_- NEW GAME -_");

	System.out.println("Enter any number to play: scissor (0), rock (1), paper (2): ");
	int number = input.nextInt();

	int scissor = 0;
	int rock = 1;
	int paper = 2;

	int randomPick = rand.nextInt(3);

	if (number == randomPick) {
	System.out.println("IT'S A TIE!!");
}
	if (number == scissor && randomPick == rock) {
	System.out.println("YOU LOOSE!! Play again!");
	System.out.println("Computer pick: " + randomPick);
}	
	if (number == scissor && randomPick == paper) {
	System.out.println("Hurray!! YOU WIN!!");
}
	if (number == rock && randomPick == scissor) {
	System.out.println("Hurray!! YOU WIN!!");
}
	if (number == rock && randomPick == paper) {
	System.out.println("YOU LOOSE!! Play again!");
}
	if (number == paper && randomPick == scissor) {
	System.out.println("YOU LOOSE!! Play again!");
}
	if (number == paper && randomPick == rock) {
	System.out.println("Hurray!! YOU WIN!!");
}
	
}
}