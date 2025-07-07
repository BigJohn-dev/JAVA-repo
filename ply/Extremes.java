import java.util.Scanner;

public class Extremes {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.println("How many values do you want to input? ");
	int num = input.nextInt();

	int number = 0;
	int minimum = number;
	int maximum = number;

	for (int count = 1; count <= num; count++) {

	System.out.print("Enter a number: ");
	number = input.nextInt();
}
	if (number > maximum) {
	maximum = number;

}	if (number < minimum) {
	minimum += number;

}
	System.out.println("The maximum number is " + maximum);
	System.out.println("The minimum number is " + minimum);

	int sumValue = maximum + minimum;
	System.out.println("The sum of minimum and maximum numbers is " + sumValue);
}


}