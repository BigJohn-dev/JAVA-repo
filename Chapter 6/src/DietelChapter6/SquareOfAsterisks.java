package DietelChapter6;

import java.util.Scanner;

public class SquareOfAsterisks {

    public void SquareOfAsterisks() {
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void SquareOfAsterisks2(int number) {
        for (int a = 0; a < number; a++) {
            for (int b = 0; b < number; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SquareOfAsterisks s = new SquareOfAsterisks();
        s.SquareOfAsterisks();
        System.out.println("Enter the length for asterisks: ");
        int length = input.nextInt();
        SquareOfAsterisks.SquareOfAsterisks2(5);
    }
}
