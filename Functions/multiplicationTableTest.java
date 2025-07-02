import java.util.Scanner;

public class multiplicationTableTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" __- MULTIPLICATION TABLE -__ ");
	System.out.println("************************************************");
	System.out.println("\n....customizing your multiplication table");

	System.out.print("\nEnter a number to start your multiplication table: ");
	int startNumber = input.nextInt();

	System.out.print("\nEnter a number as range for your multiplication table: ");
	int rangeNumber = input.nextInt();

	
	System.out.println(multiplicationTable.multiplicationOf(startNumber, rangeNumber));






}
} 