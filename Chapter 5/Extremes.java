import java.util.Scanner;

public class Extremes {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);

	System.out.println(" __- FINDING THE SUM OF THE TWO LARGEST NUMBERS -__ ");

	System.out.print("\nHow many numbers do you wish to input: ");
	int numberOfInput = input.nextInt();

	int largest = 0;
	int secondLargest = 0;
	int values = 0;

	for (int count = 1; count <= numberOfInput; count++) {
	System.out.print("Enter a number: ");
	values = input.nextInt();

	secondLargest = largest;

	if (values > largest) {
	largest = values;
}
	if (values < secondLargest && values != largest){
	secondLargest = values;
}
	
}
	int sumOfExtremes = largest + secondLargest;
	System.out.println("The sum of largest " + largest + " and second largest " + secondLargest + " is = " + sumOfExtremes);

}
}