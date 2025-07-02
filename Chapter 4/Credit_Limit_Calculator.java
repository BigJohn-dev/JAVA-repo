import java.util.Scanner;

public class Credit_Limit_Calculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter account number: ");
	String accountNumber = input.next();

	System.out.println("Enter balance at the beginning of the month: ");
	int beginningBalance = input.nextInt();

	System.out.println("Enter total of all items charged this month: ");
	int Charges = input.nextInt();

	System.out.println("Enter total of all credits applied to this account this month: ");
	int credits = input.nextInt();
	
	System.out.println("Enter credit limit: ");
	int creditLimit = input.nextInt();

	int newBalance = beginningBalance + Charges - credits;

	System.out.println("Your new balance is N" + newBalance);

	if (newBalance > creditLimit) {
	System.out.println("Credit limit exceeded");

}	else {
	System.out.println("Credit limit is not exceeded");
}

}


}