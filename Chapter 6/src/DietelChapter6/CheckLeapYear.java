package DietelChapter6;

import java.util.Scanner;

public class CheckLeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = input.nextInt();
        System.out.println(isLeapYear(year));
    }
}
