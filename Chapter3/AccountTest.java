import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account(0.0);
        System.out.print("Enter choice:\nDeposit\nWithdrawal");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount:\n$");
            double amount = input.nextDouble();
            System.out.println(account.deposit(amount));
        } else if (choice == 2) {
            System.out.print("Enter amount:\n$");
            double amount = input.nextDouble();
            System.out.println(account.withdraw(amount));
        }
    }
}
