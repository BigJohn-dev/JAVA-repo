package DietelChapter6;

import java.security.SecureRandom;

public class CrabsGame {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.println("Player rolled " + die1 + " " + die2 + " " + sum);
        return sum;
    }
    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
        switch (sumOfDice) {
            case SEVEN, YO_LEVEN: gameStatus = Status.WON; break;
            case SNAKE_EYES, TREY, BOX_CARS: gameStatus = Status.LOST; break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Point is " + myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) { gameStatus = Status.WON;break;
            } else gameStatus = Status.LOST; break;
        }
        if (gameStatus.equals(Status.WON)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lost!");
        }
    }
}