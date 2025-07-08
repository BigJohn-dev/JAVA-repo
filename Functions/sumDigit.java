public class sumDigit {

	public static int sumValueOf(int numbers) {

	int total = 0;

	if (numbers <= 0 || numbers > 10_000) {
	System.out.println("Invalid input");

}	else {
	String number = Integer.toString(numbers);
	int inputLength = number.length();

	for (int count = 1; count <= inputLength; count++){
	total += numbers % 10;
	numbers /= 10;
}

} 
	return total;

}
}


