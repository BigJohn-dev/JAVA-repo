import java.util.Scanner;
public class SmallestAndLargest {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter Second integer: ");
	int num2 = input.nextInt();

	System.out.print("Enter Third integer: ");
	int num3 = input.nextInt();

	int totalSumOfAllNumbers = num1 + num2 + num3;
	System.out.println(totalSumOfAllNumbers);

	int average = (num1 + num2 + num3) / 3;
	System.out.println(average);

	int product = num1 * num2 * num3;
	System.out.println(product);

	if(num1 < num2 && num1 < num3) {
	System.out.printf("Number one is the smallest", num1);
}
	if(num2 < num1 && num2 < num3) {
	System.out.printf("Number two is the smallest", num2);
}
	if(num3 < num1 && num3 < num2){
	System.out.printf("Number three is the smallest", num3);
}
	if(num1 > num2 && num1 > num3) {
	System.out.printf("Number one is the largest", num1);
}
	if(num2 > num1 && num2 > num3) {
	System.out.printf("Number two is the largest", num2);
}
	if(num3 > num1 && num3 > num2) {
	System.out.printf("Number three is the largest", num3);
}
}
}

