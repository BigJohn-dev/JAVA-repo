import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	//System.out.print("Enter a number: ");
	//int number2 = input.nextInt();


	Kata kata = new Kata();

	//System.out.println(Kata.evenAndOddNumberChecker(number));

	//System.out.println(Kata.isPrimeNumber(number));

	//System.out.println(Kata.subtractionOfInteger(number1, number2));

	//System.out.println(Kata.divisionOfInteger(number1, number2));

	//System.out.println(Kata.factorOfInteger(number));

	//System.out.println(Kata.squareOfInteger(number));

	System.out.println(Kata.factorialOfInteger(number));

	//System.out.println(Kata.squareOfInteger(number));
}



}