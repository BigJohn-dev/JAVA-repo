import java.util.Scanner;
public class indexCalculator {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter body weight: ");
	double Weight = input.nextDouble();

	System.out.print("Enter height: ");
	double Height = input.nextDouble();

	System.out.print("BMI is ");

	double BMI = (Weight / (Height * Height)) * 703;
	System.out.printf("%.2f", BMI);

}
}