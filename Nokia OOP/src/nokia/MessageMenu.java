package nokia;

import java.util.Scanner;

public class MessageMenu {
        private final Scanner input = new Scanner(System.in);

        public void display() {
            System.out.println("Message Menu:");

            System.out.println("""
            1. Write messages \n2. Inbox \n3. Outbox \n4. Picture messages \n5. Templates
            6. Smileys \n7. Message settings \n8. Info service \n9. Voice mailbox number \n10. Service command editor
            """);

            int choice = input.nextInt();
            if (choice == 7) {
                System.out.println("""
                1. Set 1
                2. Common
                """);
                int set = input.nextInt();
                if (set == 1) {
                    System.out.println("""
                    1. Message centre number
                    2. Messages sent as
                    3. Message validity
                """);
                } else if (set == 2) {
                    System.out.println("""
                    1. Delivery report
                    2. Reply via same centre
                    3. Character support
                """);
                }
            }
        }
}