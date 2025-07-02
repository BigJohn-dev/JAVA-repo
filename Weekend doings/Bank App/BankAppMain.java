public class BankAppMain {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	bankApp account = new bankApp();

	String Menu = """
WELCOME TO JAVA BANK

1. Create an account
2. Login
3. Recover account
4. Exit
	"""
	System.out.println("Choose an option: ");
	int choice = input.nextInt();

	switch(choice){
		case 1:
			System.out.println("CREATE AN ACCOUNT");
			System.out.println("\n Enter full name: ");
			String name = input.next();
			System.out.println("\n Enter phone number: ");
			String accountNumber = input.next();
			System.out.println("Enter password: ");
			String password = input.next();
			account.createAccount(String name, String accountNumber, String password, double balance);break;
			
		case 2:
			System.out.println("LOGIN YOUR ACCOUNT");
			System.out.println("\nEnter account name: ");
			String name = input.next();
			System.out.println("Enter account number: ");
			String accountNumber = input.next();
			System.out.println("Enter password: ");
			String password = input.next();
			account.loginAccount(String name, String accountNumber, String password);break;
			
		case 3:
		case 4:



}










}
}