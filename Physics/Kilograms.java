import java.util.Scanner;
public class kilograms {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds: ");
	double pounds = input.nextDouble();

	double Kilograms = pounds * 0.454;
	
	System.out.print(pounds + " pounds is " + Kilograms + " kilograms");
}
}