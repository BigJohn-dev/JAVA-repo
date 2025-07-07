import java.util.Scanner;
import java.util.Arrays;
public class Exercise_practiceVII {
	public static void main(String[] args) {
 
	int [][] values = {{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}};

		
	for(int i = 0; i < 3; i++){ 
	int max = values[0][0];
	for(int j = 0; j < 4; j++)
		max = (values[i][j] > max) ? values[i][j] : max;

	System.out.println("Max of row is = " + max);
}
  
	for(int i = 0; i < 4; i++){ 
	int max = values[0][0];
	for(int j = 0; j < 3; j++) 
		max = (values[j][i] > max) ? values[j][i] : max;	

	System.out.println("Max of column is = " + max);
}
   

} 
}