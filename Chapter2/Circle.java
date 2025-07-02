import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the radius: ");
	int Radius = input.nextInt();
	
	System.out.print("Diameter: ");
	int diameter = Radius * 2;
	System.out.printf("%d\n", diameter);

	System.out.print("Circumference: ");
	double Circumference = 2 * 3.14159 * Radius;
	System.out.printf("%.2f\n", Circumference);

	System.out.print("Area: ");
	double area = 3.14159 * Radius * Radius;
	System.out.printf("%.2f\n", area);

}
}