import java.util.Scanner;
public class Assuming {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a value for x: ");
	int x = input.nextInt();

	System.out.println("Enter a value for y: ");
	int y = input.nextInt();

	System.out.printf("x = %d%n", x + 5);
	//this displays the value of x + 5

	System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
	//this displays 5 times 1
	
	System.out.printf("x is %d and y is %d", x, y );
	//this displsys the value of x and y

	System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );
	/*this displays that the sum of x and y is not equal to the multiplication of x and y*/
}
}