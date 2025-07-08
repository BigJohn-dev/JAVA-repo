import java.util.Scanner;

public class Validating {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- THE OBEDIENCE GAME -_ ");
	System.out.println(" ");

	int number;

	do {
	System.out.print("Enter any number or 1 and 2 to quit: ");
	number = input.nextInt();

	if (number != 1 && number != 2) {
	System.out.println("...seriouly");
}

}
	while (number != 1 && number != 2);
	
	System.out.println("Good decision...");
}

}