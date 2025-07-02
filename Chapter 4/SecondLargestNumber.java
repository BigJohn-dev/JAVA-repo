import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int counter = 1;
	int largest = 0;
	int secLargest = 0;
	int number;

	System.out.println(" _- THE SECOND LARGEST -_");

	while (counter <= 10) {
	System.out.print("\nEnter a number: ");
	number = input.nextInt();
	counter++;

	if (number > largest) {
	secLargest = largest;
	largest = number;

}	else if (number != largest) {
	largest = secLargest;
	secLargest = number;
}

}
	System.out.println("\nThe largest number is: " + largest);
	System.out.println("The second largest number is: " + secLargest);



}


}