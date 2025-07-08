public class sumOfASeries {
	public static void main (String[] args) {

	System.out.print("\nn\t\t(n-n)\t\t\t(n-n)*(n-n)");
	System.out.println("\n-------------------------------------------------------");
	int sum = 0;

	for(int count = 1; count <= 100; count++) {
	System.out.println(count);
	sum += count;
		for (int counter = 1; counter <= 100; counter++) {
		System.out.println(count - sum);
}

}

}


}