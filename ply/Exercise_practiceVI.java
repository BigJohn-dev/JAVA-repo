import java.util.Scanner;
import java.util.Arrays;
public class Exercise_practiceVI {
	public static void main(String[] args) {

	int [][] values = {{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}};

		
	for(int i = 0; i < 3; i++){ 
	int sum = 0;
	for(int j = 0; j < 4; j++) {
	sum += values[i][j];	
}
	System.out.println("Sum of row is = " + sum);
}
  
	for(int i = 0; i < 4; i++){ 
	int sum = 0;
	for(int j = 0; j < 3; j++) {
	sum += values[j][i];	
}
	System.out.println("Sum of column is = " + sum);
}
   

} 
}