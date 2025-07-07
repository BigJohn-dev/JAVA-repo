import java.util.Scanner;
public class Monetary {
	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the Amount as a decimal number: ");
	double amount = input.nextDouble();

	int oneDollar = amount / 100;
	int Cents = (amount / 100) % 100;

	int Cent = amount / 25;
	int dimes = (amount / 25) % 25;

	int dimes = amount / 10;
	int Dimes = (amount / 10) % 10;

	int nickels = amount / 5;
	int pennies = (amount / 5) % 5;
	
	System.out.println("Your amount " + amount + "consists of");
 	System.out.println("    " + Dollars + " dollars");
 	System.out.println("    " + Cent + " quarters ");
 	System.out.println("    " + Dimes + " dimes");
 	System.out.println("    " + pennies + " pennies");
}
}