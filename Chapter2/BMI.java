import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter body weight: ");
	double Weight = input.nextDouble();

	System.out.print("Enter height: ");
	double Height = input.nextDouble();

	double bmi = Weight / Height * Height * 703;

	System.out.printf("BMI is %.2f", bmi);
}
}