package nokia;

import java.util.Scanner;

public class MainMenu {
    private final Scanner input = new Scanner(System.in);

    public void display() {
        while (true) {
            System.out.println(" _- WELCOME TO YOUR NOKIA PHONE -_ ");
            System.out.println("""
                1. Phone book \n2. Message \n3. Chat \n4. Call register \n5. Tones \n6. Settings
                7. Call divert \n8. Games \n9. Calculator \n10. Reminders \n11. Clock \n12. Profiles
                13. SIM services \n0. Exit
                """);

            int choice = input.nextInt();
            switch (choice) {
                case 1 -> new PhoneBookMenu().display();
                case 2 -> new MessageMenu().display();
                case 3 -> new  ChatMenu().display();
                case 4 -> new CallRegisterMenu().display();
                case 5 -> new TonesMenu().display();
                case 6 -> new SettingsMenu().display();
                case 7 -> new CallDivertMenu().display();
                case 8 -> new  GamesMenu().display();
                case 9 -> new  CalculatorMenu().display();
                case 10 -> new  RemindersMenu().display();
                case 11 -> new ClockMenu().display();
                case 12 -> new ProfilesMenu().display();
                case 13 -> new  SIMServicesMenu().display();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
