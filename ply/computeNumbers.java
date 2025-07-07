public class computeNumbers {

	public static String positiveCountIn(int numbers) {
	int positive = 0;
	if (numbers > 0) positive += 1;
	return "The number of positives is " + positive;
}
	public static String negativeCountIn(int numbers) {
	int negative = 0;
	if (numbers < 0) negative += 1;
	return "The number of negatives is " + negative;
}
	public static String totalSumIn(int numbers) {
	int sum = 0;
	sum += numbers;
	return "The total is " + sum;
}
	public static String averageIn(int numbers) {
	int average = numbers / len(numbers);
	return "The average is " + average;
}


}