import java.util.Scanner;

public class SummingRandom {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int number1 = (int)(Math.random() * 100);
	int number2 = (int)(Math.random() * 100);

	System.out.println("What is " + number1 + " + " + number2  + " ?");
	int answer = input.nextInt();

	if (answer != number1 + number2) {
	System.out.println("Incorrect answer..");

}	else {
	System.out.println("You are correct");
}




}
}










