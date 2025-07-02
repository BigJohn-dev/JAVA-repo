import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int control;

	do {
	System.out.print("\nEnter an integer value: ");
	int num1 = input.nextInt();

	System.out.print("Enter another integer: ");
	int num2 = input.nextInt();

	int sum = num1 + num2;
	System.out.println("The sum is = " + sum);

	System.out.print("Enter any number to continue or (0) to quit: ");
	control = input.nextInt();
}	
	while (control != 0); 
	
	System.out.println("You quit");	
		
}
}