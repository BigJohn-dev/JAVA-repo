package nokia;

import java.util.Scanner;

public class PhoneBookMenu {
    private final Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("Phone Book Menu:");
        System.out.println("""
            1. Search \n2. Service Nos \n3. Add name \n4. Erase \n5. Edit \n
            6. Assign tone \n7. Send b'card \n8. Options \n9. Speed dials \n10. Voice tags
            """);

        int choice = input.nextInt();
        if (choice == 8) {
            System.out.println("""
                1. Type of view
                2. Memory status
                """);
            }
    }
}