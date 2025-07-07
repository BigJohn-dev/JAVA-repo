import java.util.Scanner;
public class Alex{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a value for a: ");
	int a = input.nextInt();
	
	System.out.println("Enter a value for b: ");
	int b = input.nextInt();

	System.out.println("Enter a value for c: ");
	int c = input.nextInt();

	int answer = ((int)(-b + (Math.sqrt(Math.pow(b, 2)) - (4 * a * c))) / (2 * a));
	System.out.println("The answer is: " + answer);
}
}