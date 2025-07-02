import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number; 
	int occur = 0; 
	int largest = Integer.MIN_VALUE; 
	int count = 0; 
	
	do {
	System.out.print("Enter number: ");
	number = input.nextInt();

	if (number > largest) {
	largest = number;
	occur = 1;
	
}	else if (number == largest) {
	occur++;
}

}	
	while(number != count);

	System.out.println("The largest number is: " + largest);
	System.out.println("The occurrence of the number is: " + occur);

	
	

}
}