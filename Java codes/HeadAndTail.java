import java.util.Scanner;
import java.util.Random;
public class HeadAndTail {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	Random rand = new Random();

	System.out.println(" _-_ WELCOME TO THE GAME _-_ ");
	System.out.println("	_- NEW GAME -_");

	System.out.println("Enter any number to play: Head(0) and tail(1): ");
	int anyNum = input.nextInt();
	
	int Head = 0;
	int Tail = 1;

	int randomPick = rand.nextInt(2);

	if (anyNum > 2) {
	System.out.println("Invalid input!!");

}	else if (anyNum == randomPick) {
	System.out.println("YOU WIN!!");
	System.out.println("Computer pick: " + randomPick);

}	else System.out.println("YOU LOOSE!!");
	
}
}

	