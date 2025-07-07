public class TaskNine {
	public static void main(String[] args){

	int sum_total = 0;
	for(int numbers = 1; numbers <= 10; numbers++){
	if(numbers % 4 == 0){
	int sum = 0;
	   for(int count = 1; count <= 5; count++){
		sum += (int)(Math.pow(numbers, count));
}
	sum_total += sum;
}
}
	System.out.print(sum_total * sum_total);
}
}