import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int count = 1;
	while (count <= 7) {
	System.out.print("\nEnter a number from 0 - 6 to show a day of the week: ");
	int day = input.nextInt();

	if (day < 0 || day > 6) {
	System.out.print("Invalid input..");

}	else {
	switch (day) {
	case 0: System.out.println("Sunday"); break;
	case 1: System.out.println("Monday"); break;
	case 2: System.out.println("Tuesday"); break;
	case 3: System.out.println("Wednesday"); break;
	case 4: System.out.println("Thursday"); break;
	case 5: System.out.println("Friday"); break;
	case 6: System.out.println("Saturday"); break;
	}
}
	count += 1;
}

}
}