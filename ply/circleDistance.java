// A great circle distance

import java.util.Scanner;

public class circleDistance {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
	double numx1 = input.nextDouble();
	double numy1 = input.nextDouble();
	
	System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
	double numx2 = input.nextDouble();
	double numy2 = input.nextDouble();
	
	double radius = 6371.01;
	double PI = 3.1412;

	double x1 = Math.toRadians(numx1);
	double y1 = Math.toRadians(numy1);
	double x2 = Math.toRadians(numx2);
	double y2 = Math.toRadians(numy2);
	
	double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1- y2));
	System.out.println("The distance between the two points is " + distance + " km");
}

}