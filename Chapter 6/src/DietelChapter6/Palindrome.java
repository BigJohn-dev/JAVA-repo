package DietelChapter6;

import java.util.Scanner;

public class Palindrome {

    public static String palindrome(int number) {
        String palindrome = "";
        String strNum = Integer.toString(number);
        String reversed = new StringBuilder(strNum).reverse().toString();

        if (strNum.equals(reversed)) {
            return number + " is a palindrome.";
        } else {
            return number + " is not a palindrome.";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = input.nextInt();
        System.out.println(palindrome(number));
    }
}