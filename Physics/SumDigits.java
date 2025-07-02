import java.util.Scanner;
public class SumDigits {
	public static void main(String[] args) { 

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integers from 0 to 1000: ");
	int numbers = input.nextInt();

	if (numbers < 0 && numbers > 1000) {
	System.out.print("Invalid input, try again");
}	else { 
	int num1 = numbers / 100;
	int num2 = (numbers % 100) / 10;
	int num3 = numbers % 10;

	int sum = num1 + num2 + num3;
	System.out.println("The sum of digits in the inputed integer is: " + sum);
}
	
}
}