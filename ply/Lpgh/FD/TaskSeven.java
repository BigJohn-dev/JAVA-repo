public class TaskSeven {
	public static void main(String[] args){

	for(int numbers = 1; numbers <= 10; numbers++){
	if(numbers % 4 == 0){
	int sum = 0;
	   for(int count = 1; count <= 5; count++){
		sum += (int)(Math.pow(numbers, count));
}
	System.out.print(sum + " ");
}
}
}
}