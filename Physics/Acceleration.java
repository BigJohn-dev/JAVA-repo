import java.util.Scanner;
public class Acceleration{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a starting Velocity: ");
	double startingVelocity = input.nextDouble();

	System.out.print("Enter a ending Velocity: ");
	double endingVelocity = input.nextDouble();

	System.out.print("Enter time taken: ");
	double timeTaken = input.nextDouble();

	double Average = (startingVelocity - endingVelocity) / timeTaken;
	
	System.out.printf("The average acceleration is " + "%.4f", Average);
}
}