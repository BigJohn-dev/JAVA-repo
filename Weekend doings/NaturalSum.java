import java.util.Scanner;

public class NaturalSum {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int number = 10;
	int add = 0;

	System.out.print("Enter a number: ");
	number = input.nextInt();

	for (int i = 1; i <= number; i++) {
	add = add + i;
}
	System.out.print("The sum is = " + add);
}

}