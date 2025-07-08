import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- TAX CALCULATOR -_ ");

	String name;
	int amount;
	int num;

	do {
	System.out.print("\nEnter your full name: ");
	name = input.next();

	System.out.println("\nWelcome " + name);

	System.out.print("Enter your earnings per year: ");
	amount = input.nextInt();

	if(amount <= 30000) {
	double taxRate = 0.15 * amount;
	System.out.print(name + ", your total tax is " + taxRate);
	System.out.println("\nEnsure you pay before due.");

}	else {
	double tax = 0.02 * amount;
	System.out.print(name + ", your total tax is " + tax);
	System.out.println("\nEnsure you pay before due.");
}
	System.out.println("\nEnter any number to continue or 0 to quit.");
	num = input.nextInt();
}
	while (num != 0);
	System.out.println("\nThank you for using our app.");


}

}