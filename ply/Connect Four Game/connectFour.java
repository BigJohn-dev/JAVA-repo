import java.util.Scanner;

public class connectFour {

	static String[][] gameBoard = {

	{" ", " ", " ", " ", " ", " ", " "},
	{" ", " ", " ", " ", " ", " ", " "},
	{" ", " ", " ", " ", " ", " ", " "},
	{" ", " ", " ", " ", " ", " ", " "},
	{" ", " ", " ", " ", " ", " ", " "},
	{" ", " ", " ", " ", " ", " ", " "},
	{" ", " ", " ", " ", " ", " ", " "},
	
};
	public static void printGameBoard() {
	System.out.println();
	System.out.println();
	for(int i = 0; i < 6; i++) {
	System.out.print("| ");
	  for(int j = 0; j < gameBoard.length; j++) {
		System.out.print(gameBoard[i][j] + " | ");
}
	System.out.println();
	System.out.println("-----------------------------");
}
}

	public static boolean winner(String currentPlayer) {
	for (int i = 0; i < 4; i++) {
	   if(gameBoard[i][0] == currentPlayer && garboards[i][1] == currentPlayer && gameBoard[i][2] == currentPlayer && gameBoard[i][3] == currentPlayer) return true;
	else  if(gameBoard[0][i] == currentPlayer && gameBoard[1][i] == currentPlayer && gameBoard[2][i] == currentPlayer && gameBoard[3][i] == currentPlayer) return true;
	else  if(gameBoard[0][0] == currentPlayer && gameBoard[1][1] == currentPlayer && gameBoard[2][2] == currentPlayer && gameBoard[3][3] == currentPlayer) return true;
	else  if(gameBoard[0][2] == currentPlayer && gameBoard[1][1] == currentPlayer && gameBoard[2][0] == currentPlayer && gameBoard[1][0] == currentPlayer) return true;
}
	return false;
}

	public static boolean boardFill() {
	for(int i = 0; i < 6; i++) {
	  for(int j = 0; j < gameBoard.length; j++) {
	     if(gameBoard[i][j] == " ") {
		return false;
}
}
}
	return true;
}

	public static boolean moves(int row, int column, String currentPlayer) {
		if(row >= 0 && row < 6 && column >= 0 && column < 7 && gameBoard[row][column] == " ") {
	gameBoard[row][column] = currentPlayer;
	return true;
}
	return false;
}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String currentPlayer = "Y";
		boolean runningGame = true;

System.out.println("\n...from the world of TIC-TAC-TOE...");
System.out.println("\n...present");

System.out.println("..JAVA GAMES");

System.out.println(" \n___- CONNECT FOUR -___ ");


	while(runningGame) {
		printGameBoard();
		System.out.println("Player " + currentPlayer + "'s turn.");
		System.out.print("Enter row (0 - 5): ");
		int row = input.nextInt();
		System.out.print("Enter column (0 - 6): ");
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
		currentPlayer = (currentPlayer == "Y") ? "R" : "Y";
}

}	else{
		System.out.println("Invalid move. Try again.");
}
}

}
}