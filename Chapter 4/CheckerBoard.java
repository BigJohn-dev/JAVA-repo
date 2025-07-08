public class CheckerBoard {
	public static void main(String[] args) {

	for(int a = 1; a <= 8; a++) {
	   for (int b = 1; b <= 8; b++) {
	       for (int c = b; c <= a; c++) {
	System.out.print("  ");
}
	System.out.print(" * ");
     }
	System.out.println();
   }

}

}