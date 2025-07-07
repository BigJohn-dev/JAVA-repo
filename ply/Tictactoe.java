public class Tictactoe {

	static String[][] gameboard = {
	{" ", " ", " "},
	{" ", " ", " "},
	{" ", " ", " "}
};
	public static void printGameBoard() {
	System.out.println("-------------");
	for (int i = 0; i < gameboard.length; i++) {
	System.out.print("| ");
		for (int j = 0; j < gameboard[i].length; j++) {
	System.out.print(gameboard[i][j] + " | ");
}
	System.out.println();
	System.out.println("-------------");
}
}

	public static boolean winner(String currentPlayer) {
	for(int i = 0; i < 3; i++) {
	   if(gameboard[i][0] == currentPlayer && gameboard[i][1] == currentPlayer && gameboard[i][2] == currentPlayer) return true;
	else if(gameboard[0][i] == currentPlayer && gameboard[1][i] == currentPlayer && gameboard[2][i] == currentPlayer) return true;
	else if(gameboard[0][0] == currentPlayer && gameboard[1][1] == currentPlayer && gameboard[2][2] == currentPlayer) return true;
	else if(gameboard[0][2] == currentPlayer && gameboard[1][1] == currentPlayer && gameboard[2][0] == currentPlayer) return true;
}
	return false;
}	

	public static boolean boardFill() {
	for(int i = 0; i < 3; i++) {
	  for(int j = 0; j < 3; j++) {
	     if(gameboard[i][j] == " ") {
		return false;
}
}
}
	return true;
}


	public static void main(String[] args) {
	
	printGameBoard();


}
}
