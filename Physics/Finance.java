import java.util.Scanner;
public class Finance {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance: ");
	int balance = input.nextInt();

	System.out.print("Enter Annual interest rate: ");
	double interestRate = input.nextDouble();

	double interest = balance * (interestRate / 1200);
	System.out.printf("The interest is " + "%.5f", interest);
}
}