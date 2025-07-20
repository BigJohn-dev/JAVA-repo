package nokia;

import java.util.Scanner;

public class TonesMenu {
    private Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("Tones Menu:");
        System.out.println("""
                1. Ringing tone \n2. Ringing volume \n3. Incoming call alert \n4. Composer \n5. Message alert tone \n
                6. Keypad tones \n7. Warning and game tones \n8. Vibrating alert \n9. Screen saver
               """);
    }
}
