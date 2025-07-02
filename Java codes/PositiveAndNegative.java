import java.util.Scanner;
public class PositiveAndNegative {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an Integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter another Integer: ");
	int num2 = input.nextInt();

	int multiply = num1 * num2;
	
	System.out.printf("The answer is: " + "%d", multiply);
}
}