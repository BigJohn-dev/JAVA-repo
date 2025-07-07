 public class Exercise_practiceIII {
	public static void main(String[] args) {

	int [] values = {1, 1, 1, 2, -3, 5, 7};

	int positive = 0;
	int negative = 0;

	for(int i = 0; i < values.length; i++) {
	if (values[i] < 0){
	negative += 1;
}else{
	positive += 1;
}
}
	System.out.println("The total positive elements is = " + positive);
	System.out.println("The total negative elements is = " + negative);

}



}