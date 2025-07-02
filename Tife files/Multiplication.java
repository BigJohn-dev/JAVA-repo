import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int result = 0;

	System.out.print("Enter a positive integer: ");
	int integer = input.nextInt();

	System.out.println("\nMultiplication Table for " + integer + ":");

        for (int num = 1; num <= 20; num ++) {

            result = integer * num;
            System.out.println(integer + " x " + num + " = " + result);

}


}
}