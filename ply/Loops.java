import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int controller = 0;
	int average = 0;
	
	while (controller != 10) {
		System.out.println("Enter grade "+ (controller + 1));
		int num = input.nextInt();

	
	controller += 1;
	average = num / 2;
}	

	System.out.println("The average is " + average);

}
}