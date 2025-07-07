import java.util.Scanner;

public class Score2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter a value for Score: ");
	int Score = input.nextInt();

	if (Score > 90) {
	double pay = 90 * 0.03;
	System.out.printf("Payment is increased by " + "%.2f", pay);

}	else {
	double pay = 90 * 0.01;
	System.out.printf("Payment is increased by " + "%.2f", pay);
}

}

}