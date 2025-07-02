import java.util.Scanner;
public class RunwayLength {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter speed: ");
	int Speed = input.nextInt();

	System.out.print("Enter acceleration: ");
	double Acceleration = input.nextDouble();

	double length = (Speed * Speed) / (2 * Acceleration);
	System.out.printf("The minimun runway length for this airplane is " + "%.3f", length);
}
}