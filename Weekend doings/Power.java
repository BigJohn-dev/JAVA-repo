import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer value: ");
	int num = input.nextInt();

	System.out.print("Enter power: ");
	int power = input.nextInt();
	
	int answer = 1;
	for (int i = 1; i <= power; i++) {
 
	answer = answer * num;  
}

	System.out.println("Number ^ power = " + answer);
}
}