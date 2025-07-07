import java.util.Scanner;

public class twelveDaysOfChristmas{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String Start = """

	TWELVE DAYS OF CHRISTMAS

	""";
	System.out.println(Start);

	String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

      
	for(int day = 1; day <= 12; day++) {
	System.out.println("On the " + days[day - 1] + " of christmas my true love sent to me");


	switch(gift) {
	case 1: 
	if (gift > 1) {
	System.out.println("A partridge in a pear tree");
}	else {
	System.out.println("A partridge in a pear tree");break;
}
	case 2: System.out.println("Two turtle-doves");break;
	case 3:	System.out.println("Three French hens");break;
	case 4: System.out.println("Four calling birds");break;
	case 5: System.out.println("Five golden rings (five golden rings)");break;
	case 6: System.out.println("Six geese a laying");break;
	case 7: System.out.println("Seven swans a swimming");break;
	case 8: System.out.println("Eight maids a milking");break;
	case 9: System.out.println("Nine ladies dancing");break;
	case 10: System.out.println("Ten lords a-leaping");break;
	case 11: System.out.println("I sent 11 pipers piping");break;
	case 12: System.out.println("12 drummers drumming");break;
}

	}


}
}