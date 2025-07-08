public class divisibles {
	public static String divisibleBy(int numbers, int divisor = 5) {

	int [] numbers = new int [];
	for(int count = 1; count <= numbers.length; count++){
	if (numbers % divisor == 0) {
	numbers.append(numbers);
}	
	if numbers == 0
	return "No divisible numbers found";
else
	return "The divisibles are " + numbers;
} 

}
}