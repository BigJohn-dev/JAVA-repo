import java.util.Scanner;

public class MortgageCalculator {
	public static void main(String[] args) {
	

	System.out.println("\n__-- MORTGAGE CALCULATOR --__ ");
	System.out.println("*********************************");

	System.out.println("\n...the smarter way to mortgage planning...");

	Scanner input = new Scanner(System.in);

	System.out.println("\nWhat monthly payment can I comfortably afford?");

	int count = 1;

	while (count <= 1) {
	System.out.print("\nPress 5 to begin...");
	int start = input.nextInt();

	if (start == 5) {
	
	System.out.println("\n===============================");
	System.out.println("How much is your loan? ");
	double principal = input.nextDouble();

	System.out.println("===============================");
	System.out.println("What is the annual interest rate? ");
	double rate = input.nextDouble();

	System.out.println("===============================");
	System.out.println("How long to pay back your loan? ");
	double duration = input.nextDouble();

	double Rate = rate / 1200;
	double Duration = duration * 12;

	double top = principal * Rate * Math.pow(1 + Rate, Duration);
	double bottom = Math.pow(1 + Rate,Duration) - 1;
	
	double monthlyPay = top / bottom;

	System.out.println("===============================");
	System.out.printf("Your monthly payment is: $" + "%.2f", monthlyPay);
	System.out.println("\n===============================");


	System.out.println("\nNow you know....");
	System.out.println("Thank you for using our Mortgage Calculator. We hope it helped you plan with confidence.");
	
	count++;

}	else {
	System.out.println("Incorrect input!!");
}

}

}
}