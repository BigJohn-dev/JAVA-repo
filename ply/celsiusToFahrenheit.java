import java.util.Scanner;
public class celsiusToFahrenheit {

	public static String fahrenheit(double celsius) {
	double fahrenheit = (9.0 / 5.0) * celsius + 32;
	return celsius + " Celsius is " + fahrenheit + " Fahrenheit";
}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a degree in celsius: ");
	double degree = input.nextDouble();

	System.out.println(fahrenheit(degree));
}

}