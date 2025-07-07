public class array {
	public static void main(String[] args) {

	double[] values = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};

	double sum = values[0] + values[1];

	System.out.println("Sum of first two is: " + sum); 

	double add = 0;
	for(double value : values) {
	add += value;
}
	System.out.println("Sum of all values is: " + add);

	
	double number = values[9];
	int small = 0;
	for(int i = 0; i < values.length; i++){
	  if(values[i] > number) {
	number = values[i];
	small = i;
} 
}
	System.out.println("The minimum is: " + small);



}


}