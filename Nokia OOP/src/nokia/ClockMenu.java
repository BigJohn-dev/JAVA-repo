package nokia;

import java.util.Scanner;

public class ClockMenu {
    private final Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("Clock Menu");
        System.out.println("""
                1. Alarm clock \n2. Clock settings \n3. Date setting \n4. Stopwatch \n5. Countdown timer \n
                6. Auto update of date and time
                """);
    }
}
