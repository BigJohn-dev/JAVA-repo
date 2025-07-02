import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a positive integer: ");
	int num = input.nextInt();

	if (num < 0){
	System.out.println("Only positive integers. Try again!!");

}	else {
	for (int i = 2; i <= num / 2; i++){	
	
	if (num % i == 0 || num <= 1) {
	System.out.println("Number entered is not a prime number.");
	break;

}	else {
	 System.out.println(num + " is a prime number.");
}

	}
}

		
}

}

	

