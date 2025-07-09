package DietelChapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String answer;

        int randomNumber = rand.nextInt(1000) + 1;
        System.out.println("Welcome to the Guess the number\n");
        do {
            System.out.println("Please enter your guess between 1 and 1000: ");
            int guess = input.nextInt();

            if (guess > randomNumber) System.out.println(" Too high. Try again."); continue;
            if (guess < randomNumber) System.out.println(" Too low. Try again."); continue;
            if (guess == randomNumber) System.out.println(" Congratulations. You guessed the number!");
            System.out.println("Do you want to continue? Yes or No: ");
            answer = input.next();
        } while (answer != null && answer.equalsIgnoreCase("No"));
    }
}