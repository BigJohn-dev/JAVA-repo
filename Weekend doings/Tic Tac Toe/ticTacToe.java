import java.util.Scanner;

public class ticTacToe {

	static String[][] gameBoard = {{" ", " ", " ",}, {" ", " ", " ",}, {" ", " ", " ",}};

// printing game board...
	public static void printGameBoard() {

	System.out.println("-------------");

	for(int i = 0; i < 3; i++) {
	System.out.print("| ");
	  for(int j = 0; j < 3; j++) {
		System.out.print(gameBoard[i][j] + " | ");
}
	System.out.println();
	System.out.println("-------------");
}
}

// Check for winner
	public static boolean winner(String currentPlayer) {
	for(int i = 0; i < 3; i++) {
	   if(gameBoard[i][0] == currentPlayer && gameBoard[i][1] == currentPlayer && gameBoard[i][2] == currentPlayer) return true;
	else if(gameBoard[0][i] == currentPlayer && gameBoard[1][i] == currentPlayer && gameBoard[2][i] == currentPlayer) return true;
	else if(gameBoard[0][0] == currentPlayer && gameBoard[1][1] == currentPlayer && gameBoard[2][2] == currentPlayer) return true;
	else if(gameBoard[0][2] == currentPlayer && gameBoard[1][1] == currentPlayer && gameBoard[2][0] == currentPlayer) return true;
}
	return false;
}	

// Check for board fills
	public static boolean boardFill() {
	for(int i = 0; i < 3; i++) {
	  for(int j = 0; j < 3; j++) {
	     if(gameBoard[i][j] == " ") {
		return false;
}
}
}
	return true;
}

	public static boolean moves(int row, int column, String currentPlayer) {
		if(row >= 0 && row < 3 && column >= 0 && column < 3 && gameBoard[row][column] == " ") {
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
		printGameBoard();
		System.out.println("Player " + currentPlayer + "'s turn.");
		System.out.println("Enter row (0-2): ");
		int row = input.nextInt();
		System.out.println("Enter column (0-2): ");
		int column = input.nextInt();
		
		if(moves(row, column, currentPlayer)) {
		if (winner(currentPlayer)) {
		printGameBoard();
		System.out.println("Player " + currentPlayer + " wins!");
		runningGame = false;
}	else if (boardFill()) {
		printGameBoard();
		System.out.print("It's a tie!");
		runningGame = false;
}	else {
		currentPlayer = (currentPlayer == "X") ? "O" : "X";
}

}	else{
		System.out.println("Invalid move. Try again.");
}
}

}
}