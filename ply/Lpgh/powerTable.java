public class powerTable {
	public static void main(String[] args) {

	System.out.println("a\tb\ta**b");


	int [] a = {1, 2, 3, 4, 5};
	int [] b = {2, 3, 4, 5, 6};

	for(int count = 0; count < a.length; count++) {
		int result = (int)Math.pow(a[count], b[count]);
		System.out.printf("%-8d%-9d%-6d%n", a[count], b[count], result); 
}
	System.out.println();


}
}