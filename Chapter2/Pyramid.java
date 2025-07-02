import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter estimated number of stones used: ");
	long numberOfStones = input.nextLong();

	System.out.print("Enter average weight of a stone: ");
	double weightPerStone = input.nextDouble();

	System.out.print("Enter number of year used in construction: ");
	int yearsToBuild = input.nextInt();

	double totalWeight = numberOfStones * weightPerStone;
        double weightPerYear = totalWeight / yearsToBuild;
        double weightPerHour = totalWeight / (yearsToBuild * 365 * 24);
        double weightPerMinute = totalWeight / (yearsToBuild * 365 * 24 * 60);

	 System.out.printf("Total weight: " + "%.2f" + "\n", totalWeight);
        System.out.printf("Weight built per year: " + "%.2f" + "\n", weightPerYear);
        System.out.printf("Weight built per hour: " + "%.2f" + "\n", weightPerHour);
        System.out.printf("Weight built per minute: " + "%.2f" + "\n", weightPerMinute);
}
}