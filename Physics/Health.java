import java.util.Scanner;
public class Health {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your Weight: ");
	double Weight = input.nextDouble();

	System.out.print("Enter your Height: ");
	double Height = input.nextDouble();

	double BMI = (Weight / (Height * Height)) * 703;
	System.out.printf("BMI is " + "%.4f", BMI);
}
}