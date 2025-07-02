import java.util.Scanner;
public class Population {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter  World's current population: ");
	long currentPopulation = input.nextLong();

	System.out.print("Enter population growth rate: ");
	double rate = input.nextDouble();

	double growthRate = rate / 100;

	double totalFirstPopulation = (long)currentPopulation * (1 + growthRate);
	double totalSecondPopulation = (long)totalFirstPopulation * (1 + growthRate);
	double totalThirdPopulation = (long)totalSecondPopulation * (1 + growthRate);
	double totalFourthPopulation = (long)totalThirdPopulation * (1 + growthRate);
	double totalFifthPopulation = (long)totalFourthPopulation * (1 + growthRate);

	System.out.println("The population after 1year is " + totalFirstPopulation);

	System.out.println("The population after 2years is " + totalSecondPopulation);

	System.out.println("The population after 3years is " + totalThirdPopulation);

	System.out.println("The population after 4years is " + totalFourthPopulation);

	System.out.println("The population after 5years is " + totalFifthPopulation);
}
}