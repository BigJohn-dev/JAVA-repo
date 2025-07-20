package nokia;

import java.util.Scanner;

public class CallRegisterMenu {
private Scanner input = new Scanner(System.in);

public void display() {
        System.out.println("Call Register Menu:");
        System.out.println("""
                1. Missed Calls \n2. Received Calls \n3. Dialled numbers \n4. Erase recent call list \n
                5. Show call duration \n6. Show call cost \n7. Call cost settings \n8. Prepaid credit
                """);

        int choice = input.nextInt();
        switch (choice) {
        case 5:
                System.out.println("""
                        1. Last call duration \n2. All calls’ duration \n3. Received calls’ duration \n
                        4. Dialled calls’ duration \n5. Clear timers
                        """); break;
        case 6:
                System.out.println("1. Last call cost \n2. All calls’ cost \n3. Clear counters"); break;
        case 7:
                System.out.println("1. Call cost limit \n2. Show costs in"); break;
        default:
                System.out.println("Invalid choice");
        }
}
}

