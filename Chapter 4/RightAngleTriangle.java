import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- CREATING A RIGHT-ANGLED TRIANGLE -_ ");

	System.out.print("Enter a the length of the base of a triangle: ");
	int num = input.nextInt();

	if (num <= 0 || num > 10) {
	System.out.println("Invalid input!!");

}	else {
	for (int b = 1; b <= num; b++) {
		for (int c = 1; c <= b; c++) { 
		System.out.print("* ");
	}
	System.out.println();
   }

}

}

}