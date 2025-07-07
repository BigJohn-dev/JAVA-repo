public class Exercise_practiceII {
	public static void main(String[] args) {

	int [] values = {1, 2, -3, 5, 7};

	int sum = 0;
	int product = 1;

	for(int i = 0; i < values.length; i++) {
	sum += values[i];
	product *= values[i];
}
	double average = sum / values.length;

	System.out.println("Sum = " + sum);
	System.out.println("Product = " + product);
	System.out.println("Average = " + average);

}



}