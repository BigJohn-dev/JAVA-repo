import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;
	
	System.out.print("Enter any number or -1 to quit: ");
	int number = input.nextInt();

	if (number < 0) {
	System.out.println("Invalid inputs were entered.");

}	else {
	while (number != -1) {
	
	if (number > largest) {
	largest = number;
}	
	if (number < smallest) {
	smallest = number;
}
	
	System.out.print("Enter any number or 0 to quit: ");
	number = input.nextInt();

}
	
	System.out.println("\nThe smallest number entered: " + smallest);
	System.out.println("The largest number entered: " + largest);

}


}

}