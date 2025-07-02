public class NumberPattern {
	public static void main(String[] args) {
	
	int a = 6;
	

	for (int c = 1; c <= a; c++) {
		int b = 1;
	    for (int d = 1; d <= c; d++) {
		System.out.print(b++ + " ");
	}
	System.out.println();
    }

	for (int c = 1; c <= a; c++) {
		int b = 1;
	    for (int d = 1; d <= c; d++) {
		System.out.print(" ");
	}
	 	for (int d = a; d <= a; d++) {
		System.out.print(b++ + " ");
}
	System.out.println();
    }


}

}