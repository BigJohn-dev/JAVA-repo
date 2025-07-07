// area of a hexagon
import java.util.Scanner;

public class hexagon {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("COMPUTING THE AREA OF AN HEXAGON");

	System.out.println("Enter the side: ");
	double side = input.nextDouble();

	double PI = 3.1412;
	double area = (6 * (side * side)) / (4 * (Math.tan(PI / 6)));

	System.out.println("The area of the hexagon is " + area);

} 
}