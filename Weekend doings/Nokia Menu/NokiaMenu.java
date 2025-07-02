import java.util.Scanner;

public class NokiaMenu {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- WELCOME TO YOUR NOKIA PHONE -_ ");

	System.out.println("\n List of Menu Functions ");

		String Menu = """

		1. Phone book
		2. Message
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
	
		""";
		System.out.println(Menu);
		int menu = input.nextInt();

	switch (menu) {
	case 1: System.out.println("Phone book"); {

		String one = """

		1. Search
		2. Service Nos
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Options
		9. Speed dials
		10. Voice tags

		""";
		System.out.println(one);
		int One = input.nextInt();
	
	switch (One) {
	case 8: System.out.println("Option");
	
		String eight = """

		1. Type of view
		2. Memory status

		""";
		System.out.println(eight);
}
}break;

	case 2: System.out.println("Message"); {

		String two = """

		1. Write messages
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command editor

		""";
		System.out.println(two);
		int Two = input.nextInt();

	switch (Two) {
	case 7: System.out.println("Message settings");
		String sev = """

		1. Set 1
		2. Common
	
		""";
		System.out.println(sev);
		int seve = input.nextInt();

	switch (seve) {
	case 1: System.out.println("Set 1");
		String num = """
	
		1. Message centre number
		2. Messages sent as
		3. Message validity
	
		""";
		System.out.println(num);break;
		
	case 2: System.out.println("Common");
		String nom = """
		
		1. Delivery report
		2. Reply via same centre
		3. Character support

		""";
		System.out.println(nom);break;

	default: System.out.println("..."); 
}
	default: System.out.println("...");
}
}break;

	case 3: System.out.println("Chat");break;


	case 4:	System.out.println("Call register"); {
		String four = """

		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call costs
		7. Call cost settings
		8. Prepaid credit

		""";
		System.out.println(four);
		int five = input.nextInt();

	switch (five) {
	case 5: System.out.println("Show call duration");
		String Five = """
		1. Last call duration
		2. All calls' duration
		3. Received calls' duration
		4. Dialled calls' duration
		5. Clear timers

		""";
		System.out.println(Five);break;
		
	case 6: System.out.println("Show call cost");
		String Six = """
		1. Last call cost
		2. All calls' cost
		3. Clear counters
		
		 """;
		System.out.println(Six);break;

	case 7: System.out.println("Call cost settings");
		String SEV = """
		1. Call cost limit
		2. Show costs in

		""";
		System.out.println(SEV);break;

	default: System.out.println("...");
}
}break;

	case 5: System.out.println("Tones"); {
		String tones = """
	
		1. Ringing tone
		2. Ringing volume
		3. Incoming call alert
		4. Composer
		5. Message alert tone
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver

		""";
		System.out.println(tones);
}break;

	case 6: System.out.println("Settings"); {
		String settings = """

		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory setting

		""";
		System.out.println(settings);
		int set6 = input.nextInt();

	switch (set6) {
	case 1: System.out.println("Call settings");
		String Set6 = """

		1. Automatic redial
		2. Speed dialling
		3. Call waiting option
		4. Own number sending
		5. Phone line in use
		6. Automatic answer

		""";
		System.out.println(Set6);break;

	case 2: System.out.println("Phone settings");
		String Phone = """
		
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Confirm SIM service actions

		""";
		System.out.println(Phone);break;

	case 3: System.out.println("Security settings");
		String cell = """
		
		1. PIN code request
		2. Call barring service
		3. Fixed dialling
		4. Closed user group
		5. Phone security
		6. Change access codes

		""";
		System.out.println(cell);break;

	case 4: System.out.println("Restore factory settings...");break;

	default: System.out.print("....");
}
}break;

	case 7: System.out.println("Call divert");break;

	case 8: System.out.println("Games");break;

	case 9: System.out.println("Calculator");break;

	case 10: System.out.println("Reminders");break;

	case 11: System.out.println("Clock"); {

		String Cell = """
		
		1. Alarm clock
		2. Clock settings
		3. Date settings
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time

		""";
		System.out.println(Cell);
}break;

	case 12: System.out.println("Profiles");break;

	case 13: System.out.println("SIM services");break;

	default : System.out.println("...");

}
	
	

}
}
