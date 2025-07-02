import java.util.Scanner;
public class Squares {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number from 0 to 10: ");
	int number = input.nextInt();

	if (number != 0 && number != 1 && number != 2 && number != 3 && number != 4 && number != 5 && number != 6 && number != 7 && number != 8 && number != 9 && number != 10) { System.out.println("Incorrect value. Pls try again!!");

} else{	System.out.println("Number  \tSquare    \tCube");
	System.out.printf("%d" + "\t" + "\t", number);
	System.out.printf("%d\t" + "\t", number * number);
	System.out.printf("%d\t" + "\t", number * number * number);
}

}
}
