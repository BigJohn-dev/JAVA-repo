import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" __- FINDING THE FACTORIAL -__ ");

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number < 0) {
	System.out.println("Negative integers has no factorial");

}	else {
	int factorial = 1;	
	for (int counter = 1; counter <= number; counter++) {
	factorial *= counter;
}
	System.out.println("The factorial of " + number + " is " + factorial);
}


}
}