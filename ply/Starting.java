import java.util.Scanner;

public class Starting {
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Integer: ");
	int Number1 = input.nextInt();

	System.out.print("Enter Second Integer: ");
	int Number2 = input.nextInt();

	System.out.print("Enter Third integer: ");
	int Number3 = input.nextInt();

	System.out.print(Number1 + Number2);

	System.out.print(Number3 - Number2);

	if (Number1 == Number3) {
	System.out.print(Number3 == Number2);
	}
}
}