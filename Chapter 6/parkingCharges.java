import java.util.Scanner;

public class parkingCharges {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter number of hours your car was at the pack: ");
            int numberOfHours = input.nextInt();

            System.out.println(parkingChargesTest.calculateCharges(numberOfHours));

            System.out.println("Do you want to continue (any number to continue or -1 to quit): ");
            choice = input.nextInt();
        } while (choice != -1);
    }
}