import java.util.Scanner;
public class whileLoop {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number of students: ");
	int number = input.nextInt();	

	int count = 1;
	
	while (number != 0) {
	System.out.println("Enter number of students: ");
	number = input.nextInt();
	System.out.println("Good school");
	count++;
}

}
}