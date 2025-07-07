import java.util.Scanner;

public class volumeOfACynlinder {

	public static double area(double radius) {
	double PI = 3.1412;
	double area = radius * radius * PI;
	return area;
}

	public static String volume(double area, double length) {
	double volume = area * length;
	return "The volume is " + volume;
}
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the radius of the cylinder: ");
	double radius = input.nextDouble();

	System.out.println("Enter the length of the cylinder: ");
	double length = input.nextDouble();

	System.out.println(volumeOfACynlinder.area(radius));
	System.out.println(volumeOfACynlinder.volume(volumeOfACynlinder.area(radius), length));
}
}