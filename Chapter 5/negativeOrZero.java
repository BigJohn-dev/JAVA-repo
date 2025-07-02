import java.util.Scanner;

public class negativeOrZero {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number less than or equal to zero: ");
	int value = input.nextInt();

	if (value > 0) {
	System.out.println("Run the code again");

}	else {
	switch(value) {
	// cannot be converted to a boolean type
	//case value < 0: System.out.println("The integer value is negative");


	case 0: System.out.println("The integer value is zero");break;
}
}



}



}