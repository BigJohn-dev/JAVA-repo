<<<<<<< HEAD
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int factorial = 1;
	int res;
	
	do{
	System.out.print("\nEnter any number: ");
	int number = input.nextInt();

	if (number < 0) {
	System.out.println("Invalid input");

}	else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
}
	 System.out.println("The factorial of " + number + " is " + factorial);

	}
	System.out.print("\nEnter any number to continue or 0 to quit:");
	res = input.nextInt();
}
	while (res != 0);
	System.out.println("You quit");
}

=======
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int factorial = 1;
	int res;
	
	do{
	System.out.print("\nEnter any number: ");
	int number = input.nextInt();

	if (number < 0) {
	System.out.println("Invalid input");

}	else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
}
	 System.out.println("The factorial of " + number + " is " + factorial);

	}
	System.out.print("\nEnter any number to continue or 0 to quit:");
	res = input.nextInt();
}
	while (res != 0);
	System.out.println("You quit");
}

>>>>>>> 44b41c460fefc3f632c077ca5fbf018456b7c493
}