import java.util.Scanner;
public class Question {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Integer: ");
	int Num1 = input.nextInt();

	System.out.print("\n" + "Enter Second Integer: ");
	int Num2 = input.nextInt();

	System.out.println("\n" + "Square of the Integers: ");
	System.out.println(Num1 * Num1);
	System.out.println(Num2 * Num2);

	System.out.println("\n" + "Sum of the Suqares: ");
	System.out.println(Num1 * Num1 + Num1 * Num1);
	System.out.println(Num2 * Num2 + Num2 * Num2);

	System.out.println("\n" + "Subtraction of Squares: ");
	System.out.println(Num1 * Num1 - Num1 * Num1);
	System.out.println(Num2 * Num2 - Num2 * Num2);

	System.out.println("\n" + "First Square minus Second Square: ");
	System.out.println(Num1 * Num1 - Num2 * Num2);	
}
}