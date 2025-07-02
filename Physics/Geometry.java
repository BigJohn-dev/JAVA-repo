import java.util.Scanner;
public class Geometry{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first point of the triangle x1, y1: ");
	double x1 = input.nextDouble(),  y1 = input.nextDouble();

	System.out.println("Enter second point of the triangle x2, y2: ");
	double x2 = input.nextDouble(),  y2 = input.nextDouble();
	
	System.out.println("Enter third point of the triangle x3, y3: ");
	double x3 = input.nextDouble(),  y3 = input.nextDouble();

	double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
	double side3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
	
	double Sides = (side1 + side2 + side3) / 2;

	double Area = Sides * (Sides - side1) * (Sides - side2) * (Sides - side3);
	
	double finalArea = Math.sqrt(Area);

	System.out.printf("The area of the triangle is " + "%.1f", finalArea);
}
}
