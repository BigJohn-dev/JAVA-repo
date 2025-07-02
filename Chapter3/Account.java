public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public String deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return "This is your balance " + balance;
    }
    public String withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            return "insufficient funds";
        }
        return "This is your balance " + balance;
    }
}
