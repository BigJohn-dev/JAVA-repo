/**
App that displays a sales contest won by the largest number input
initialize counter to 1
initialize largest to 0
declear a variable called number and assign it type int

while counter is less than or equal to 10
	prompt user to enter number of unit sold
	  recieve input using scanner
add one to counter

	if number is the largest
store number in the variable largest

diplay the largest number
display the number that won

end class

**/




import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int counter = 1;
	int largest = 0;
	int number;

	System.out.println(" _- THE SALES CONTEST -_");
	System.out.println("__the more you sell, the more you win...");

	while (counter <= 10) {

	System.out.print("\nEnter number of units you've sold: ");
	number = input.nextInt();
	counter++;

	if (number > largest) {
	largest = number;
	
}

}
	System.out.println("\nThe largest sales is: " + largest);
	System.out.println("The salesperson with the number " + largest + " units sold wins.");



}


}