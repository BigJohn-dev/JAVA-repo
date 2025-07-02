public class bankApp {

	private String name;
	private String password;
	private String accountNumber;
	private double balance;

	public bankApp (String name, String password, String accountNumber, double balance){
		this.name = name;
		this.password = password;
		this.accountNumber = accountNumber;
		this.balance = balance;
}

	public String getAccountNumber() {
	return accountNumber;
}
	public String getAccountName() {
	return name;
}
	public double getAccountBalance() {
	return balance;
}
	
	public void deposit_money(double amount){
	if (amount > 0) {
	balance += amount;
	System.out.println("Deposited $" + amount " to account " + accountNumber);
}else {
	System.out.println("Invalid deposit amount or Invalid account number!!");
}
}
	public void withdraw_money(double amount){
	if(amount > 0) {
	balance -= amount;
	System.out.println("Withdraw $" + amount + ", current balance is $" + balance);
} else {	
	System.out.println("Invalid amount or Insuffient money");
}
}
	public double getBalance(){
	return balance;
}
	public void transfer_money(double amount){
	if(amount <= balance && amount > 0) {
	balance -= amount;
	System.out.println("Transfer sucessfull, New balance: " + balance);
} else {
	System.out.println("Invalid amount or Insuffient money!");
}
}
	public void displayAccountDetails() {
	System.out.println("Account name: " + name);
	System.out.println("Account number: " + accountNumber);
	System.out.println("Account balance: $" + balance);
}
	public Bank() {
	accounts = {};
} 
	public void createAccount(String name, String password, String accountNumber, double balance){
	BankAccount account = new BankAccountt(String name, String password, String accountNumber, double balance);
	accounts.append(account);
	System.out.println("Account created for " + name);
}

	public BankAccount recoverAccount (String accountNumber) {
	for(BanlAccount account: accounts) {
	  if (account.getAccountNumber().equals(accountNumber)) {
		return account;
}
}
	return "Account not found!";
}

	public void transfer(String accountNumber, String recipientAccount, double amount) {
	BankAccount accountNumber = recoverAccount(accountNumber);
	BankAccount recipientAccount = recoverAccount(recipientAccount);

	if (accountNumber != " " && reciepientAccount != " ") {
	if (accountNumber.withdraw_money(amount)) {
	recipientAccount.deposit_money(amount);
	System.out.println("Transfer Successfull, New balance: $" + balance);
}
} else {
	System.out.println("Transfer failed or account not found")
}
}
}





}