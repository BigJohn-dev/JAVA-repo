import java.util.Scanner;

public class assignGrades {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of students: ");
	int noOfStudents = input.nextInt();

	if (noOfStudents <= 0) {
	System.out.println("Invalid input for number of students");
}
	int [] arrayScore = new int [noOfStudents];

	for(int i = 0; i < arrayScore.length; i++){
	System.out.print("Enter " + noOfStudents + " scores: ");
	int grades = input.nextInt();
	
	if (grades < 0 || grades > 100) {
        System.out.println("Invalid score");
}	
	arrayScore[i] = grades;		
}
	int count = 0;
	for(int counter = 0; counter < arrayScore.length; counter++) {
	System.out.println("Student " + arrayScore[count]+ 1 + " score is " + arrayScore[counter] + " ");
}


}

}