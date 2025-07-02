import java.util.Scanner;

public class Comparator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	System.out.print("Enter another number: ");
	int number2 = input.nextInt();

	if (number == number2) {
	System.out.println("Since both numbers are equal, result is 0");

}	else if (number > number2) {
	System.out.println("Since first number is greater, result is 1");

}	else {
	System.out.println("Since second number is greater, result is -1");
} 



}
}