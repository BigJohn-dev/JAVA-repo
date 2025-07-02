public class divisibleBy3 {
	public static void main(String[] args) {

	int count;
	int sumOfOdd = 0;

	for (count = 1; count <= 30; count++){
	  if (count % 3 == 0) {
	     System.out.println(count);
		sumOfOdd += count;
}
}
	System.out.println("The sum of integers divisible by 3 is: " + sumOfOdd);
}

}