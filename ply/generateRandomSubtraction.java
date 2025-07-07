import java.util.Scanner;

public class generateRandomSubtraction {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int count = 0;
	int correctCounter = 0;
	int wrongCounter = 0;
	int userInput;
	int answer;

for (int i = 1; i <= 10; i++) {

	int number1 = (int)(Math.random() * 100);
	int number2 = (int)(Math.random() * 50);

for (int j = 1; j <= 2; j++) {
	System.out.println("\nWhat is " + number1 + " - " + number2 + "?");
	userInput = input.nextInt();

	answer = number1 - number2;

	if (userInput == answer) {
	System.out.print("You are correct.");
	correctCounter += 1;

} else {
	System.out.print("You are wrong");
	wrongCounter += 1;
}
	count += 1;	
}
}
	System.out.println("You got " + correctc);






}

}