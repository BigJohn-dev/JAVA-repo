 public class ArrayKata {

// number 1
	/**public static String maximumIn(int[] numbers) {

	if (numbers == null || numbers.length == 0) {
	return null;
}
	
	int maximumNumber = numbers[0];

	for (int count = 1; count < numbers.length; count++) {
        if (numbers[count] > maximumNumber) {
        maximumNumber = numbers[count];
}
}
    return "The largest number in the array is: " + maximumNumber;
}

// number 2
	public static String minimumIn(int[] numbers){

	if (numbers == null || numbers.length == 0) {
	return null;
}
	int minimumNumber = numbers[0];
	for (int count = 1; count < numbers.length; count++) {
        if (numbers[count] < minimumNumber) {
        minimumNumber = numbers[count];
	
}	
}
	return "The smallest number in the array is: " + minimumNumber;
}

// number 3
	public static String sumOf(int[] numbers) {
		
	int total = 0;
	for(int number : numbers) {
	total += number;
}
	return "The sum of array is: " + total;
}

// number 4
	public static String sumOfEvenNumbersIn(int[] numbers) {
	int evenSum = 0;
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 == 0) {
		evenSum += numbers[count];
}
}
		return "Sum of even numbers is: " + evenSum;
}

// number 5
	public static String sumOfOddNumbersIn(int[] numbers) {
	int oddSum = 0;
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 != 0) {
		oddSum += numbers[count];
}
}
		return "Sum of odd numbers is: " + oddSum;
}

// number 6
	public static String maximumAndMinimumOf(int[] numbers) {

	if (numbers == null || numbers.length == 0) {
	return null;
}
	
	int maximumNumber = numbers[0];
	int minimumNumber = numbers[0];
	for (int count = 1; count < numbers.length; count++) {
        if (numbers[count] > maximumNumber) {
        maximumNumber = numbers[count];
}
	if (numbers[count] < minimumNumber) {
	minimumNumber = numbers[count];	
}

}
    return "The largest number in the array is: " + maximumNumber + " and the smallest number in the array is: " + minimumNumber;
}

// number 7
	public static String noOfOddNumbersIn(int[] numbers) {
	
	int oddNumberCount = 0;
	for (int count = 0; count < numbers.length; count++) {
	if (numbers[count] % 2 != 0) {
	oddNumberCount++;
}
}
	return "The total odd numbers in array is: " + oddNumberCount;
}

// number 8
	public static String noOfEvenNumbersIn(int[] numbers) {
	
	int evenNumberCount = 0;
	for (int count = 0; count < numbers.length; count++) {
	if (numbers[count] % 2 == 0) {
	evenNumberCount++;
}
}
	return "The total even numbers in array is: " + evenNumberCount;
}

// number 9
	public static String evenNumbersIn(int[] numbers) {
	
	int displayEven = numbers[0];
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 == 0) {
		displayEven = numbers[count];
}
}
		return "This are the even numbers in the array: " + displayEven;
}

// number 10
	public static String oddNumbersIn(int[] numbers) {
	
	int displayOdd = numbers[0];
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 != 0) {
		displayOdd = numbers[count];
}
}
		return "This are the odd numbers in the array: " + displayOdd;
}**/

// number 11
	public static String squareNumbersIn(int[] numbers) {
	
	int[] square = new int[numbers.length];
	for(int count = 0; count < numbers.length; count++){
		square[count] = numbers[count] * numbers[count];
}
	System.out.println("The square of each element in array is: " + Arrays.toString(square));

	return "The square of each element in array is: " + Arrays.toString(square); 
}


}