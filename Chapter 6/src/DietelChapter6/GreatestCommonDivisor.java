package DietelChapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int gdcIs(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void main(String[] args) {

        System.out.println(gdcIs(56, 12));
    }
}