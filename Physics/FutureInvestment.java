import java.util.Scanner;
public class FutureInvestment {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter investment amount: ");
	double investment = input.nextDouble();

	System.out.print("Enter interest rate: ");
	double interestRate = input.nextDouble();

	System.out.print("Enter number of years: ");
	double years = input.nextDouble();

	double value = investment * Math.pow((1 + interestRate / 100), (years * 12));
	System.out.printf("Accumulated value is $" + value);
}
}