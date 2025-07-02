import java.util.Scanner;

public class GreaterSum {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int count = 0;
	int sum = 0;
	int num;

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	do {
	System.out.print("Enter a number: ");
	num = input.nextInt();

	sum = sum + num;
}
	while (sum > number);

	if(sum > number) {
	System.out.println("Sum of numbers is " + sum);
	}
	System.out.println("Sum of numbers is greater than first number input");
}


}