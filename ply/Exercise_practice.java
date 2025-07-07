import java.util.Scanner;
//import java.util.Arrays;
public class Exercise_practice {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of element for your array: ");
	int n = input.nextInt();

	if (n < 1 || n > 20) {
	System.out.println("\nInvalid array length");

} else {
	int [] array = new int [n];

	for (int count = 1; count < array.length; count++) {

	System.out.print("Enter the array's element values: ");
	int numbersInArray = input.nextInt();

	array[count] = numbersInArray;
}
	for (int counter = 1; counter < array.length; counter++){
	System.out.print(array[counter] + " ");  
}

}
	
}
}