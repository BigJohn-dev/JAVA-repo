// area of a regular polygon
import java.util.Scanner;

public class polygon {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("AREA OF A REGULAR POLYGON");

	System.out.print("Enter the number of sides: ");
	int n = input.nextInt();

	System.out.print("Enter the sides: ");
	double sides = input.nextDouble();

	double PI = 3.1412;

	double area = (n * (sides * sides)) / (4 * Math.tan(PI / n));

	System.out.println("The area of the polygon is " + area);
}
}