import java.util.Scanner;
public class IntegersMaths{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	int sum = number1 + number2;
	int product = number1 * number2;
	int average = (number1 + number2) / 2;
	int distance = number1 - number2;

	System.out.printf("Sum of two numbers: " + "%d\n", sum);
	System.out.printf("Product of two numbers: " + "%d\n", product);
	System.out.printf("Average of two numbers: " + "%d\n", average);
	System.out.printf("Distance of two numbers: " + "%d\n", distance);

	if (number1 > number2) {
	System.out.printf("Max number: " + "%d\n", number1);
	System.out.printf("Min number: " + "%d\n", number2);

}	else if (number1 < number2) {
	System.out.printf("Max number: " + "%d\n", number2);
	System.out.printf("Min number: " + "%d\n", number1);
	}
}
}