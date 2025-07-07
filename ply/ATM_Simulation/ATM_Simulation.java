public class ATM_Simulation {
	private double balance;

	public ATM_Simulation(double balance) {
		this.balance = 0.0;
}

	private void checkBalance() {
        return balance;
}

	private void withdraw(double amount) {
		if (amount <= 0) {
		return "Invalid amount. Please enter a positive value.";

}	else if (amount > balance) {
		return "Insufficient funds!";
} else {
		balance -= amount;
		return "Withdrawn: N" + amount;
		return "New balance: N" + balance;
}
}

	private void deposit(amount) {
		if (amount <= 0) {
		return "Invalid amount. Please enter a positive value.";
} else {
		balance += amount;
		return "Deposited: N" + amount;
		return "New balance: N" + balance;
}
}

}