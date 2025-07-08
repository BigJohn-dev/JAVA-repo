package DietelChapter6;

import java.util.Scanner;

public class SquareOfAnyCharacter {

    public static void SquareOfACharacter(int number, char ch) {
        for (int a = 0; a < number; a++) {
            for (int b = 0; b < number; b++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a length of shape: ");
        int length = input.nextInt();
        System.out.println("Enter a character you would like to be displayed: ");
        char ch = input.next().charAt(0);
        SquareOfACharacter(length, ch);

    }
}
