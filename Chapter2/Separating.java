import java.util.Scanner;
public class Separating{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter any 5-digit number: ");
	int Digits = input.nextInt();

	int original = Digits / 10000;
	int num1 = (Digits / 10000) % 10;

	int num = (Digits / 1000);
	int num2 = (Digits / 1000) % 10;

	int numb = (Digits / 100);
	int num3 = (Digits / 100) % 10;

	int numbe = (Digits / 10);
	int num4 = (Digits / 10) % 10;

	int number = (Digits / 1);
	int num5 = (Digits / 1) % 10;

	System.out.print(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
 	
}
}