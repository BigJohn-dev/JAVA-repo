import java.util.Scanner;

public class Nokia3310II {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println(" _- WELCOME TO YOUR NOKIA PHONE -_ ");

		String home = """

	==========================
		HOME PAGE

		0. Menu
	==========================
		""";

	System.out.println(home);

	boolean MENU = true;

	while(MENU) {
	int chia = input.nextInt();

	switch (chia) {
	case 0: System.out.println(" ");

		String Menu = """
	===============================
	   LIST OF MENU FUNCTIONS

	1. Phone book		2. Message
	3. Chat			4. Call register
	5. Tones		6. Settings
	7. Call divert		8. Games
	9. Calculator		10. Reminders
	11. Clock		12. Profiles
	13. SIM services	0. Back

	===============================
	
		""";
		System.out.println(Menu);

		int menu = input.nextInt();
	switch (menu) {
	
	case 1: System.out.println(" "); {

		String one = """
	=================================
		   PHONE BOOK

	1. Search		2. Service Nos
	3. Add name		4. Erase
	5. Edit			6. Assign tone
	7. Send b'card		8. Options
	9. Speed dials		10. Voice tags
	0. Back

	==================================

		""";
		System.out.println(one);


	
		int One = input.nextInt();
	switch (One) {
	case 1: System.out.println(" ");
		
	String sae = """
	==================================
		   SEARCH
		
		  0. Back
	==================================
		""";
	System.out.println(sae);break;

	case 2: System.out.println(" ");
		
	String sea = """
	==================================
		  SERVICE NOS
		
		  0. Back
	==================================
		""";

	System.out.println(sea);break;

	case 3: System.out.println(" ");

	String Sea = """
	==================================
		   ADD NAME
		
		  0. Back
	==================================
		""";

	System.out.println(Sea);break;

	case 4: System.out.println(" ");

	String Sae = """
	==================================
		   ERASE
		
		  0. Back
	==================================
		""";

	System.out.println(Sae);break;

	case 5: System.out.println(" ");

	String lin = """
	==================================
		   EDIT
		
		  0. Back
	==================================
		""";

	System.out.println(lin);break;

	case 6: System.out.println(" ");

	String Lin = """
	==================================
		ASSIGN TONE
		
		  0. Back
	==================================
		""";

		System.out.println(Lin);break;

	case 7: System.out.println(" ");

	String Bin = """
	==================================
		 SEND B'CARD
		
		  0. Back
	==================================
		""";

	System.out.println(Bin);break;

	case 8: System.out.println(" ");
	
		String eight = """
	==================================
			OPTION

	1. Type of view		2. Memory status
	0. Back
	
	==================================

		""";
		System.out.println(eight); 
		int eig = input.nextInt();
	switch (eig) {
	
	case 1: System.out.println(" ");

	String Var = """
	==================================
		TYPE OF VIEW
		
		  0. Back
	==================================
		""";

	System.out.println(Var);break;

	case 2: System.out.println(" ");

	String Vas = """
	==================================
		 MEMORY STATUS
		
		  0. Back
	==================================
		""";

	System.out.println(Vas);break;

}break;

	case 9: System.out.println(" ");

	String Afs = """
	==================================
		 SEARCH DIALS
		
		  0. Back
	==================================
		""";

		System.out.println(Afs);break;

	case 10: System.out.println(" ");

	String Das = """
	==================================
		   VOICE TAGS
		
		  0. Back
	==================================
		""";

	System.out.println(Das);break;

	default: System.out.println(" ");break;

}
}break;

	case 2: System.out.println(" "); {

		String two = """
	=========================================
			 MESSAGE

	1. Write messages		2. Inbox
	3. Outbox			4. Picture messages
	5. Templates			6. Smileys
	7. Message settings		8. Info service
	9. Voice mailbox number		10. Service command editor
	0. Back

	==========================================

		""";
		System.out.println(two);
		int Two = input.nextInt();

	switch (Two) {
	case 1: System.out.println(" ");

	String Sys = """
	==================================
		 WRITE MESSAGE
		
		  0. Back
	==================================
		""";

		System.out.println(Sys);break;

	case 2: System.out.println(" ");

	String sys = """
	==================================
		   INBOX
		
		  0. Back
	==================================
		""";

	System.out.println(sys);break;

	case 3: System.out.println(" ");

	String Ooc = """
	==================================
		   OUTBOX
		
		  0. Back
	==================================
		""";

	System.out.println(Ooc);break;

	case 4: System.out.println(" ");

	String ooc = """
	==================================
		PICTURE MESSAGES
		
		   0. Back
	==================================
		""";

		System.out.println(ooc);break;

	case 5: System.out.println(" ");
	
	String vaf = """
	==================================
		   TEMPLATES
		
		  0. Back
	==================================
		""";

	System.out.println(vaf);break;

	case 6: System.out.println(" ");

	String ban = """
	==================================
		   SMILEYS
		
		  0. Back
	==================================
		""";

		System.out.println(ban);break;

	case 7: System.out.println(" "); {

		String sev = """
	=========================================
		MESSAGE SETTINGS

	1. Set 1		2. Common
	0. Back
	
	=========================================

		""";
	System.out.println(sev);
		int seve = input.nextInt();

	switch (seve) {
	case 1: System.out.println(" ");
		String num = """
	   =======================================
			SET 1

	1. Message centre number	2. Messages sent as
	3. Message validity
	0. Back

	==========================================
	
		""";
	System.out.println(num);break;
		
	case 2: System.out.println(" ");
		String nom = """
	==========================================
			COMMON

	1. Delivery report	2. Reply via same centre
	3. Character support	0. Back

	==========================================
		""";
	System.out.println(nom);break;

	default: System.out.println(" ");break; 
}
}break;

	case 8: System.out.println(" ");

	String bli = """
	==================================
		   INFO SERVICE
		
		     0. Back
	==================================
		""";

	System.out.println(bli);break;

	case 9: System.out.println("  ");

	String bil = """
	==================================
		VOICE MAILBOX NUMBER
		
		     0. Back
	==================================
		""";

	System.out.println(bil);break;

	case 10: System.out.println("  ");

	String dar = """
	===================================
		SERVICE COMMAND EDITOR
		
		      0. Back
	===================================
		""";

	System.out.println(dar);break;

	default: System.out.println(" ");break;
}
}break;

	case 3: System.out.println(" "); 

	String cha = """
	==================================
		    CHAT
		
		  0. Back
	==================================
		""";

	System.out.println(cha);break;


	case 4:	System.out.println(" "); {
		String four = """
	============================================
			CALL REGISTER

	1. Missed calls		2. Received calls
	3. Dialled numbers	4. Erase recent call lists
	5. Show call duration	6. Show call costs
	7. Call cost settings	8. Prepaid credit
	0. Back

	============================================
		""";
		System.out.println(four);
		int five = input.nextInt();

	switch (five) {
	
	case 1: System.out.println(" ");

	String mis = """
	==================================
		   MISSED CALLS
		
		    0. Back
	==================================
		""";

	System.out.println(mis);break;

	case 2: System.out.println(" ");

	String rec = """
	==================================
		   RECEIVED CALLS
		
		      0. Back
	==================================
		""";

	System.out.println(rec);break;

	case 3: System.out.println(" ");

	String led = """
	==================================
		   DIALLED NUMBERS
		
		     0. Back
	==================================
		""";

	System.out.println(led);break;

	case 4: System.out.println(" ");

	String meo = """
	======================================
		ERASE RECENT CALL LISTS
		
		      0. Back
	======================================
		""";

	System.out.println(meo);break;

	case 5: System.out.println(" ");
		String Five = """
	===========================================
		     SHOW CALL DURATION

	1. Last call duration		2. All calls' duration
	3. Received calls' duration	4. Dialled calls' duration
	5. Clear timers			0. Back

	============================================
		""";
		System.out.println(Five);break;
		
	case 6: System.out.println(" ");
		String Six = """
	========================================
		    SHOW CALL COST

	1. Last call cost	2. All calls' cost
	3. Clear counters	0. Back

	========================================		
		 """;
		System.out.println(Six);break;

	case 7: System.out.println(" ");
		String SEV = """
	========================================
		  CALL COST SETTINGS

	1. Call cost limit	2. Show costs in
	0. Back

	========================================
		""";
		System.out.println(SEV);break;

	case 8: System.out.println(" ");

	String pai = """
	==================================
		   PREPAID CREDIT
		
		      0. Back
	==================================
		""";

	System.out.println(pai);break;

	default: System.out.println(" ");break;
}
}break;

	case 5: System.out.println(" "); {
		String tones = """
	===========================================
			  TONES

	1. Ringing tone			2. Ringing volume
	3. Incoming call alert		4. Composer
	5. Message alert tone		6. Keypad tones
	7. Warning and game tones	8. Vibrating alert
	9. Screen saver			0. Back

	===========================================
		""";
		System.out.println(tones);
		int set5 = input.nextInt();

	switch (set5){
	
	case 1: System.out.println(" ");

	String ton = """
	==================================
		   RINGING TONE
		
		     0. Back
	==================================
		""";

	System.out.println(ton);break;

	case 2: System.out.println(" ");
	
	String dag = """
	==================================
		   RINGING VOLUME
		
		     0. Back
	==================================
		""";

	System.out.println(dag);break;

	case 3: System.out.println("  ");

	String vab = """
	==================================
		INCOMING CALL ALERT
		
		     0. Back
	==================================
		""";

		System.out.println(vab);break;

	case 4: System.out.println(" ");

	String may = """
	==================================
		   COMPOSER
		
		   0. Back
	==================================
		""";

	System.out.println(may);break;

	case 5: System.out.println("  ");

	String bee = """
	==================================
		MESSAGE ALERT TONE
		
		    0. Back
	==================================
		""";

	System.out.println(bee);break;

	case 6: System.out.println(" ");

	String cee = """
	==================================
		   KEYPAD TONES
		
		    0. Back
	==================================
		""";

	System.out.println(cee);break;

	case 7: System.out.println(" ");

	String nee = """
	====================================
		WARNING AND GAME TONES
		
		      0. Back
	====================================
		""";

	System.out.println(nee);break;

	case 8: System.out.println(" ");

	String mee = """
	==================================
		VIBRATING ALERT
		
		   0. Back
	==================================
		""";

	System.out.println(mee);break;

	case 9: System.out.println("Screen saver");

	String qqq = """
	==================================
		 SCREEN SAVER
		
		   0. Back
	==================================
		""";

	System.out.println(qqq);break;

	default: System.out.println("Invalid input");break;
}
}break;

	case 6: System.out.println(" "); {
		String settings = """
	=======================================
			SETTINGS

	1. Call settings	2. Phone settings
	3. Security settings	4. Restore factory setting
	0. Back

	=========================================
		""";
		System.out.println(settings);
		int set6 = input.nextInt();

	switch (set6) {
	case 1: System.out.println(" ");
		String Set6 = """
	========================================
			CALL SETTINGS

	1. Automatic redial	2. Speed dialling
	3. Call waiting option	4. Own number sending
	5. Phone line in use	6. Automatic answer
	0. Back

	========================================
		""";
		System.out.println(Set6);break;

	case 2: System.out.println(" ");
		String Phone = """
	======================================
		  PHONE SETTINGS

	1. Language		2. Cell info display
	3. Welcome note		4. Network selection
	5. Lights		6. Confirm SIM service actions
	0. Back

	======================================
		""";
		System.out.println(Phone);break;

	case 3: System.out.println(" ");
		String cell = """
	======================================
		SECURITY SETTINGS

	1. PIN code request	2. Call barring service
	3. Fixed dialling	4. Closed user group
	5. Phone security	6. Change access codes
	0. Back

	======================================
		""";
		System.out.println(cell);break;

	case 4: System.out.println("Restore factory settings...");
		System.out.println("0. Back");break;

	default: System.out.print("....");
}
}break;

	case 7: System.out.println(" ");

	String rrt = """
	==================================
		   CALL DIVERT
		
		    0. Back
	==================================
		""";

	System.out.println(rrt);break;

	case 8: System.out.println(" ");

	String rrr = """
	==================================
		    GAMES
		
		   0. Back
	==================================
		""";

	System.out.println(rrr);break;

	case 9: System.out.println(" ");

	String lea = """
	==================================
		   CALCULATOR
		
		    0. Back
	==================================
		""";

	System.out.println(lea);break;

	case 10: System.out.println(" ");

	String qyy = """
	==================================
		   REMINDERS
		
		   0. Back
	==================================
		""";

	System.out.println(qyy);break;

	case 11: System.out.println(" "); {

		String Cell = """
	==========================================
			CLOCK

	1. Alarm clock		2. Clock settings
	3. Date settings	4. Stopwatch
	5. Countdown timer	6. Auto update of date and time
	0. Back

	==========================================
		""";
		System.out.println(Cell);
		int cells = input.nextInt();

	switch (cells) {
	
	case 1:  System.out.println(" ");

	String loo = """
	==================================
		ALARM CLOCK
		
		  0. Back
	==================================
		""";

	System.out.println(loo);break;

	case 2:  System.out.println(" ");

	String hee = """
	==================================
		CLOCK SETTINGS
		
		  0. Back
	==================================
		""";

	System.out.println(hee);break;

	case 3:  System.out.println(" ");

	String www = """
	==================================
		DATE SETTINGS
		
		  0. Back
	==================================
		""";

	System.out.println(www);break;

	case 4:  System.out.println(" ");

	String lpe = """
	==================================
		   STOPWATCH
		
		  0. Back
	==================================
		""";

	System.out.println(lpe);break;

	case 5:  System.out.println(" ");

	String mer = """
	==================================
		COUNTDOWN TIMER
		
		   0. Back
	==================================
		""";

	System.out.println(mer);break;

	case 6:  System.out.println("  ");

	String lert = """
	==================================
	   AUTO UPDATE OF DATE AND TIME
		
		   0. Back
	==================================
		""";

	System.out.println(lert);break;

} 
}break;

	case 12: System.out.println(" ");

	String seo = """
	==================================
		   PROFILES
		
		  0. Back
	==================================
		""";

	System.out.println(seo);break;

	case 13: System.out.println(" ");

	String tim = """
	==================================
		SIM SERVICES
		
		  0. Back
	==================================
		""";

	System.out.println(tim);break;

	case 0: MENU = false;break;

	default : System.out.print("....");break;
}
}
}	



}
}
