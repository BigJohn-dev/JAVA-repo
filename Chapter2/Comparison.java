import java.util.Scanner;
public class Comparison {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an Integer: ");
	int anyNumber = input.nextInt();

	int squareOfInteger = anyNumber * anyNumber;
	System.out.println(squareOfInteger);

	if (anyNumber > 100) {
	System.out.printf("%d > %d%n", anyNumber, 100);
}
	if (anyNumber == 100) {
	System.out.printf("%d == %d%n", anyNumber, 100);
}
	if (anyNumber != 100) {
	System.out.printf("%d != %d%n", anyNumber, 100);
}
	if (anyNumber < 100) {
	System.out.printf("%d < %d%n", anyNumber, 100);
}

	if (squareOfInteger > 100) {
	System.out.printf("%d > %d%n", squareOfInteger, 100);
}
	if (squareOfInteger == 100) {
	System.out.printf("%d == %d%n", squareOfInteger, 100);
}
	if (squareOfInteger != 100) {
	System.out.printf("%d != %d%n", squareOfInteger, 100);
}
	if (squareOfInteger < 100) {
	System.out.printf("%d < %d%n", squareOfInteger, 100);
}

}
}