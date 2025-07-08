package DietelChapter6;

import java.util.Scanner;

public class HypotenuseCalculation {

    public static double hypotenuseOfARightAngleTriangle(double side1, double side2){
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("The hypotenuse of the triangle is: " + HypotenuseCalculation.hypotenuseOfARightAngleTriangle(side1, side2));
    }
}
