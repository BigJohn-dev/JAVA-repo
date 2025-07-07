import java.util.Scanner;
public class New {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your grade: ");
	int grade = input.nextInt();
	
	if (grade >= 60) {
	System.out.println("Passed");
}
else { System.out.println("Failed");
	System.out.println("Write the course again.");
}
	System.out.println(grade >= 70 ? "Passed" : "Failed");
}
}