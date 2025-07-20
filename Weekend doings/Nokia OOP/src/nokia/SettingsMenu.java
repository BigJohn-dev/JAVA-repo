package nokia;

import java.util.Scanner;

public class SettingsMenu {
    private final Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("Settings Menu");
        System.out.println("1. Call settings \n2. Phone settings \n3. Security settings \n4. Restore Factory setting");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Call settings");
                System.out.println("""
                        1. Automatic redial \n2. Speed dialling \n3. Call waiting options \n
                        4. Own number sending \n5. Phone line in use \n6. Automatic answer 
                        """);
                break;

            case 2:
                System.out.println("Phone settings");
                System.out.println("""
                        1. Language \n2. Cell info display \n3. Welcome note \n4. Network selection \n5. Lights2 \n
                        6. Confirm SIM service actions
                        """);
                break;

            case 3:
                System.out.println("Security settings");
                System.out.println("""
                        1. PIN code request \n2. Call barring service \n3. Fixed dialling \n4. Closed user group \n
                        5. Phone security \n6. Change access codes
                """);
                break;

            case 4:
                System.out.println("Restore Factory setting");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
