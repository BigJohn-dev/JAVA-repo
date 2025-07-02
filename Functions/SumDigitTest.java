import java.util.Scanner;

public class SumDigitTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer between 1 and  10,000: ");
	int userInput = input.nextInt();

	System.out.println(sumDigit.sumValueOf(userInput));

}
}