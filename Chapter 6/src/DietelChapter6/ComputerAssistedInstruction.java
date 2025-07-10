package DietelChapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Welcome to the computer assisted Instruction!");
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;

        int answer = num1 * num2;
        int userAnswer;
        do {
            System.out.println("What is " + num1 + " * " + num2 + "? ");
            userAnswer = input.nextInt();

            if (userAnswer == answer) System.out.println("Very good!");
            else System.out.println("No. Please try again.");
        } while (userAnswer != answer);
    }

}
