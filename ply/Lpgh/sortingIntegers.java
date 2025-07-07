import java.util.Scanner;
import java.util.Arrays;

public class sortingIntegers {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter first Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second Number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third Number: ");
	int thirdNumber = input.nextInt();


	int [] numbers = {firstNumber, secondNumber, thirdNumber};

	Arrays.sort(numbers);

	System.out.println(Arrays.toString(numbers));
}
}