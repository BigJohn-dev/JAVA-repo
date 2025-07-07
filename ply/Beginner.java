import java.util.Scanner;
public class Beginner {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Your Full Name: ");
	String fullName = input.nextString();

	System.out.println("Welcome" + fullName);
}
}