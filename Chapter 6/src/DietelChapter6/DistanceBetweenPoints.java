package DietelChapter6;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static double values(double x1, double x2, double y1, double y2) {
        double distance;
        return distance = Math.sqrt(Math.pow((x2 - x1), (x2 - x1)) + Math.pow((y2 - y1), (y2 - y1)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating the distance between points...\n");
        System.out.print("Enter the x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter the y2: ");
        double y2 = input.nextDouble();

        System.out.println("The distance between points is: " + values(x1, x2, y1, y2));
    }
}
