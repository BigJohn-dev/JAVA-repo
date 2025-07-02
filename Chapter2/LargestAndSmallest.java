import java.util.Scanner;
public class LargestAndSmallest {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int num1 = 50;
	int num2 = 20;
	int num3 = 40;
	int num4 = 48;
	int num5 = 38;

	System.out.printf(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);

	if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
	System.out.printf("\n" + "Number1 is the Largest", num1);
}
	if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
	System.out.printf("Number2 is the Largest", num2);
}
	if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
	System.out.printf("Number3 is the Largest", num3);
}
	if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
	System.out.printf("Number4 is the Largest", num4);
}
	if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
	System.out.printf("Number5 is the Largest", num5);
}
	if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
	System.out.printf("Number1 is the Smallest", num1);
}
	if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
	System.out.printf("\n" + "Number2 is the Smallest", num2);
}
	if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
	System.out.printf("Number3 is the Smallest", num3);
}
	if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
	System.out.printf("Number4 is the Smallest", num4);
}
	if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
	System.out.printf("Number5 is the Smallest", num5);
}

}
}