import java.util.Scanner;
public class Multiples {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Integer: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Integer: ");
	int secondNumber = input.nextInt();
	
	int numberTrippled = firstNumber * 3;
	int numberDoubled = secondNumber * 2;

	System.out.println(numberTrippled);
	System.out.println(numberDoubled);
	
	if (numberTrippled % 2 == 0) {
	System.out.print("Number trippled is a multiple of number doubled");
}	else if (numberTrippled % 2 != 0) {
	System.out.println("Number trippled is not a multiple of number doubled");
}
	System.out.print(numberTrippled / numberDoubled);
}
}