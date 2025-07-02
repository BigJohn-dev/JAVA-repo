import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int items;

	System.out.print("Enter number of item(s) sold: ");
	items = input.nextInt();

	switch (items / 10) {
	case 0, 1: System.out.println(); {
	
	double num1 = (239.99 * 0.09) + 200;
	System.out.println("Your earnings " + num1); 
}break;

	case 2: System.out.println(); {
		
	double num1 = (129.75 * 0.09) + 200;
	System.out.println("Your earnings " + num1);
}break;
	case 3: System.out.println(); {
		
	double num1 = (99.95 * 0.09) + 200;
	System.out.println("Your earnings " + num1);
}break;

	case 4: System.out.println(); {
	
	double num1 = (350.89 * 0.09) + 200;
	System.out.println("Your earnings " + num1);
}break;

	default: System.out.println("...");

	}
}

}