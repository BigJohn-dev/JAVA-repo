import java.util.Scanner;
public class Years {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	int minutes = input.nextInt();

	int numberOfDays = minutes / 1440;
	int years = numberOfDays / 365;
	int days = numberOfDays % 365;
	System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
	
}
}