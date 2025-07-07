import java.util.Scanner;
public class compare{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number: ");
	double firstNumber = input.nextDouble();

	System.out.println("Enter a number: ");
	double secondNumber = input.nextDouble();

	System.out.print("Enter a number: ");
	double thirdNumber = input.nextDouble();

	System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber);

}
}