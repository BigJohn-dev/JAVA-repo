import java.util.Scanner;
public class Driving {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter driving distance: ");
	double distance = input.nextDouble();

	System.out.print("Enter miles per gallon: ");
	double mpg = input.nextDouble();

	System.out.print("Enter price per gallon: ");
	double ppg = input.nextDouble();

	double totalCost = distance / mpg * ppg;
	
	System.out.printf("The cost of driving is $" + "%.2f", totalCost);
}
}