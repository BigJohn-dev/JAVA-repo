import java.util.Scanner;

public class sphereVolume {

	public static String volumeOfSphere(int radius) {

	double result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	return "The volume of sphere is = " + result;
}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius of the sphere: ");
	int radius = input.nextInt(); 

	System.out.println(volumeOfSphere(radius));
}
}