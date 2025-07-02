import java.util.Scanner;
public class Maths{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNum = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNum = input.nextInt();

	if (firstNum > secondNum) {
	System.out.printf("The largest number is: " + "%d\n", firstNum);
}	else System.out.printf("The largest number is: " + "%d\n", secondNum);

	if (firstNum == secondNum) {
	System.out.printf("Same values results 0");
}
	if (firstNum % 6 == 0) {
	System.out.printf("The smallest number is: " + "%d", firstNum);
}	else System.out.printf("The smallest number is: " + "%d", secondNum);


}
}