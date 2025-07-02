import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your first integer: ");
	int firstInteger = input.nextInt();

	System.out.print("Enter your second integer: ");
	int secondInteger = input.nextInt();

	int squareOfFirstInteger = firstInteger * firstInteger;
	System.out.println(squareOfFirstInteger);

	int squareOfSecondInteger = secondInteger * secondInteger;
	System.out.println(squareOfSecondInteger);

	int totalSumOfSquares = squareOfFirstInteger + squareOfSecondInteger;
	System.out.println(totalSumOfSquares);

	int totalDifferenceOfTheSquare = squareOfFirstInteger - squareOfSecondInteger;
	System.out.println(totalDifferenceOfTheSquare);

	}
}