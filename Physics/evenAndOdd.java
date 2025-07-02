import java.util.Scanner;
public class evenAndOdd{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a set of Integers from 0 to 10: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	int num5 = input.nextInt();

	int even = 0;
	int odd = 0;

	if (num1 % 2 == 0){
	System.out.print(even + num1);
}	else {System.out.print(odd + num1);
}
	if (num2 % 2 == 0){
	System.out.print(even + num2);
}	else {System.out.print(odd + num2);
}
	if (num3 % 2 == 0){
	System.out.print(even + num3);
}	else {System.out.print(odd + num3);
}
	if (num4 % 2 == 0){
	System.out.print(even + num4);
}	else {System.out.print(odd + num4);
}
	if (num5 % 2 == 0){
	System.out.print(even + num5);
}	else {System.out.print(odd + num5);
}
	System.out.println("The sum of even numbers are: " + even);
	System.out.println("The sum of odd numbers are: " + odd);
}
}