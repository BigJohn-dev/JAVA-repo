package DietelChapter6;

import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int number1, int number2) {
        if (number2 % number1 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Checking if the second number is a multiple of the first number\n");
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println(isMultiple(number1, number2));
    }
}
