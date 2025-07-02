import java.util.Scanner;

public class Cryptography {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a four-digit number: ");
	int four = input.nextInt();

	int divi1 = (four / 1000) % 10;
	int sum1 = divi1 + 7;
	int rem11 = (sum1 / 10) % 10;

	int divi2 = (four / 100) % 10;
	int sum2 = divi2 + 7;
	int rem22 = (sum2 / 10) % 10;

	int divi3 = (four / 10) % 10;
	int sum3 = divi3 + 7;
	int rem33 = (sum3 / 10) % 10;

	int divi4 = (four / 1) % 10;
	int sum4 = divi4 + 7;
	int rem44 = (sum4 / 10) % 10;

	System.out.println(rem33 + " " + rem44 + " " + rem11 + " " + rem22);
}


}