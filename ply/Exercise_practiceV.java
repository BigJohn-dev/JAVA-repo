import java.util.Arrays;
public class Exercise_practiceV {
	public static void main(String[] args) {

	int [] values = {1, 2, 4, 5, 7, 9, -2, 3};

	int [] temp = new int [values.length];
	int j = 0;
	int k = values.length - 1;
	
	for(int i = 0; i < values.length; i++) 
		if (values[i] % 2 != 0) {
			temp[j++] = values[i];
} else{
			temp[k--] = values[i];
}	
	System.out.println(Arrays.toString(temp));
}
      
}