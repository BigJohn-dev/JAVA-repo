import java.util.Scanner;

public class CryptographyII {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a four-digit number: ");
	int four = input.nextInt();

	if (four < 1000 || four > 9999) {
        System.out.println("Error: Please enter a valid four-digit number (1000-9999).");

}	else {
	int divi1 = (four / 1000) % 10;
	int rem11 = (four + 10 - 7) % 10;

	int divi2 = (four / 100) % 10;
	int rem22 = (four + 10 - 7) % 10;

	int divi3 = (four / 10) % 10;
	int rem33 = (four + 10 - 7) % 10;

	int divi4 = four % 10;
	int rem44 = (four + 10 - 7) % 10;

	System.out.println("Decrypted numbers: " + rem11 * 1000 + rem22 * 100 + rem33 * 10 + rem44);
}

}


}

