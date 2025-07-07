 public class Exercise_practiceIV {
	public static void main(String[] args) {

	int [] values = {2, 4, 6, -3, 5};

	int max = values[0];
	int min = values[0];

	for(int i = 0; i < values.length; i++) {
	max = (values[i] > max) ? values[i] : max;
	min = (values[i] < min) ? values[i] : min;
}
	System.out.println("The max in element is = " + max);
	System.out.println("The min in elements is = " + min);

}



}