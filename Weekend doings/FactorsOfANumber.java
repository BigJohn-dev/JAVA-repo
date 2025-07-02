<<<<<<< HEAD
import java.util.Scanner;

public class FactorsOfANumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println(" NUMBER FACTOR GENERATOR ");

	System.out.print("Enter a number:");
	int number = input.nextInt();

	
	for (int j = 1; j <= number; j++) {
	    if (number % j == 0) {
		System.out.print(j + " ");
	}
}

}
=======
import java.util.Scanner;

public class FactorsOfANumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println(" NUMBER FACTOR GENERATOR ");

	System.out.print("Enter a number:");
	int number = input.nextInt();

	
	for (int j = 1; j <= number; j++) {
	    if (number % j == 0) {
		System.out.print(j + " ");
	}
}

}
>>>>>>> 44b41c460fefc3f632c077ca5fbf018456b7c493
}