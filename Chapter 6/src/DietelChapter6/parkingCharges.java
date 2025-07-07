package DietelChapter6;
import java.util.Scanner;

public class parkingCharges {
        public static void main(String[] var0) {
            Scanner var1 = new Scanner(System.in);

            int var2;
            do {
                System.out.println("Enter number of hours your car was at the pack: ");
                int var3 = var1.nextInt();
                System.out.println(parkingChargesTest.calculateCharges(var3));
                System.out.println("Do you want to continue (0 to continue or -1 to quit): ");
                var2 = var1.nextInt();
            } while(var2 != -1);
        }
}
