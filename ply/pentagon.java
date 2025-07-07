// Area of a pentagon
import java.util.Scanner;
public class pentagon {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	double PI = 3.1412;
	
	System.out.print("Enter the length from the center to a vertex: ");
	double length = input.nextDouble();

	double sides = 2 * length * (Math.sin(PI / 5));

	double area = (5 * (sides * sides)) / (4 * (Math.tan(PI / 5)));

	double result = area;

	System.out.println("The area of the pentagon is " + result);
}

}