import java.util.Scanner;
import java.util.Arrays;
public class arrayTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the element of array: ");
	int arrayNumbers = input.nextInt();

	int[] array = new int[arrayNumbers];

	for(int count = 0; count < array.length; count++) {

	System.out.print("\nEnter a number: ");
	int number = input.nextInt();

	array[count] = number;		
}
	for(int counter = 0; counter < array.length; counter++) {
	System.out.print(array[counter] + " ");
}


	//System.out.println(ArrayKata.maximumIn(array));
	
	//System.out.println(ArrayKata.minimumIn(array));

	//System.out.println(ArrayKata.sumOf(array));

	//System.out.println(ArrayKata.sumOfEvenNumbersIn(array));

	//System.out.println(ArrayKata.sumOfOddNumbersIn(array));

	//System.out.println(ArrayKata.maximumAndMinimumOf(array));

	//System.out.println(ArrayKata.noOfOddNumbersIn(array));

	//System.out.println(ArrayKata.noOfEvenNumbersIn(array));

	//System.out.println(ArrayKata.evenNumbersIn(array));

	//System.out.println(ArrayKata.oddNumbersIn(array));
	
	System.out.println(ArrayKata.squareNumbersIn(array));











	


	
	
	
}

}