package Arrays;
import java.util.Scanner;
public class TurtleGraphics {
    static String[][] gameBoard = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
    };

        // printing game board...
        public static void printTurtleBoard() {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            for(int i = 0; i < 20; i++) {
                System.out.print("| ");
                for(int j = 0; j < gameBoard.length; j++) {
                    System.out.print(gameBoard[i][j] + " | ");
                }
                System.out.println();
                System.out.println("----------------------------------------------------------------------------------");
            }
        }


    // Check for winner
        public static boolean winner(String currentPlayer) {
            for(int i = 0; i < 3; i++) {
                if(gameBoard[i][0].equals(currentPlayer) && gameBoard[i][1].equals(currentPlayer) && gameBoard[i][2].equals(currentPlayer)) return true;
                else if(gameBoard[0][i].equals(currentPlayer) && gameBoard[1][i].equals(currentPlayer) && gameBoard[2][i].equals(currentPlayer)) return true;
                else if(gameBoard[0][0].equals(currentPlayer) && gameBoard[1][1].equals(currentPlayer) && gameBoard[2][2].equals(currentPlayer)) return true;
                else if(gameBoard[0][2].equals(currentPlayer) && gameBoard[1][1].equals(currentPlayer) && gameBoard[2][0].equals(currentPlayer)) return true;
            }
            return false;
        }

        // Check for board fills
        public static boolean boardFill() {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(gameBoard[i][j].equals(" ")) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean moves(int row, int column, String currentPlayer) {
            if(row >= 0 && row < 3 && column >= 0 && column < 3 && gameBoard[row][column].equals(" ")) {
                gameBoard[row][column] = currentPlayer;
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String currentPlayer = "X";
            boolean runningGame = true;

            while(runningGame) {
                printTurtleBoard();
                System.out.println("Player " + currentPlayer + "'s turn.");
                System.out.println("Enter row (0-2): ");
                int row = input.nextInt();
                System.out.println("Enter column (0-2): ");
                int column = input.nextInt();

                if(moves(row, column, currentPlayer)) {
                    if (winner(currentPlayer)) {
                        printTurtleBoard();
                        System.out.println("Player " + currentPlayer + " wins!");
                        runningGame = false;
                    }	else if (boardFill()) {
                        printTurtleBoard();
                        System.out.print("It's a tie!");
                        runningGame = false;
                    }	else {
                        currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
                    }

                }	else{
                    System.out.println("Invalid move. Try again.");
                }
            }

        }
    }

