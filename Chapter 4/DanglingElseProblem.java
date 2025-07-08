import java.util.Scanner;

public class DanglingElseProblem {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for x: ");
	int x = input.nextInt();

	System.out.print("Enter a value for y: ");
	int y = input.nextInt();

if (x > 5){
	if (y > 5){
	System.out.println("x and y are > 5");
}
}else
	System.out.println("x is <= 5");

}


}