import java.util.Scanner;

public class computeNumbersDriver {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int numbers;
	do {
	System.out.print("Enter an integer, the input ends if it is 0: ");
	numbers = input.nextInt();
}
	while (numbers != 0);

	System.out.println(computeNumbers.positiveCountIn(numbers));
	System.out.println(computeNumbers.negativeCountIn(numbers));
	System.out.println(computeNumbers.totalSumIn(numbers));
	System.out.println(computeNumbers.averageIn(numbers));
}
}