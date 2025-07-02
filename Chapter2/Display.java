import java.util.Scanner;
public class Display {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int b = input.nextInt();

	System.out.print("Enter another integer: ");
	int c = input.nextInt();
	
	int a = b * c;
	System.out.print(a);
	//This is a program performs a simple payroll calculation.
	
}
}