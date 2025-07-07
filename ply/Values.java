import java.util.Scanner;
public class Values{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter 5 numbers: ");
	double num1 = input.nextDouble();
	double num2 = input.nextDouble();
	double num3 = input.nextDouble(); 
	double num4 = input.nextDouble();
	double num5 = input.nextDouble();

	if (num1 > 0, num2 > 0 & num3 > 0 && num4 > 0 && num5){ System.out.print("The number entered is positive. ");

}	if (num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0 && num5) 
	{ System.out.print("The number entered is negative. ");
}

}
}