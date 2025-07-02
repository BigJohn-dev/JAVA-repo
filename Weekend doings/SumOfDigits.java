import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer between 1 and  10,000: ");
	int userInput = input.nextInt();

	if (userInput <= 0 || userInput > 10_000) {
	System.out.println("Invalid input");

}	else {
	String number = Integer.toString(userInput);
	int inputLength = number.length();

	int total = 0;
	for (int count = 1; count <= inputLength; count++){
	total += userInput % 10;
	userInput /= 10;
}
	System.out.println("The sum of digits is: " + total);

}


}

}
