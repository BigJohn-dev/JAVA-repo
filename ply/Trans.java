import java.util.Scanner;
public class Trans{
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int total = 0;
	int gradeCounter = 0;

	while (gradeCounter <= 9) {
	System.out.print("Enter grade: ");
	int grade = input.nextInt();
	total += grade;
	gradeCounter += 5;
}
	int average = total / 10;
	System.out.printf("%nTotal of all grade s %d%n", total);
	System.out.printf("Class average is %d%n", average);
}
}