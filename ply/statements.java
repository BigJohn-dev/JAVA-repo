public class statements {
	public static void main(String[] args) {

	int b = 0;
	
	for(int i = 1; i <= 1; i++) {
	
	    for( int j = i; j <= 99; j += 1) {

		System.out.print(j++ + " ");
		b = b + j;
}
	System.out.println(" ");
}
	
	System.out.println("The sum of odd numbers is " + b);

}

}