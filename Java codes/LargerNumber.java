import java.util.Scanner;
public class LargerNumber { 
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("The order 1st < 2nd < 3rd ");

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	System.out.print("The result is: ");
	if (firstNumber < secondNumber && secondNumber < thirdNumber) {
	System.out.print("true");
}	else System.out.print("flase");

}
}