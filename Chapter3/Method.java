import java.sql.SQLOutput;

public class Method {
    private String name;
    private double balance;

    public Method(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBalance() {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) balance += depositAmount;
        System.out.println("Invalid deposit amount");
    }
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdraw successful");
        } else {System.out.println("Invalid withdraw amount");}
    }

}
