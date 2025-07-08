import java.util.Scanner;

public class Gasmileage {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- GAS MILEAGE CALCULATOR -_ ");

	int choice;
	double mileage = 0;
	double total = 0.0;

	do {
	System.out.print("\nEnter total miles you've driven: ");
	int miles = input.nextInt();

	System.out.print("Enter total gallon(s) used: ");
	int gallon = input.nextInt();

	if (miles < 0 || gallon < 0) {
	System.out.println("Invalid input.., check your values.");

}	else {
	mileage = miles / gallon;
	System.out.print(mileage +" mpg");

	total += mileage;
}

	System.out.println("\nEnter any number to use calculator or (1) to exit: ");
	choice = input.nextInt();
}	
	while(choice != 1);
	
	if(choice == 1) {
	System.out.print("\nTotal mpg till date is " + total + "mpg");

}	else {
	System.out.print("\nTotal till date is " + total + "mpg");
}
	

}
}