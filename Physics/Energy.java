import java.util.Scanner;
public class Energy {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter an amount of water: ");
	double amountOfWater = input.nextDouble(); 

	System.out.print("Enter initial temperature: ");
	double temperature1 = input.nextDouble(); 

	System.out.print("Enter final temperature: ");
	double temperature2 = input.nextDouble(); 

	double Energy = amountOfWater * (temperature2 - temperature1) * 4184;

	System.out.println("The energy needed is: " + Energy);
}
}